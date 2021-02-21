package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.biz.MemberBizImpl;
import com.dto.MemberDto;

public class MemberController {
	
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("***********\n")
		  .append("*1.전체출력*\n")
		  .append("*2.선택출력*\n")
		  .append("*3.추   가*\n")
		  .append("*4.수   정*\n")
		  .append("*5.삭   제*\n")
		  .append("6. 종   료*\n")
		  .append("input select : ");
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;
		
	}
	
	
	public static void main(String[] args) {
		
		int select = 0; 
		MemberBiz biz = new MemberBizImpl();
		
		while (select != 6) {
			select = getMenu();

			switch (select) {
			case 1:
				//전체출력
				//SELECT M_NO, M_NAME,M_AGE, M_GENDER, 
				//M_LOCATION, M_JOB, M_TEL, M_EMAIL FROM TB_MEMBER; 
				
				List<MemberDto> selectlist = biz.selectList();
				for(MemberDto dto : selectlist) {
					System.out.println(dto);
				}
				
				break;
			case 2:
				//선택출력
				System.out.println("출력할 번호 : ");
				int selectNo = sc.nextInt();
				
				MemberDto dto = biz.selectOne(selectNo);
				System.out.println(dto);
				//dto에 tostring 만들어놨기 떄문에 dto만 호출한다 
				
				break;
			case 3:
				//insert 번호지정을 따로 안한다. 자동 순번 MEMBERSEQ.NEXTVAL해놨다. 
				//System.out.println("추가할 번호 : ");
				//int insertNo = sc.nextInt(); -> 자동으로 되기때문에 안한다 
				System.out.println("추가할 이름 : ");
				String insertName = sc.next();
				System.out.println("추가할 나이 : ");
				int insertAge = sc.nextInt();
				System.out.println("추가할 성별 (M or F) : ");	
				String insertGender = sc.next();
				System.out.println("추가할 지역 : ");
				String insertLocation = sc.next();	
				System.out.println("추가할 직업 : ");
				String insertJob = sc.next();
				System.out.println("추가할 전화번호 : ");
				String insertTel = sc.next();
				System.out.println("추가할 이메일 : ");
				String insertEmail = sc.next();
				
				
				MemberDto insertDto = new MemberDto(0,insertName,insertAge,insertGender,insertLocation,insertJob,insertTel,insertEmail);
				//값을 전달할때 dto 를 사용하여 이동이동한다 
				
				//insertDto.setM_no(insertNo); 자동 순번 
				//insertDto.setM_name(insertName);
				//insertDto.setM_age(insertAge);
				//insertDto.setM_gender(insertGender);
				//insertDto.setM_location(insertLocation);
				/*insertDto.setM_job(insertJob);
				insertDto.setM_tel(insertTel);
				insertDto.setM_email(insertEmail);
				*new Member() < 괄호 안에 써줄 수 있다. 
				*/
				
				int insertRes = biz.insert(insertDto);
				if(insertRes >0) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패 ");
				}
				
				break;
			case 4:
				//update
				System.out.println("수정할 번호 : ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateName = sc.next();
				System.out.println("수정할 나이 : ");
				int updateAge = sc.nextInt();
				System.out.println("수정할 성별 (M OR F): ");	
				String updateGender = sc.next();
				System.out.println("수정할 지역 : ");
				String updateLocation = sc.next();	
				System.out.println("수정할 직업 : ");
				String updateJob = sc.next();
				System.out.println("수정할 전화번호 : ");
				String updateTel = sc.next();
				System.out.println("수정할 이메일 : ");
				String updateEmail = sc.next();
				
				MemberDto updateDto = new MemberDto();
				updateDto.setM_name(updateName);
				updateDto.setM_age(updateAge);
				updateDto.setM_gender(updateGender);
				updateDto.setM_location(updateLocation);
				updateDto.setM_job(updateJob);
				updateDto.setM_tel(updateTel);
				updateDto.setM_email(updateEmail);
				
				int updateRes = biz.update(updateDto);
				
				if(updateRes>0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				//delete
				System.out.println("삭제할 번호 : ");
				int deleteNo = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNo);
				if(deleteRes >0) {
					System.out.println("삭제성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 6: 
				break;
		
			}
		}
		System.out.println("프로그램을 종료합니다..");

	}

}
