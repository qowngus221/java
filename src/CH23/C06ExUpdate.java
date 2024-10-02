package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06ExUpdate {

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
			
			pstmt =  conn.prepareStatement("update tbl_sample set 정책용어=? where 해외사례=?");
			pstmt.setString(1,"멍청이");
			pstmt.setString(2,"대구");
			
		
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("UPDATE 성공");
			else
				System.out.println("UPDATE 실패");
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
