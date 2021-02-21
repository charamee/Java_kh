package com.generic;

//generic이 필요한 이유에 대한 설명. 

import java.util.ArrayList;
import java.util.List;

public class MTest02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // generic 은 값을 강제하여 오류를 없앰. 
		list.add("1");
		list.add("2");
		//list.add(3);
		list.add("4");
		list.add("5");
		//list.add('6');
		
		
		for(int i =0;i<list.size();i++) {
			System.out.println(((String)list.get(i)).getBytes());// 스트링으로 형변환하여 스트링이 가진 getBytes 메소드 사용한것 
		}
		
	}
}
