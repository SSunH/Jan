package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//자바와 데이터베이스 연결
//정적페이지 ( 바로못바꿈)
//동적페이지 (바로바꾸기가능)

// sql DML 
// select 조회 불러오기.
// insert 저장 
// update 수정
// delete 삭제

public class DB01 {
	public static void main(String[] args) {
		//DB와 연결하기 -> jar와 연결
		Connection con = null;  //접속정보 저장
		Statement stmt = null; //실제 접속정보로 db에서 일 하기
		ResultSet rs = null; // 결과값 저장
		
		String url = "jdbc:mariadb://localhost:3306/poseidon";
		//DB명 꼭 확인
	
		String id = "poseidon";
		String pw = "01234567";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		    con = DriverManager.getConnection(url, id, pw);
		    stmt = con.createStatement();
		    System.out.println("접속 성공입니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
   		} catch (SQLException e) {
   			System.out.println("접속정보에 문제가 있습니다.");
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
