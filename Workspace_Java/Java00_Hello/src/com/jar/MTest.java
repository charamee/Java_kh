package com.jar;

import com.my.Score;
//지금 누군가가 jar 파일로 my.Score를 줘서 이 library를 사용하여 출력하는 중 >> 캡슐화 : 코드 은닉 어떻게 만들었는지 모르지만 구냥 쓰는중 

public class MTest {
	public static void main(String[] args) {
		
		Score sc= new Score("가람",100,100,100);
		System.out.println(sc);
		
		Score cha = new Score();
		cha.setName("차차");
		cha.setKor(100);
		cha.setEng(90);
		cha.setMath(50);
		System.out.println(cha);
	}

}
