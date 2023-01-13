package sql;
//데이터베이스 접속 객체

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends DBConnection{
	public int insert(MemberDTO dto) {
		String sql = "INSERT INTO member set member_name=?, member_age=?, member_tel=?, member_email=?";
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		int result =0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMember_name());
			pstmt.setInt(2, dto.getMember_age());
			pstmt.setString(3, dto.getMember_tel());
			pstmt.setString(4, dto.getMember_email());
			
			//pstmt.execute();
	     result = pstmt.executeUpdate(); //반영된 레코드의 수
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<MemberDTO> list(){ //회원 리스트를 가져오는 메소드
		String sql = "SELECT * FROM member";
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // executeQuery() SELECT 
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setMember_no(rs.getInt("member_no"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_age(rs.getInt("member_age"));
				dto.setMember_email(rs.getString("member_email"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	public int delete(MemberDTO dto) {
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE member_no =? ";
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getMember_no());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(MemberDTO dto) {
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE member SET member_name=?, member_age=?, member_tel=?, member_email=? WHERE member_no=?";
		int result =0;	
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMember_name());
			pstmt.setInt(2, dto.getMember_age());
			pstmt.setString(3, dto.getMember_tel());
			pstmt.setString(4, dto.getMember_email());
			pstmt.setInt(5, dto.getMember_no());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
