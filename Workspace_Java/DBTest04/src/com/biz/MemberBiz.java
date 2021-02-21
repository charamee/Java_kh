package com.biz;

import java.util.List;

import com.dto.MemberDto;

public interface MemberBiz {
	
	public List<MemberDto> selectList();
	//db에 요청했더니 테이블이 나왔는데 테이블이 여러줄이 나와서 list에 담아서 출력한다
	public MemberDto selectOne(int m_no);
	// 파라미터 m_no를 담아서 selectOne을 뽑을건데 (테이블 형태로 한줄이 나온다) Dto에 담을거라는 뜻 
	public int insert(MemberDto dto); 
	//int 는 insert한 dto 로우 수, db에 요청해서 insert 한줄이 나오는데 그 한줄을 int형으로 출력한다. 
	public int update(MemberDto dto);
	public int delete(int m_no);
	
	
	

}
