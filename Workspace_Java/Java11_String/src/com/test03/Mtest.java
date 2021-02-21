package com.test03;

import java.util.StringTokenizer;

public class Mtest {

	public static void main(String[] args) {
		String str ="The String class represents character strings.";
		String str02 = "The,String,class,represents,character,strings.";
		
		//1.java.lang.String.substring(begin ,end)
		System.out.println(str.substring(4,10)); //10번 인덱스는 공백, 10-1 까지만 출력됨 
		
		//2.java.lang.String.split(
		//public String[] split​(String regex) : regex정규표현식 (정규식) 
		String[] temp = str02.split(",");
		for (int i=0;i<temp.length;i++) {
			System.out.println(temp[i]); // temp의 0번지부터 5번지까지 모두 출력
			System.out.println(temp[2]); // 2번지값 = class
		
			
			System.out.println("------------------------");
		//3. java.util.StringTokenizer
		StringTokenizer st = new StringTokenizer(str02,","); //str02 를 , 로 잘라줄거야 
		
		while (st.hasMoreTokens()) { // 1.token 이 있는지 확인함 
			System.out.println(st.nextToken()); // 2.token이 가르키는 값을 출력하고 다음 토큰으로 넘어감 
		}
	
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
