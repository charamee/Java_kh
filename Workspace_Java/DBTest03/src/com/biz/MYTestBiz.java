package com.biz;

import java.util.List;

import com.dao.MYTestDao;
import com.dto.MYTestDto;

//Biz : Business Logic -> 연산/ 처리 
public class MYTestBiz {

	
	private MYTestDao dao = new MYTestDao();
	
	public List<MYTestDto> selectList(){
		return dao.selectList();
		
	}
	
	public int insert(MYTestDto dto) {
		return dao.insert(dto);
	}
	
	public MYTestDto selectOne(int mno) {
		return dao.selectOne(mno);
		
	}
	public int update(MYTestDto dto) {
		return dao.update(dto);
		
	}
	public int delete(int mno) { //mno 외부에서 받아서 쓸거다 매개변수 
		return dao.delete(mno);
	}
}
