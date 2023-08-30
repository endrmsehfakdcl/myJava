package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SeoulLocationDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private static SeoulLocationDAO dao; // static
	private final String url = "jdbc:mysql://localhost:3306/keduit";
	private final String user = "root";
	private final String pwd = "root";

	private SeoulLocationDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------DriverManager---------------------");
	}

	public void disConnection() {
		try {
			if (pstmt != null)
				pstmt.close();
			if (pstmt != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// static 인 이유는 위에서 static으로 선언해서
	public static SeoulLocationDAO newInstance() {
		if (dao == null) {
			dao = new SeoulLocationDAO();
		}
		return dao;
	}

	// Insert 쿼리문
	public void SeoulLocationInsert(SeoulLocationVO vo) throws SQLException {
		// DB 연결
		getConnection();
		// auto-increment라 null값주고 나머지 6개는 값이 정해지지 않았으므로 ? 표기
		String sql = "insert into seoulLocation values(null,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getTitleInfo());
		pstmt.setString(3, vo.getAddress());
		pstmt.setString(4, vo.getPhone());
		pstmt.setString(5, vo.getInfo());
		pstmt.setString(6, vo.getTraffic());

		int result = pstmt.executeUpdate();
		System.out.println(result);
	}

}
