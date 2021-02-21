package com.cal01;

public class DayOfCalendar {
//달력 만들기
//요일 계산> year 년 month 월을 주면 year 년 month 월 1일의 요일> 요일 만큼 공백 " "주기 > 7로나눈 나머지가 될때마다 엔터 
	
	//윤년 계산
	public static boolean isLeapYear(int year) {
		boolean Leap = false; 
		
		if((year % 4 ==0) && (year % 100 !=0) || (year % 400 ==0)) {
			Leap = true; 
		}
		
		return Leap;
	}
	
	//일 수 계산 
	public static int getDate(int year, int month) {
		int result = 0;

		if (isLeapYear(year)) { // 위의 윤년계산이 참이면 > 윤년 달의 일 수 넣기 
			switch (month) {
			case 1: case 3: case 5:case 7:case 8:case 10: case 12:
				result = 31;
				break;
			case 4:case 6:case 9:case 11:
				result = 30;
				break;
			case 2:
				result = 29;
				break;
			}

		} else {
			switch (month) { // 윤년이 아니라면 > 윤년이 아닌 달의 일 수 넣기 
			case 1:
			case 3: // 31일까지 있는 월
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = 31;
				break;
			case 4:
			case 6:
			case 9: // 30일까지 있는 월
			case 11:
				result = 30;
				break;
			case 2:
				result = 28;
				break;
			}
		}
		return result;
	}
	
	//해당 월의 첫번째 요일 (1일의 요일)  계산  
	private static int dayday(int year, int month) {
		int dayday=0; 
		int sum=0; 
		
		//1.1.1~year-1.12.31일 까지의 일 계산하기 
		for(int i=1;i<year; i++) {
			for(int j= 1; j<=12;j++) {
				sum+=getDate(i,j);
			}
		}
		//year.1.1~ year.month-1 . year년 1월1일부터 원하는 월의 전월 마지막날까지 (31,30,29,28)
		for(int i=1;i<month;i++) {
			sum+=getDate(year,i);
		}
		
		//year.month.1 일 
		sum+=1;
		
		//요일
		dayday= sum %7; 
		
		return dayday; // main 메소드에서 해당 월을 입력하면 해당월의 1일의 요일을 알려줌 
		
	}
		
		
		
		
		
	
	
	public static void prn(int year, int month) {
		
		//달력 윗부분 출력
		
		System.out.printf("\t\t%d년 %d월 \n",year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		
		//시작 요일 
		//int start = DayOfCalendar.getDayOfweek(year,month); 앞에 클래스명 생략 가능 
		int start = dayday(year,month); // 0이면 일요일 1이면 월요일 2이면 화요일 을 전제로 함 
		//start 로 나올수 있는 숫자는 0 1 2 3 4 5 6 일 월 화 수 목 금 토 를 받음. 
		// 마지막 날짜 
		int last = getDate(year,month);
		// 시작 요일만큼 빈공간 
		for(int i=0; i<start;i++) { // 만약 start로 나온 값이 2여서 화요일부터 시작이라면 일요일,월요일 두칸의 공백을 만들어야 함 
			System.out.print("\t"); // i가 0부터 1 까지 공백을 만들게됨 . (일요일, 월요일에 공백) 
			
		}
		// 달력 출력 
		
		for(int i=1; i<=last;i++) {
			System.out.printf("%d\t",i);
			start++;
			if(start%7 ==0) { // start 가 만약 7이 되면 엔터를 치자 
				System.out.println();
			}
		}
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
	
}
