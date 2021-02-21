package com.dao;
import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MemberDto;


public class MemberDaoImpl implements MemberDao { // impl dao를 상속받아서 그대로 오버라이드 했다는 뜻 implement 했다는 뜻 

	@Override
	public List<MemberDto> selectList() {
		Connection con = getConnection();
		
		//3.
		Statement stmt = null;
		//4.
		ResultSet rs = null; 
		List<MemberDto> list = new ArrayList<MemberDto>(); 
		
		try {
			//3.
			stmt= con.createStatement();
			
			//4.
			rs = stmt.executeQuery(SELECT_LIST_SQL); 
			//executeQuery(sql) 인데 slq 문이 DAO에 있으니까 상수이름을 받는다 
			
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString(5));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
				
				list.add(dto); // 중요중요!! 		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(con);
		}
		
		return list;
	}

	@Override
	public MemberDto selectOne(int m_no) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null; //위의 결과를 받아줄 객체 Resultset 
		
		MemberDto dto = new MemberDto();// 나온 결과를 dto에 담는다
		
		try { 
			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, m_no);
			//4. 
			rs = pstm.executeQuery();
			while(rs.next()) {
				dto.setM_no(rs.getInt("M_NO"));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString("M_GENDER"));
				dto.setM_location(rs.getString("M_LOCATION"));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
			
		}
		
		return dto;
	}

	@Override
	public int insert(MemberDto dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null; 
		int res= 0; 
		
		try {
			pstm = con.prepareStatement(INSERT_SQL);
			//pstm.setInt(1, dto.getM_no()); 자동 넘버
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			
			
			res = pstm.executeUpdate();
			if(res>0) {
				commit(con); // 디비에 반영해주는거다 
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}

	@Override
	public int update(MemberDto dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0; 
		
		try {
			pstm = con.prepareStatement(UPDATE_SQL);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			pstm.setInt(8, dto.getM_no());
			
			res= pstm.executeUpdate();
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

	@Override
	public int delete(int m_no) {
		Connection con = getConnection(); 
		PreparedStatement pstm = null;
		int res = 0; 
		try {
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, m_no);
			
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

}
