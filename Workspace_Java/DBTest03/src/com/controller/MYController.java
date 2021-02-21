package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MYTestBiz;
import com.dto.MYTestDto;

public class MYController { //controller : 화면제어 요청을 받아 해당 view를 응답시킨다. 
 
	
	private static Scanner sc = new Scanner(System.in);
	
	//view 화면 출력  getMenu와 syso 값들이 view 를 담당한다. 
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("1.전체출력\n")
		  .append("2.선택출력\n")
		  .append("3.추   가\n")
		  .append("4.수   정\n")
		  .append("5.삭   제\n")
		  .append("6.종   료\n")
		  .append("input select : ");
		System.out.println(sb);
		int select = sc.nextInt();
				
		return select;
		
	}
	public static void main(String[] args) {
		
		int select = 0;
		MYTestBiz biz = new MYTestBiz();
		
		do {
			select = getMenu();
			
			switch(select) {
			case 1:
				//전체 출력
				List<MYTestDto> list = biz.selectList();
				
				for(MYTestDto dto : list) {
					System.out.printf("%3d %10s %10s\n",dto.getMno(),dto.getMname(),dto.getNickname());
				}
				break;
			case 2: 
				//선택출력 
				System.out.println("출력할 번호 : ");
				int selectOneNo = sc.nextInt();
				
				
				MYTestDto selectDto = biz.selectOne(selectOneNo);
				//biz.selectone으로 넘어가서 > DAO로 넘어간다 
				
				System.out.printf("%3d %10s %10s \n",selectDto.getMno(),selectDto.getMname(),selectDto.getNickname());
				
				break;
			case 3:
				//추가
				System.out.println("추가할 번호 : ");
				int insertNo = sc.nextInt();
				System.out.println("추가할 이름 : ");
				String insertName = sc.next();
				System.out.println("추가할 별명 : ");
				String insertNickname = sc.next();
				
				MYTestDto insertDto = new MYTestDto();
				insertDto.setMno(insertNo);
				insertDto.setMname(insertName);
				insertDto.setNickname(insertNickname);
				
				int insertRes = biz.insert(insertDto); // insert 후 biz에 가서 insert 메소드 만들어주기 ! 
				//insertRes 가 int 형인 이유는  insert 메소드의 리턴값이 int형 이기때문에 
				if(insertRes >0) {//dao> biz>를 통해 리턴된 값이 (row) 0보다 크다면 
					System.out.println("추가 성공");
					
				}else {
					System.out.println("추가 실패 ㅠㅠ");
				}
				
				
				
				break;
			case 4: 
				//수정 
				System.out.println("수정할 번호 : ");
				int updateNo= sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateName = sc.next();
				System.out.println("수정할 별명 : ");
				String updateNickname = sc.next();
				
				MYTestDto updateDto = new MYTestDto(updateNo,updateName, updateNickname);
				/*updateDto.setMno(updateNo);
				*updateDto.setMname(updateName);
				*updateDto.setNickname(updateNickname);
				*/
				
		
				int updateRes = biz.update(updateDto);
				
				if(updateRes >0) {
					System.out.println("수정 성공 ");
				}else {
					System.out.println("수정 실패 ");
				}
			
				break;
			case 5:
				//삭제
				System.out.println("삭제할 번호 : ");
				int deleteNo = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNo);
				//원래는 dto 에 담아서 전달전달 해야되는데 어차피 deleteno 값 하나만 전달할거니까
				// dto 로 감싸서 전달하지 않고 그냥 바로 전달한다. 그래서 int 값 하나만 바로 biz로 보낸다 
				if(deleteRes >0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
					
				break;
			case 6: 
				System.out.println("프로그램이 종료되었습니다....");
			}
			
		}while (select != 6);
		
		
	}
}
