package kjh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LectureTest1 {
	public static void lecture() {
		String key = "d07%2FSorIUYvq53lXRMjxXTqLPpBd3Z6bLfSjQMAuOMZMdYvDC%2FGgfDI37VlbjA3yNEDvT5afThFRlMlfZfN7Fw%3D%3D";
		String response = "";

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String userid = "root";
		String pwd = "root";

		try {
			con = DriverManager.getConnection(url, userid, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			String deletequery2 = "truncate table lecture";
			PreparedStatement pstmt4;
			pstmt4 = con.prepareStatement(deletequery2);
			int ret4 = pstmt4.executeUpdate();
			if (ret4 == 0) {
				System.out.println("lecture 테이블 비우기 성공");
			} else {
				System.out.println("lecture 테이블 비우기 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			String checkQuery = "SELECT COUNT(*) FROM users WHERE username = 'admin'";
			PreparedStatement checkStatement = con.prepareStatement(checkQuery);
			ResultSet resultSet = checkStatement.executeQuery();
			resultSet.next();
			int count = resultSet.getInt(1);

			if (count == 0) {
				String userQuery = "INSERT INTO users VALUES ('admin', 'admin')";
				PreparedStatement insertStatement = con.prepareStatement(userQuery);
				int ret = insertStatement.executeUpdate();

				if (ret == 1) {
					System.out.println("아이디 추가 성공");
				} else {
					System.out.println("아이디 추가 실패");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		int page = 1;
		for (page = 1; page <= 20; page++) {
			try {
				URL apiurl = new URL(
						"http://apis.data.go.kr/B552881/kmooc/courseList?ServiceKey=" + key + "&page=" + page);
				BufferedReader bf = new BufferedReader(new InputStreamReader(apiurl.openStream(), "UTF-8"));
				response = bf.readLine();

				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject) jsonParser.parse(response);

				JSONArray results = (JSONArray) jsonObject.get("results");

				for (int i = 0; i < results.size(); i++) {
					JSONObject desc = (JSONObject) results.get(i);
//				System.out.println("--------------------------------------------------------------");
//				System.out.println("강좌 번호 : " + desc.get("number"));
//				System.out.println("강좌주요시간 : " + desc.get("effort"));
//				System.out.println("강좌 시작일 : " + desc.get("start"));
//				System.out.println("수강신청 시작일 :" + desc.get("enrollment_start"));
//				System.out.println("수강신청 종료일 : " + desc.get("enrollment_end"));
//				System.out.println("강좌명 : " + desc.get("name"));
//				System.out.println("강좌 소개 : " + desc.get("short_description"));
//				System.out.println("교수진 : " + desc.get("teachers"));
//				System.out.println("기관명 : " + desc.get("org_name"));
//				System.out.println("주제 분류 : " + desc.get("classfy_name"));
//				System.out.println("주제 소분류 : " + desc.get("middle_classfy_name"));
//				System.out.println("난이도 : " + desc.get("level"));

					String query = "insert into lecture (number, effort, start, enrollment_start, enrollment_end, name, short_description, teachers, org_name, classfy_name, middle_classfy_name, level)"
							+ " values (?,?,?,?,?,?,?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, (String) desc.get("number"));
					pstmt.setString(2, (String) desc.get("effort"));
					pstmt.setString(3, (String) desc.get("start"));
					pstmt.setString(4, (String) desc.get("enrollment_start"));
					pstmt.setString(5, (String) desc.get("enrollment_end"));
					pstmt.setString(6, (String) desc.get("name"));
					pstmt.setString(7, (String) desc.get("short_description"));
					pstmt.setString(8, (String) desc.get("teachers"));
					pstmt.setString(9, (String) desc.get("org_name"));
					pstmt.setString(10, (String) desc.get("classfy_name"));
					pstmt.setString(11, (String) desc.get("middle_classfy_name"));
					pstmt.setString(12, (String) desc.get("level"));
					int ret = pstmt.executeUpdate();
					if (ret == 1) {
						System.out.println("데이터 추가 성공 : " + (String) desc.get("name"));
					} else {
						System.out.println("데이터 추가 실패");
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
