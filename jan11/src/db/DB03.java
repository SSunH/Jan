package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//저장하기
public class DB03 {
	
	private void insert(int no, String name, String id) {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConn();
		Statement stmt = null;
		String sql = "insert into member values ("+no+",'"+name+"', '"+id+"')";
		
		try {
			stmt = con.createStatement();
			stmt.execute(sql); //저장은 
			System.out.println("저장완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		DB03 db03 = new DB03();
		db03.insert(5, "신기해", "awesome"); //DB02번에서확인
				
	}

}
