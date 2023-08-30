package kyj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CrCenterList {
	static Connection con;
	Scanner scanner = new Scanner(System.in);

	public CrCenterList() {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";

		try {
			con = DriverManager.getConnection(url, username, password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
			System.out.println("데이터베이스 연결 준비...");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("데이터베이스 연결 성공");
			e.printStackTrace();
		}
	} 

	public void insertCenter(String stcode, String crname, String craddr, String crtel, String crfax, String crhome) {
		String sql = "INSERT INTO crcenter (stcode, crname, craddr, crtel, crfax, crhome)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, stcode);
			pstmt.setString(2, crname);
			pstmt.setString(3, craddr);
			pstmt.setString(4, crtel);
			pstmt.setString(5, crfax);
			pstmt.setString(6, crhome);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void loadDataFromJson(String jsonFilePath) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject;

			FileReader jsonfileStream = new FileReader(jsonFilePath);
			BufferedReader reader = new BufferedReader(jsonfileStream);
			jsonObject = (JSONObject) jsonParser.parse(reader);
			JSONObject crCenter = (JSONObject) jsonObject.get("response");
			JSONArray centerArray = (JSONArray) crCenter.get("item");

			for (int i = 0; i < centerArray.size(); i++) {
				JSONObject centerItem = (JSONObject) centerArray.get(i);
				String stcode = (String.valueOf(centerItem.get("stcode")));
				String crname = (String.valueOf(centerItem.get("crname")));
				String craddr = (String.valueOf(centerItem.get("craddr")));
				String crtel = (String.valueOf(centerItem.get("crtel")));
				String crfax = (String.valueOf(centerItem.get("crfax")));
				String crhome = (String.valueOf(centerItem.get("crhome")));

				insertCenter(stcode, crname, craddr, crtel, crfax, crhome);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sqlRun() {
		try {
			String query = "SELECT * FROM crcenter";
			Statement stmt;
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.printf("%-20s %-20s %-20s %-20s%n", "어린이집 명", "주소", "번호", "홈페이지 주소");

			while (rs.next()) {
				System.out.printf("%-13s %-20s %-20s %-20s%n", rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void crPrint(String query) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.printf("%-20s %-20s %-20s %-20s%n", "어린이집 명", "주소", "번호", "홈페이지 주소");
			while (rs.next()) {
				System.out.printf("%-13s %-20s %-20s %-20s%n", rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 어린이집 이름 검색
	public void crnameSearch(String keyword) {
		System.out.println(keyword + " 어린이집 검색중 ... ");
		String query = "SELECT * FROM crcenter WHERE crname LIKE '%" + keyword + "%'; ";
		crPrint(query);
	}

	// 지역 검색
	public void craddrSearch(String keyword) {
		if (keyword == null) {
			System.out.println("검색어를 다시 입력해주세요.");
			return;
		}
		System.out.println(keyword + "지역 어린이집 검색중 ... ");
		String query = "select * from crcenter where craddr like '%" + keyword + "%'; ";
		crPrint(query);
	}

	// 어린이집 정보 추가
	public void insert() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// 사용자로부터 수정할 정보 입력 받음
		System.out.print("등록할 어린이집 시설코드를 입력하세요: ");
		String stcode = scanner.nextLine();

		System.out.print("등록할 어린이집 이름을 입력하세요: ");
		String crname = scanner.nextLine();

		System.out.print("등록할 어린이집 주소를 입력하세요: ");
		String craddr = scanner.nextLine();

		System.out.print("등록할 어린이집 전화번호를 입력하세요: ");
		String crtel = scanner.nextLine();

		System.out.print("등록할 어린이집 팩스번호를 입력하세요: ");
		String crfax = scanner.nextLine();

		System.out.print("등록할 어린이집 홈페이지 주소 입력하세요: ");
		String crhome = scanner.nextLine();

		// 사용자로부터 확인
		System.out.println("어린이집의 정보를 추가하겠습니까?? (Y/N)");
		String input = scanner.nextLine();

		if (input.equalsIgnoreCase("Y")) {
			// 입력받은 정보로 고객 정보를 수정
			String sql = "INSERT INTO crcenter (stcode, crname, craddr, crtel, crfax, crhome)"
					+ " VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement pstmt = null;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, stcode);
				pstmt.setString(2, crname);
				pstmt.setString(3, craddr);
				pstmt.setString(4, crtel);
				pstmt.setString(5, crfax); 
				pstmt.setString(6, crhome);
				pstmt.executeUpdate();

				System.out.println("어린이집의 정보가 추가되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 어린이집 정보 삭제
	public void crdelete(String key) {
		System.out.println("시설 코드 " + key + " 검색중 ... ");
		String query = "SELECT * FROM crcenter WHERE STCODE LIKE '" + key + "'; ";
		crPrint(query);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Statement stmt;

		try {
			System.out.println(" 어린이집 정보를 삭제하시겠습니까? (Y/N)");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("Y")) {
				stmt = con.createStatement();
				String delete = "delete from crcenter where stcode = " + key + ";";
				stmt.executeUpdate(delete);

				System.out.println("정보가 삭제되었습니다.");
			} else {
				System.out.println("정보 삭제가 취소되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 어린이집 정보 수정
	public void modify(String key) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			String delete = "delete from crcenter where stcode = " + key + ";";
			stmt.executeUpdate(delete);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		insert();

	}

	public boolean login(String id,String pw) {
		
		String sql = "select id, pw from users where id like '"+id+"' and pw like '"+pw+"' ;";
		try {
			String userid = "";
			Statement pstmt;
			pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(sql);
			rs.next();
//			System.out.println(rs.getString("id"));
			userid = rs.getString("id");
			if(id.equals(userid)) {
				System.out.println("로그인에 성공했습니다.");
				return true;
			}
			else { 
				return false;
			}
		}
		 catch (SQLException e) {
			 System.out.println("입력한 아이디가 없습니다.");
			 return false;
		}
	}
	
	public boolean counti() {
		CrCenterList crCenterList = new CrCenterList();
		int idCount = 5;
		int wrongAttempts = 0;

		for (int attempt = 1; attempt <= idCount; attempt++) {
			System.out.print("아이디를 입력하세요.: ");
			String userid = scanner.nextLine();
			System.out.print("비번을 입력하세요.: ");
			String userpw = scanner.nextLine();
			boolean ismater = crCenterList.login(userid, userpw);
			
			if (ismater == false) {
				System.out.println("다시 입력해주세요. (" + attempt + "/" + idCount + ")");
				wrongAttempts++;
			} else {
				return true;
			}
		}
		if (wrongAttempts == idCount) {
			System.out.println(wrongAttempts + "회 틀리셨습니다. 검색을 종료합니다.");
			return false;
		}
		return false;
		
	}

	public void check(String id, String pw) {
		String sql = "select id, pw from users where id like '" + id + "' and pw like '" + pw + "' ;";

		try {
			String userid = "";
			Statement pstmt;
			pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("id"));
				userid = rs.getString("id");
			}
			System.out.println(userid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



}
