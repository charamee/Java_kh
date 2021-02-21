package com.biz;
//biz : 연산/ 처리해야되는 코드들이 여기 들어간다. 

import java.util.List;

import com.dao.MemberDao;
import com.dao.MemberDaoImpl;
import com.dto.MemberDto;

public class MemberBizImpl implements MemberBiz {
	
	private MemberDao dao = new MemberDaoImpl();
	

	@Override
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int m_no) {
		return dao.selectOne(m_no);
	}

	@Override
	public int insert(MemberDto dto) {
		//M_GENDER에 들어가는 값을 대문자로 바꾸자>> biz class에서 하는일이 연산/처리 이기때문에 
		//dto.setM_gender(dto.getM_gender().toUpperCase()); 아래 두줄과 같은 의미다
		String upperGender = dto.getM_gender().toUpperCase();
		dto.setM_gender(upperGender);
		return dao.insert(dto);
	}

	@Override
	public int update(MemberDto dto) {
		dto.setM_gender(dto.getM_gender().toUpperCase());
		return dao.update(dto);
	}

	@Override
	public int delete(int m_no) {
		return dao.delete(m_no);
	}

}
