package com.testday;

import java.util.StringTokenizer;

public class String_StringTokenizer {
	public static void main(String[] args) {
		String colors ="red/yellow#green blue,orange";
		
		StringTokenizer st = new StringTokenizer(colors,"#/,");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String[] cv = colors.split("[/#,]"); //배열로 만들어준다 
		for(String color :cv) { //타입 변수 : 값 
			System.out.println(color);
		}
		
	}

}
