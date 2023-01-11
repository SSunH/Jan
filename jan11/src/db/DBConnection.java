package db;
//이제 접속정보를 여기서 가져오겠습니다.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
   //접속 정보 가져오는 메소드 
    public Connection getConn() {
    	Connection con = null;  //접속정보 저장
		Statement stmt = null; //실제 접속정보로 db에서 일 하기
		ResultSet rs = null; // 결과값 저장
		
		String url = "jdbc:mariadb://localhost:3306/poseidon";
	
		String id = "poseidon";
		String pw = "01234567";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
    	
    }












}
