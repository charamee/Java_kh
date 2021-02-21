package com.cal;

import java.util.Scanner;

public class DayOfCalendar {
//달력 만들어 주세요. > 연 월 일 받으면 해당 연 월 일의 요일을 출력하자.  
	//java.util.Calendar 금지! (다른 패키지도 모두 금지) 
	
	public static boolean isLeapYear(int year) { // 윤년 판별 메소드 
		boolean isLeap = false;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			isLeap = true; // 윤년일 때 true 값이 나오기 위함 

		}

		return isLeap;
	}
	
	public static int getDates(int year, int month) { // 위의 윤년 판별 메소드에서 나온값을 사용함 // getdates 는 해당년도 해당월의 일수를 나타냄  
		int result = 0 ; 
		
		if (isLeapYear(year)) {
			
			switch (month) {
			case 1:
			case 3: //31일까지 있는 월 
			case 5: 
			case 7:
			case 8:
			case 10: 
			case 12:
				result= 31;
				break;
			case 4:
			case 6:
			case 9:   // 30일까지 있는 월 
			case 11:
				result=30;
				break;
			case 2: 
				result = 29;  
				break;
			}
			
		}else {
			if(month == 1 ||month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				result = 31; // 31까지 있는 월 
			}else if (month == 4| month ==6 || month == 9 || month == 11) {
				result = 30 ; // 30일 까지 있는 월 
				
			}else if (month == 2 ) {
				result = 28; 
			}
			
		}
		
		
		
		return result;
	}
	
	public static String dayCharacter(int day) {
		
		switch (day) {
		case 0 :
			return "일요일"; // 월의 시작은 일요일이기 때문에 0일때 일요일 1일때 월요일 
		case 1 : 
			return "월요일"; 
		case 2 :  
			return "화요일";
		case 3 : 
			return "수요일";
		case 4 : 
			return "목요일";
		case 5 : 
			return "금요일";
		case 6 : 
			return "토요일"; 
			 
			// 우리가 만든 코드는 모두 1년 1월 1일 붜 2020년 12월 1일까지의 일을 모두 요일로 치환할거임 
			// 365~ 366(윤년) 
		}
		return null;
	}
	
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("연도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		System.out.println("일 입력 : ");
		int day = sc.nextInt();
		
		int sum= 0 ; 
		
		for (int i = 1; i<year; i++) {
			for (int j = 1 ; j <=12; j++) {
				sum += getDates(i,j);
			} // 1년 1월 1일 부터 2019년 12월 31일까지의 일수를 모두 더함 
		}
		
		for (int k = 1; k< month; k++) {
			sum += getDates(year,k);
			
		} // 그리고 2020년 1월 1일 부터 2019년 11월 30일 까지의 수를 더함 
		
		System.out.printf(" %d 년 %d 월 %d 일은 %s 입니다. ",year,month,day,dayCharacter((sum+day)%7)); // day값  나머지까지 값 
	}
	
	
	
	
}
