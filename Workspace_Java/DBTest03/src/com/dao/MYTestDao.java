package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MYTestDto;





//data access object : db와 접근하는 객체. > syso. 안찍는다 
//import static : class.method 하고 호출 할 때, class 생략 가능 하게 해준다.(JDBCTemplate.* : 모든 메소드)  
public class MYTestDao {

	//전체출력메소드 
	
	public List<MYTestDto> selectList(){
		//1.2.
		//Connection con = JDBCTemplate.getConnention(); 해야되는데 임포트 해준 덕분에 클래스를 빼고 쓸수 있게된것 
		Connection con = getConnection(); // jdbc 어쩌고는 원래 dao에 있어야 하는것인데 공통으로 겹치는 것들을 따로 빼서 만들었다 그래서 dao에서 다시 호출해준것
		String sql = " SELECT MNO, MNAME, NICKNAME "
				    + " FROM MYTEST" ; // db에 요청해서 응답받을 값들을  List에 저장한다 
		Statement stmt = null;
		ResultSet rs = null;
		List<MYTestDto> list = new ArrayList<MYTestDto>();
		
		//3. 
		try {
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MYTestDto temp = new MYTestDto(); //마이테스트 디티오는 여기서 가져온 mno,mname,nickname 이렇게 한줄 
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));
				
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. 
			close(rs);
			close(stmt);
			close(con);
		}
		
		
		return list;
	}
	
	//insert
	public int insert(MYTestDto dto) {
		
		
		Connection con = getConnection();
		String sql = " INSERT INTO MYTEST "
				+ " VALUES(?,?,?) ";
		PreparedStatement pstm = null;
		int res = 0 ; 
		try {
			
			//3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getMname());
			pstm.setString(3, dto.getNickname());
			
			//4.
			res = pstm.executeUpdate(); // insert 된 row의 갯수를 준다 
			if(res>0) {
				//syso는 컨트롤러에서 한다 
				commit(con); // insert가 성공했을 때 commit 하겠다는 뜻 한번 commit되면 다시 rollback이 안되기 때문에 / 이걸 안쓰면 날아간다 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			close(pstm); // jdbctemplate에 close statement 메소드가 있다 : 부모객체라서 prepared도 된다, 만든이유는 try catch 하기 기찮아서 
			close(con);
		}
	
		return res ; 
	}
	//선택출력
	public MYTestDto selectOne(int mno) {
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME "
				+ " FROM MYTEST"
				+ " WHERE MNO = "+ mno ; 
		//3.
		Statement stmt = null;
		//4.
		ResultSet rs = null;
		MYTestDto temp = new MYTestDto();
     //MYTestDto dto = null; 하고 아래 while문 돌릴때  초기화 해도 된다 dto 라는 변수로 담았으니까  return 값 dto 
		
		try {
			//3.
			stmt = con.createStatement(); //select 된 mno 한줄임 
			
			//4.
			rs = stmt.executeQuery(sql); //sql을 받아서 rs 로 호출 
			
			while(rs.next()) {
				
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));
		//dto =new MYTestDto(rs.getInt(1),rs.getStrint(2),rs.getString(3)); 해도 된다. 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(con);
		}
		
		
		return temp; 
		// 리턴값이 없을때 new 생성자로 객체를 만들고 리턴하면 빈 객체가 넘어간다 만일 MYTestDto dto = null 햇으면  null 값이 넘어감 
	}
	
	public MYTestDto selectOne2(int mno) {
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME "
				+ " FROM MYTEST WHERE MNO = ?";
		PreparedStatement pstm = null; 
		ResultSet rs = null;
		
		MYTestDto dto = new MYTestDto(); 
		
		try {
			//3.
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, mno);
		//4.
		rs = pstm.executeQuery();
		while(rs.next()) {
			dto.setMno(rs.getInt("MNO"));
			dto.setMname(rs.getString("MNAME"));
			dto.setNickname(rs.getString("NICKNAME"));
			
		}
		
		
		}catch(SQLException e)	{
			e.printStackTrace(); 
		}finally {
			close(rs);
			close(pstm);
			close(con);
		}
		return dto; 
	}
	
	
	//수정
	public int update(MYTestDto dto) {
		Connection con = getConnection(); 
		String sql = " UPDATE MYTEST "
				+ " SET MNAME = ? , NICKNAME = ?"
				+ " WHERE MNO = ? ";
		
		PreparedStatement pstm = null; 
		int res = 0 ; 
		try {
			//3.
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMname()); //첫번째 ? 에 getMname 넣어주는것 
			pstm.setString(2, dto.getNickname());
			pstm.setInt(3, dto.getMno());
			
			//4.
			 res = pstm.executeUpdate();
			 if(res >0) {
				 commit(con);
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		
		
		return res;
	}
	//삭제
	public int delete(int mno) {
		Connection con = getConnection();
		String sql = " DELETE FROM MYTEST "
				+ " WHERE MNO = ? ";
		
		PreparedStatement pstm = null; 
		
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			res = pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}
	
}
