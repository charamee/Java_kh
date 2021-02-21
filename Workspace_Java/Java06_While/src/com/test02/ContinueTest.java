package com.test02;

public class ContinueTest {
	
	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int i =  0;
		while (i<10) {
			i++;
			if(i % 3==0) { //3의 배수라면
				continue; // 밑에 있는 내용을 뛰어넘고 다음 반복으로 넘어가는 것 
			}
			System.out.println(i);
			
		}
	}

}
