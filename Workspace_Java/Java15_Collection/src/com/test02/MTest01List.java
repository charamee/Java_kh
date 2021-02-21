package com.test02;

import java.util.ArrayList;
import java.util.List;

public class MTest01List {

	
	//List 
	//순서가 있고, 중복 가능 
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("김선달");
		list.add("강호동");
		list.add("유재석");
		list.add("조세호");
		list.add("신동엽");
		list.add("조세호");
		prn(list);
		transElement(list);
	}
	
	private static void transElement(List<String> list) {
		
		//1.홍길동의 인덱스를 찾아서. .index
				//해당 인덱스의 값을 홍길순으로 바꾸자
		
		
		list.set(list.indexOf("홍길동"), "홍길순");
		prn(list);
		
		//2ㅣ ~신 으로 끝나는 객체를 찾아서 만일 있으면 "신"> "자"로 바꾸자.
	
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).endsWith("신")) {
				list.set(i,list.get(i).replace("신", "자"));
				//list.get(i) > 얘는 String  타입의 값을 호출하며  스트링 메소드 replace를 사용한다.  
			}
		}
		prn(list);
		
		//3. 마지막 글자가 "호"인 이름을 찾아서 만일 있으면 삭제하자
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).endsWith("호")) {
				list.remove(i);
			}
		}
		prn(list);
		
	}
	
	private static void prn( List<String> list) {
		for(String s : list) {
			System.out.print(s+ " ");
		
		}
		System.out.println();
	}
}

