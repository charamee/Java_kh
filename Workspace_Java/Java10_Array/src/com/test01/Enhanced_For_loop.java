package com.test01;

public class Enhanced_For_loop {
	public static void main(String[] args) {
		String [] strArray = {"java","Android","C","JavaScript","Python"};
		
		for(String x :strArray) { // 향상된 for문 : 변수 x에 배열의 각 요소가 대입된다. 
			System.out.println(x); // 반복실행문 
		}
	}

}
