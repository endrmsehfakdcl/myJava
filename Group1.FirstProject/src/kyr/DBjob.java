package kyr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DBjob {
	private Connection con;
	public final String ISTRASHBAG = "isTrashBag"; // 종량제봉투취급여부
	public final String ISGARBAG = "isGarBag"; // 음식물납부필증(가정용)취급여부
	public final String ISGARBAG_LARGE = "isGarbage_large"; // 음식물납부필증(120L)취급여부
	public final String ISWASTE_STICKER = "isWaste_Sticker"; // 대형폐기스티커취급여부
	public final String ISSPECIAL_ENVELOPE = "isSpecial_envelope"; // 특수규격봉투취급여부
	public final String SELLER_ADDR = "seller_addr"; // 주소로 검색
	public final int PER_MAX_COUNT = 15; // 페이지당 쿼리 갯수
	
	String url = "jdbc:mysql://localhost:3306/mydb";
	String userid = "root";
	String pwd = "root";
	
	public DBjob() {
		try {
//			Class.forName(driver); // jdbc 4.0 이후에는 자동으로 가져와서 불필요
			System.out.println("드라이버 로드 성공");
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("드라이버 연결 성공...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initDbRun() {
		int dataCnt = 0;
		URL url = null;
		String readLine = null;
		String result = null;
		StringBuilder buffer = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		HttpURLConnection urlConnection = null;

		int connTimeout = 5000;
		int readTimeout = 3000;

		String apiUrl = "http://api.odcloud.kr/api/15094978/v1/uddi:8cf61b3d-3f3e-4ed1-9c74-e2b4711c73c7?page=1&perPage=791"; // 각자 상황에 맞는 IP & url 사용
		String key = "d2G3GCD43pCx63NYorgTo%2Fb2U3GkiLYtFNegCf%2BCuL2Xv7SHQR5NJy%2B6MkMZgodkfanMSC%2BgFK28wnQYillMWQ%3D%3D";
		
		try {
			url = new URL(apiUrl + "&serviceKey=" + key);
			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.setConnectTimeout(connTimeout);
			urlConnection.setReadTimeout(readTimeout);
			urlConnection.setRequestProperty("Accept", "application/json;");

			bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
			
			if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				result = bufferedReader.readLine(); // 한 줄씩 가져오기
				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
				JSONArray data2 = (JSONArray)jsonObject.get("data");
				
				String perPage = jsonObject.get("perPage").toString();
				String currentCount = jsonObject.get("currentCount").toString();
				String matchCount = jsonObject.get("matchCount").toString();
				String page = jsonObject.get("page").toString();
				String totalCount = jsonObject.get("totalCount").toString();
				
				for (int i = 0; i < data2.size(); i++) {
					JSONObject info = (JSONObject)data2.get(i);
					// DB로 insert 하기
					Seller seller = new Seller();
					seller.setSeller(info.get("판매처명").toString());
					seller.setSellerAddr(info.get("도로명 주소").toString());
					seller.setZipCode(info.get("우편번호").toString());
					seller.setIsWasteSticker(info.get("대형폐기물스티커취급여부").toString().toUpperCase());
					seller.setIsSpecialEnvelope(info.get("특수규격봉투취급여부").toString().toUpperCase());
					seller.setIsGarBag(info.get("음식물납부필증(가정용)취급여부").toString().toUpperCase());
					seller.setIsGarbageLarge(info.get("음식물납부필증(120L)취급여부").toString().toUpperCase());
					seller.setIsTrashBag(info.get("종량제봉투취급여부").toString().toUpperCase());// trash 일반 쓰레기
					seller.setBaseDate(info.get("데이터기준일자").toString());
					  
					if(insertSeller(seller) > 0)
						dataCnt++;
//					if(dataCnt <= 50)
//						System.out.print("=");
					if(dataCnt == Integer.parseInt(totalCount)) {
						System.out.println("\n데이터베이스 업데이트 완료!!!");
					}
				}
			} else {
				buffer.append("code : ");
				buffer.append(urlConnection.getResponseCode()).append("\n");
				buffer.append("message : ");
				buffer.append(urlConnection.getResponseMessage()).append("\n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public int insertSeller(Seller seller) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs;
			
			String query = "insert into wasteinfo("
					+ "seller,"
					+ "seller_addr,"
					+ "zip_code,"
					+ "isTrashBag,"
					+ "isGarBag,"
					+ "isGarbage_large,"
					+ "isWaste_Sticker,"
					+ "isSpecial_envelope,"
					+ "baseDate"
					+ ") values ('"
					+ seller.getSeller() + "','"
					+ seller.getSellerAddr() + "','"
					+ seller.getZipCode() + "','"
					+ seller.getIsTrashBag() + "','"
					+ seller.getIsGarBag() + "','"
					+ seller.getIsGarbageLarge() + "','"
					+ seller.getIsWasteSticker() + "','"
					+ seller.getIsSpecialEnvelope() + "', str_to_date('"
					+ seller.getBaseDate()
					+ "', '%Y-%m-%d'));";
			
			stmt.execute(query);
			
			System.out.println(seller.getSeller() + " 판매처 등록이 완료되었습니다.");
			return stmt.getUpdateCount(); // 쿼리 결과 가지고 있음
//			ps.setString(1, rs.getString(cnt));
//			ps.setString(2, rs.getString(cnt));
			
//			System.out.println("db  rs : " +  rs);
//			
//			while(rs.next()) {
//				System.out.print("\t" + rs.getString(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int modifySeller(Seller seller, String searchName) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs;
			
			String query = "update wasteinfo set "
					+ "seller = '" + seller.getSeller()
					+ "', seller_addr = '" + seller.getSellerAddr()
					+ "', zip_code = '" + seller.getZipCode()
					+ "', isTrashBag = '" + seller.getIsTrashBag()
					+ "', isGarBag = '" + seller.getIsGarBag()
					+ "', isGarbage_large = '" + seller.getIsGarbageLarge()
					+ "', isWaste_Sticker = '" + seller.getIsWasteSticker()
					+ "', isSpecial_envelope = '" + seller.getIsSpecialEnvelope()
					+ "', baseDate = str_to_date('" + Date.valueOf(LocalDate.now().toString())
					+ "', '%Y-%m-%d')"
					+ " where seller = '" + searchName +"';";
			
			stmt.execute(query);
			int row = stmt.getUpdateCount();
			
//			if(row > 0) {
				System.err.println(seller.getSeller() + " 판매처 수정이 완료되었습니다.");
//			} 
			
			return row; // 쿼리 결과 가지고 있음
//			ps.setString(1, rs.getString(cnt));
//			ps.setString(2, rs.getString(cnt));
			
//			System.out.println("db  rs : " +  rs);
//			
//			while(rs.next()) {
//				System.out.print("\t" + rs.getString(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void deleteSeller(String sellerName) {
		String query = "delete from wasteinfo where seller = '" + sellerName + "';";
		Statement stmt;
		try {
			stmt = con.createStatement();
			int row = stmt.executeUpdate(query);
			System.err.println(sellerName + " 판매처를 삭제했습니다. 삭제(" + row + "건)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteSellerAll() {
		String query = "delete from wasteinfo;";
		Statement stmt;
		try {
			stmt = con.createStatement();
			int cnt = stmt.executeUpdate(query);
			System.err.println(cnt + "건이 삭제 되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Seller> searchData(String whereColumn, int page, String sql) {
		int numCount = 1;
		
		String query = "select seller, seller_addr, zip_code, isTrashBag, isGarBag, "
				+ "isGarbage_large, isWaste_Sticker, isSpecial_envelope, baseDate "
				+ "from wasteinfo ";
		String sqlYn = "where " + whereColumn + "='Y'; ";
				//+ "limit " + (page * PER_MAX_COUNT) + ", " + PER_MAX_COUNT + ";";
		List<Seller> listS = new ArrayList<>();

		try {
			Statement stmt = con.createStatement();
			ResultSet rs;
			if(sql.equals("")) {
				rs = stmt.executeQuery(query + sqlYn); // 쿼리 결과 가지고 있음
			} else {
				rs = stmt.executeQuery(query + sql);
			}
			
			while(rs.next()) {
				Seller seller = new Seller();
				
				seller.setSeller(rs.getString(1));
				seller.setSellerAddr(rs.getString(2));
				seller.setZipCode(rs.getString(3));
				seller.setIsTrashBag(rs.getString(4));
				seller.setIsGarBag(rs.getString(5));
				seller.setIsGarbageLarge(rs.getString(6));
				seller.setIsWasteSticker(rs.getString(7));
				seller.setIsSpecialEnvelope(rs.getString(8));
				seller.setBaseDate(LocalDate.now());
				
				listS.add(seller);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listS;
	}
}
