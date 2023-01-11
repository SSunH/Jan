package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBConnection
public class DB02 {
	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.getConn(); //접속정보
		Statement stmt = null; //실제 일하는 녀석
		String sql = "SELECT * FROM member"; // 쿼리문장
		ResultSet rs = null; // 결과값
		
		try {
			stmt = conn.createStatement();
			  rs = stmt.executeQuery(sql); //결과값 나오는 메소드 
			  //출력
			  while (rs.next()) { //rs에 결과값이 있다면
				  int number = rs.getInt(1);
				  String name = rs.getString(2);
				  String id = rs.getString(3);
				  System.out.printf("%d \t %s \t %s \n",number,name,id);
				
			}
			  
		} catch (SQLException e) {
		      e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();  // conn -> stmt -> rs 
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
