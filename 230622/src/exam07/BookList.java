package exam07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con;

	public BookList() {
		String Driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/madang";
		String userid = "root";
		String pwd = "root";

//		Referenced Libraries에 이미 jar파일로 받았으니 생략해도 JVM이 알아서 처리함
//		try {
//			Class.forName(Driver);
//			System.out.println("드라이버 로드 성공");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		try {
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlRun() {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			// ResultSet은 Cursor의 역할 + rs.getInt는 Fetch
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("  BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE ");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t\t" + rs.getInt(4));
			}

//			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void Insert() {
		String query = "insert into book (bookid, bookname, publisher, price)" + " values(30,'임꺽정 전기', '관악출판사', 25000)";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			if (result == 1) {
				System.out.println("레코드 추가 성공, 30");
			} else {
				System.out.println("레코드 추가 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void InsertBook(Book book) {
		int bookid = book.getBookid();
		String bookname = book.getBookname();
		String publisher = book.getPublisher();
		int price = book.getPrice();

		String sql = "insert into book (bookid, bookname, publisher, price)" + " values (?,?,?,?)";
		try {
			// values (?,?,?,?)
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("레코드 추가 성공, " + bookid);
			} else {
				System.out.println("레코드 추가 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void DeleteBook(int bookid) {
		String sql = "delete from book where bookid = " + bookid;
		try (Statement stmt = con.createStatement()) {
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("레코드 삭제 성공, " + bookid);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		BookList so = new BookList();
		so.sqlRun();
		so.Insert();
		Book book = new Book(31, "데이터베이스", "한정교출판사", 30000);
		so.InsertBook(book);
		so.sqlRun();
		so.DeleteBook(31);
		so.DeleteBook(30);
		so.sqlRun();
	}
}
