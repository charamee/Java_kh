package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		Score[] kh = new Score[3];
		kh[0] = new Score ("박찬종" , 78,52,100);
		kh[1] = new Score ("이순신", 100,100,68);
		kh[2] = new Score ("홍길동" , 89,40,80);
 
		for(Score student : kh) { //배열을 손쉽게 나타내는 for each 문 student라는 변수에 kh 배열을 돌린것 
			System.out.println(student);
		}
		System.out.println("--------------");
		
		//클래스의 compareTo(object other)과 함께 사용된다 
		Arrays.sort(kh);  // sort정렬 메소드 안에서 배열 안에 있는 객체들을 비교해줌 
		//comparable 나와 다른 객체를 비교해준다. 
		System.out.println("--------------");
		
		for(Score student : kh) {
			System.out.println(student);
		}
	}
}
