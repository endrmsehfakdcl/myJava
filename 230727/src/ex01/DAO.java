package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private static DAO dao; // static
	private final String url = "jdbc:mysql://localhost:3306/keduit";
	private final String user = "root";
	private final String pwd = "root";

	private DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*****************getConnection()*******************");
	}

	public void disConnection() {
		try {
			if (pstmt != null)
				pstmt.close();
			if (pstmt != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DAO newInstance() {
		if (dao == null) {
			dao = new DAO();
		}

		return dao;
	}

	public void Insert(VO vo) throws SQLException {
		getConnection();
		String sql = "insert into test values(null, ?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, vo.getYear());
		pstmt.setInt(2, vo.getRanking());
		pstmt.setString(3, vo.getTeamname());
		pstmt.setInt(4, vo.getMatches());
		pstmt.setInt(5, vo.getWin());
		pstmt.setInt(6, vo.getLose());
		pstmt.setInt(7, vo.getTie());
		pstmt.setFloat(8, vo.getPercentage());
		pstmt.executeUpdate();
		System.out.println("*****************Insert(VO vo)*******************");
	}
}

/*
 * private int no; => ai private int year; private int ranking; private String
 * teamname; private int matches; private int win; private int lose; private int
 * tie; private float percentage;
 */
