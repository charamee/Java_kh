package com.test02;

import java.util.ArrayList;
import java.util.List;

public class List_ram {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("차차");
		list.add("코코");
		list.add("샤넬");
		list.add("영수");
		list.add("영자");
		
		prn(list); //list  호출 
		methodTest(list);
		

	}
	public static void methodTest(List<String> list) {
		
		list.set(list.indexOf("차차"), "라미");
		prn(list);
		
		System.out.println(list.indexOf("샤넬")); //샤넬이의 인덱스번호를 호춣
		System.out.println(list.indexOf("차차")); //차차의 인덱스는 없어서 -1을 리턴한다. 
		
		for(int i=0;i < list.size();i++) {
			if(list.get(i).endsWith("수")) {
				list.set(i,list.get(i).replace("수", "희"));
			}
		}
		prn(list);
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).endsWith("자")) {
				list.remove(i);
			}
		}
		prn(list);
		
	}

	public static void prn(List<String> list) {
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
