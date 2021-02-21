package com.cal;

import java.util.Scanner;

public class LeapYear {
	
	
	
	
	/*
	 * 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
	 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
	 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
	 */

	public static boolean isLeapYear (int year) {
		
		//1:year %4 == 0 
		//&& (연수가 4로 나누어 떨어지는 해 그 중에서이기때문에 && ) 
		//2: year % 100 != 0 (0이면 평년이니까 0이 아니면 윤년) 
		//||
		//3 : year % 400 ==0 
		boolean isLeap= false; //초기값 false 로 설정 (이건 true로 해도 상관없음) , 
		//애초에 초기값을 false로 설정해 놓으면 if 하고 else 를 할 필요 없음 
		
		if ((year %4 == 0) && (year % 100 != 0) || (year % 400 == 0 )) {
			isLeap= true;
		} 
		
		
		
		
		return isLeap;
		
	}
	public static void main(String[] args) {
		//입력한 연도가 윤년이면 "윤년이 맞습니다."
		// 아니면 "윤년이 아닙니다." 출력 
		//static Scanner sc= new Scanner(System.in) ; static 은 전역변수로 사용할 때 쓴다 
		 Scanner sc= new Scanner(System.in) ;
		System.out.println("연도를 입력해 주세요! ");
		int year = sc.nextInt();
		
		if (isLeapYear(year)) {
			System.out.println(year+"년도는 윤년이 맞습니다. ");
		}else {
			System.out.println(year + "년도는 윤년이 아닙니다. ");
		}

		
		
	}
}
