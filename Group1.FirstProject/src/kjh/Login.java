package kjh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//https://apis.data.go.kr/B552881/kmooc/courseList?ServiceKey=d07/SorIUYvq53lXRMjxXTqLPpBd3Z6bLfSjQMAuOMZMdYvDC/GgfDI37VlbjA3yNEDvT5afThFRlMlfZfN7Fw==&page=1

public class Login {

	static Connection con;
	static String url = "jdbc:mysql://localhost:3306/mydb";
	static String userid = "root";
	static String pwd = "root";
	static Scanner scanner = new Scanner(System.in);

	public static void loginRun() {

		LectureTest1.lecture();

		System.out.print("Username : ");
		String username = scanner.nextLine();
		System.out.print("Password : ");
		String password = scanner.nextLine();

		try {
			con = DriverManager.getConnection(url, userid, pwd);
			String loginQuery = "select * from users where username = ? and password = ?";
			PreparedStatement pstmt = con.prepareStatement(loginQuery);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet resultSet = pstmt.executeQuery();
			if (resultSet.next()) {
				System.out.println("로그인 성공");
				if (username.equals("admin")) {
					adminMenu();
				} else {
					userMenu();
				}
			} else {
				System.out.println("로그인 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void adminMenu() {
		boolean menuOff = false;
		while (!menuOff) {
			System.out.println("┌───────────────┐");
			System.out.println("│1. 강좌 조회     │");
			System.out.println("│2. 특정 강좌 조회 │");
			System.out.println("│3. 강좌 추가     │");
			System.out.println("│4. 강좌 삭제     │");
			System.out.println("│5. 계정 조회     │");
			System.out.println("│6. 계정 추가     │");
			System.out.println("│7. 계정 삭제     │");
			System.out.println("│0. 종료         │");
			System.out.println("└───────────────┘");

			System.out.print("메뉴를 선택하세요 : ");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				// 강의 조회
				showLecture();
				break;
			case 2:
				// 특정 강의 조회
				showSpecificLecture();
				break;
			case 3:
				// 강의 추가
				addLecture();
				break;
			case 4:
				// 강의 삭제
				deleteLecture();
				break;
			case 5:
				// 계정 조회
				showAccount();
				break;
			case 6:
				// 계정 추가
				addAccount();
				break;
			case 7:
				// 계정 삭제
				deleteAccount();
				break;
			case 0:
				// 종료
				menuOff = true;
				System.out.println("메뉴 종료");
				break;
			default:
				System.out.println("다시 선택해주세요");
				break;
			}
		}
	}

	public static void userMenu() {
		boolean menuOff = false;
		while (!menuOff) {
			System.out.println("┌───────────────┐");
			System.out.println("│1. 강좌 조회     │");
			System.out.println("│2. 특정 강좌 조회 │");
			System.out.println("│0. 종료         │");
			System.out.println("└───────────────┘");

			System.out.print("메뉴를 선택하세요 : ");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				// 강의 조회
				showLecture();
				break;
			case 2:
				// 특정 강의 조회
				showSpecificLecture();
				break;
			case 0:
				// 종료
				menuOff = true;
				System.out.println("메뉴 종료");
				break;
			default:
				System.out.println("다시 선택해주세요");
				break;
			}
		}
	}

	public static void showSpecificLecture() {
		System.out.println("특정 강좌를 조회합니다.");

		System.out.println("┌───────────────┐");
		System.out.println("│1. 날짜 조회     │");
		System.out.println("│2. 강좌명 조회    │");
		System.out.println("│3. 교수진 조회    │");
		System.out.println("│4. 기관명 조회    │");
		System.out.println("│5. 소주제분류 조회 │");
		System.out.println("│6. 난이도 조회    │");
		System.out.println("└───────────────┘");

		System.out.print("메뉴를 선택하세요 : ");
		int menu = scanner.nextInt();
//		int menu2 = Integer.parseInt(menu);

		switch (menu) {
		case 1:
			// 날짜 조회
			showSpecificLectureStart();
			break;
		case 2:
			// 강좌명 조회
			showSpecificLectureName();
			break;
		case 3:
			// 교수진 조회
			showSpecificLectureTeachers();
			break;
		case 4:
			// 기관명 조회
			showSpecificLectureOrgName();
			;
			break;
		case 5:
			// 소주제분류 조회
			showSpecificLectureClassfyName();
			break;
		case 6:
			// 난이도 조회
			showSpecificLectureLevel();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			showSpecificLecture();
			break;
		}
	}

	public static void showSpecificLectureLevel() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 난이도를 입력하세요 : ");
			String temp = scanner.nextLine();
			String specName = temp;
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where level = ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void showSpecificLectureClassfyName() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 주제분류를 입력하세요 : ");
			String temp = scanner.nextLine();
			String specName = "%" + temp + "%";
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where classfy_name like ? or middle_classfy_name like ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);
			pstmt.setString(2, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showSpecificLectureOrgName() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 기관명을 입력하세요 : ");
			String temp = scanner.nextLine();
			String specName = "%" + temp + "%";
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where org_name like ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showSpecificLectureTeachers() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 교수진의 이름을 입력하세요 : ");
			String temp = scanner.nextLine();
			String specName = "%" + temp + "%";
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where teachers like ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showSpecificLectureStart() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 년도 혹은 달을 입력하세요 (ex : 2022-10) : ");
			String temp = scanner.nextLine();
			String specName = "%" + temp + "%";
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where start like ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showSpecificLectureName() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("검색하실 강좌명을 입력하세요 : ");
			String temp = scanner.nextLine();
			String specName = "%" + temp + "%";
			con = DriverManager.getConnection(url, userid, pwd);
			String showSpecificLectureQuery = "select * from lecture where name like ?";
			PreparedStatement pstmt = con.prepareStatement(showSpecificLectureQuery);
			pstmt.setString(1, specName);

			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
				System.out.println(
						"──────────────────────────────────────────────────────────────────────────────────────"
								+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort
								+ "\n강좌 시작일 : " + start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : "
								+ enrollment_end + "\n강좌명 : " + name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : "
								+ teachers + "\n기관명 : " + org_name + "\n주제 분류 : " + classfy_name + "\n주제 소분류 : "
								+ middle_classfy_name + "\n난이도 : " + level);
			}
			System.out
					.println("──────────────────────────────────────────────────────────────────────────────────────");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deleteAccount() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("계정을 삭제합니다.");

		try {
			System.out.print("삭제할 계정을 입력하세요 : ");
			String username = scanner.nextLine();
			con = DriverManager.getConnection(url, userid, pwd);
			String deleteAccountQuery = "delete from users where username = ?";
			PreparedStatement pstmt = con.prepareStatement(deleteAccountQuery);
			pstmt.setString(1, username);
			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println("계정을 삭제했습니다.");
			} else {
				System.out.println("계정를 삭제하는데 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void addAccount() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("계정을 추가합니다");
		try {
			System.out.print("username을 입력하세요 : ");
			String username = scanner.nextLine();
			System.out.print("password를 입력하세요 : ");
			String password = scanner.nextLine();
			con = DriverManager.getConnection(url, userid, pwd);
			String addAccountQuery = "insert into users (username, password) values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(addAccountQuery);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println(username + " 계정을 추가했습니다.");
			} else {
				System.out.println("계정을 추가하는데 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showAccount() {

		System.out.println("계정을 조회합니다.");
		try {
			con = DriverManager.getConnection(url, userid, pwd);
			String showAccountQuery = "select * from users";
			PreparedStatement pstmt = con.prepareStatement(showAccountQuery);
			ResultSet resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				System.out.println("username : " + username + " password : " + password.hashCode());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void deleteLecture() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("강좌를 삭제합니다.");

		try {
			System.out.print("삭제할 강좌목록을 입력하세요 : ");
			String PrimaryNum = scanner.nextLine();
			con = DriverManager.getConnection(url, userid, pwd);
			String deleteLectureQuery = "delete from lecture where PrimaryNum = ?";
			PreparedStatement pstmt = con.prepareStatement(deleteLectureQuery);
			pstmt.setString(1, PrimaryNum);
			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println("강좌를 삭제했습니다.");
			} else {
				System.out.println("강좌를 삭제하는데 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void addLecture() {
		System.out.println("강좌를 추가합니다.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			con = DriverManager.getConnection(url, userid, pwd);
			String addLectureQuery = "insert into lecture (number, effort, start, enrollment_start, enrollment_end, name, short_description, teachers, org_name, classfy_name, middle_classfy_name, level)"
					+ " values (?,?,?,?,?,?,?,?,?,?,?,?)";
			System.out.print("강좌 번호를 입력하세요 : ");
			String number = scanner.nextLine();
			System.out.print("강좌주요시간을 입력하세요 : ");
			String effort = scanner.nextLine();
			System.out.print("강좌 시작일 입력하세요 : ");
			String start = scanner.nextLine();
			System.out.print("수강신청 시작일을 입력하세요 : ");
			String enrollment_start = scanner.nextLine();
			System.out.print("수강신청 종료일을 입력하세요 : ");
			String enrollment_end = scanner.nextLine();
			System.out.print("강좌명을 입력하세요 : ");
			String name = scanner.nextLine();
			System.out.print("강좌의 짧은 소개를 입력하세요 : ");
			String short_description = scanner.nextLine();
			System.out.print("교수진을 입력하세요 : ");
			String teachers = scanner.nextLine();
			System.out.print("기관명을 입력하세요 : ");
			String org_name = scanner.nextLine();
			System.out.print("주제 분류를 입력하세요 : ");
			String classfy_name = scanner.nextLine();
			System.out.print("주제 소분류를 입력하세요 : ");
			String middle_classfy_name = scanner.nextLine();
			System.out.print("난이도를 입력하세요 : ");
			String level = scanner.nextLine();
			PreparedStatement pstmt = con.prepareStatement(addLectureQuery);
			pstmt.setString(1, number);
			pstmt.setString(2, effort);
			pstmt.setString(3, start);
			pstmt.setString(4, enrollment_start);
			pstmt.setString(5, enrollment_end);
			pstmt.setString(6, name);
			pstmt.setString(7, short_description);
			pstmt.setString(8, teachers);
			pstmt.setString(9, org_name);
			pstmt.setString(10, classfy_name);
			pstmt.setString(11, middle_classfy_name);
			pstmt.setString(12, level);

			int ret = pstmt.executeUpdate();
			if (ret == 1) {
				System.out.println(name + " 강좌를 추가했습니다.");
			} else {
				System.out.println("강좌를 추가하는데 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void showLecture() {

		System.out.println("강좌를 조회합니다.");

		try {
			con = DriverManager.getConnection(url, userid, pwd);
			String showLectureQuery = "select * from lecture";
			PreparedStatement pstmt = con.prepareStatement(showLectureQuery);
			ResultSet resultSet = pstmt.executeQuery();
			System.out.println("┌──────┬" + "─".repeat(13) + "┬" + "─".repeat(15) + "┬" + "─".repeat(12) + "┬"
					+ "─".repeat(12) + "┬" + "─".repeat(12) + "┬" + "─".repeat(20) + "────" + "┬" + "─".repeat(15)
					+ "──" + "┬" + "─".repeat(15) + "────" + "┬" + "──────" + "┬" + "────" + "┐");
			System.out.println(
					"│강좌목록│  강좌번호      │   강좌주요시간   │  강좌시작일   │ 수강신청시작일 │ 수강신청종료일 │       강좌명             │     교수진       │     기관명          │주제분류│난이도│");
			System.out.println("├──────┼" + "─".repeat(13) + "┼" + "─".repeat(15) + "┼" + "─".repeat(12) + "┼"
					+ "─".repeat(12) + "┼" + "─".repeat(12) + "┼" + "─".repeat(20) + "────" + "┼" + "─".repeat(15)
					+ "──" + "┼" + "─".repeat(15) + "────" + "┼" + "──────" + "┼" + "────" + "┤");
			while (resultSet.next()) {
				String PrimaryNum = resultSet.getString("PrimaryNum");
				String number = resultSet.getString("number");
				String effort = resultSet.getString("effort");
				String start = resultSet.getString("start");
				String enrollment_start = resultSet.getString("enrollment_start");
				String enrollment_end = resultSet.getString("enrollment_end");
				String name = resultSet.getString("name");
//				String short_description = resultSet.getString("short_description");
				String teachers = resultSet.getString("teachers");
				String org_name = resultSet.getString("org_name");
				String classfy_name = resultSet.getString("classfy_name");
//				String middle_classfy_name = resultSet.getString("middle_classfy_name");
				String level = resultSet.getString("level");
//				System.out.println("\n-------------------------------------------------------------------------"
//						+ "\n강좌목록 : " + PrimaryNum + "\n강좌번호 : " + number + "\n강좌주요시간 : " + effort + "\n강좌 시작일 : "
//						+ start + "\n수강신청 시작일 : " + enrollment_start + "\n수강신청 종료일 : " + enrollment_end + "\n강좌명 : "
//						+ name + "\n강좌 짧은 소개 : " + short_description + "\n교수진 : " + teachers + "\n기관명 : " + org_name
//						+ "\n주제 분류 : " + classfy_name + "\n주제 소분류 : " + middle_classfy_name + "\n난이도 : " + level);

				System.out.println("│ " + String.format("%4s", PrimaryNum) + " │ "
						+ String.format("%-11s", number.length() > 8 ? number.substring(0, 8) + "..." : number) + " │ "
						+ String.format("%-13s", effort.length() > 10 ? effort.substring(0, 10) + "..." : effort)
						+ " │ " + String.format("%10s", start.length() > 10 ? start.substring(0, 10) : start) + " │ "
						+ String.format("%10s",
								enrollment_start.length() > 10 ? enrollment_start.substring(0, 10) : enrollment_start)
						+ " │ "
						+ String.format("%10s",
								enrollment_end.length() > 10 ? enrollment_end.substring(0, 10) : enrollment_end)
						+ " │ " + String.format("%-18s", name.length() > 15 ? name.substring(0, 14) + "..." : name)
						+ " │ "
						+ String.format("%-13s", teachers.length() > 10 ? teachers.substring(0, 9) + "..." : teachers)
						+ " │ "
						+ String.format("%-13s", org_name.length() > 10 ? org_name.substring(0, 9) + "..." : org_name)
						+ " │ " + String.format("%-3s", classfy_name) + " │ " + String.format("%-2s", level) + " │");
			}
			System.out.println("└──────┴" + "─".repeat(13) + "┴" + "─".repeat(15) + "┴" + "─".repeat(12) + "┴"
					+ "─".repeat(12) + "┴" + "─".repeat(12) + "┴" + "─".repeat(20) + "────" + "┴" + "─".repeat(15)
					+ "──" + "┴" + "─".repeat(15) + "──" + "┴" + "──────" + "┴" + "────" + "┘");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
