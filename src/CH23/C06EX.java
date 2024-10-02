package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06EX {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Succedss...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNETEd...");
			
			pstmt =  conn.prepareStatement("insert into tbl_sample values(?,?,?,?,?,?,?)");
			pstmt.setString(1,"대구");
			pstmt.setString(2,"배주현");
			pstmt.setString(3,"부산");
			pstmt.setString(4,"울산");
			pstmt.setString(5,"서울");
			pstmt.setString(6,"인천");
			pstmt.setString(7,"미국");
		
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("INSERT 성공");
			else
				System.out.println("INSERT 실패");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
