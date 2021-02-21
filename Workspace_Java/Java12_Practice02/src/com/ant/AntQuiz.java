package com.ant;

import java.util.Scanner;

/*
 * 1 (i,j) 
 * 11
 * 12
 * 1121
 * 122111
 * 112213
 * 12221131
 * 1123123111
 * 12213111213113
 * 
 * 
 * 
 * 
 */
public class AntQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level :");
		int level = sc.nextInt();
		
		String s = new String(); //객체 만들기 sb
		for(int i = 0; i < level; i++) { //입력받은값 level -1 까지 반복 
			String [] ant = s.split(""); //공백으로 [] ant에 넣어준다 공백을 1로 인식해준다 
			String tmp = ant[0]; // 1이 나온다 
			
			
			int cnt = 0; //변수 선언 
			s = new String();
			
			for(int j=0; j<ant.length; j++) { //ant 의 길이만큼 반복
				if(tmp.equals(ant[j])) {
					cnt++;
				}else {
					s = s+tmp+cnt;
					tmp= ant[j];
					cnt = 1;
				}
			}
			if(cnt >=1) {
				s= s +tmp +cnt;
				cnt = 0;
			}
			System.out.println(s);
		}
		sc.close();
			
		}
	}
	
	
	
	

