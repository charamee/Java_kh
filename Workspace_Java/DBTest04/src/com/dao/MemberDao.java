package com.dao;

import java.util.List;

import com.dto.MemberDto;

//다형성. 부모타입으로 자식 객체를 생성한다. 아래 5개의 메소드를 만들어주면서 저만큼의 메소드를 수행?할거라는 리스트를 제시? 


public interface MemberDao {
	String SELECT_LIST_SQL = " SELECT M_NO,M_NAME,M_AGE,M_GENDER,M_LOCATION, M_JOB, M_TEL, M_EMAIL "
			               + " FROM TB_MEMBER"
			               + " ORDER BY M_NO DESC ";
	String SELECT_ONE_SQL = " SELECT M_NO,M_NAME,M_AGE,M_GENDER,M_LOCATION, M_JOB, M_TEL, M_EMAIL"
							+ " FROM TB_MEMBER "
							+ "WHERE M_NO = ?"; 
	String INSERT_SQL = " INSERT INTO TB_MEMBER "
					+ " VALUES(MEMBERSEQ.NEXTVAL,?,?,?,?,?,?,?) ";
					
	String UPDATE_SQL = "UPDATE TB_MEMBER "
						+ " SET M_NAME=?,M_AGE=?,M_GENDER=?,M_LOCATION=?, M_JOB=?, M_TEL=?, M_EMAIL=? "
						+ " WHERE M_NO = ?";
	String DELETE_SQL = " DELETE FROM TB_MEMBER "
						+ " WHERE M_NO = ? "; 
	
	// 인터페이스에 쿼리문을 한번에 상수로 넣은것 > 오류를 찾기 쉽다 
	
	
	public List<MemberDto> selectList();
	public MemberDto selectOne(int m_no);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete (int m_no);
	

		
	

}
