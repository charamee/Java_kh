package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {
	
	//달력 만들기 
	//Java.util.Calendar 사용해서 만들기 

	public void prn(int year, int month) {
		
		
		// Calendar cal  = new Calendar(); >> X singleton 
		// Calendar 객체 생성하는 법 
		Calendar cal= Calendar.getInstance();
		
		// 달력 윗부분
	    System.out.printf("\t\t%d년 %d월\n",year,month);
	    System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
	    
	    //시작 날짜 설정 
	    //month -1 하는 이유는: calendar 는 0부터 시작 하기때문에 0>1월 1>2월...11>12월 
	    cal.set(year, month-1,1);
	    
	    
	    //시작 요일 구하기 
	    int start = cal.get(Calendar.DAY_OF_WEEK);
	    //DAY_OF_WEEK > 스네이크 표기법 
	    //Field number for get and set indicating the day of the week
	    //This field takes values SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY. (1부터 7인가..? ) 
	    
	    //일요일이 1이기 때문에 1부터 시작함 
	    for(int i=1; i<start;i++) {
	    	System.out.print("\t"); // 공백 출력 
	    }
	    //달력출력 
	    //getActualMaximum : 현재월의 가질 수 있는 최대값 리턴 
	    for(int i=1;i<=cal.getActualMaximum(Calendar.DATE);i++) { // 해당하는 월의 일수만큼 반복 
	    	//DATE
	    	//Field number for get and set indicating the day of the month. >> 의 최대값 리턴이니까 12월이면 31 
	    	System.out.printf("%d\t",i); // 12월의 경우 i는 1부터 31까지 돌게됨. 
	    	if(start % 7 ==0) { // 만일 start가 7일 마다 엔터 
	    		System.out.println();
	    	}
	    	start ++; // start 로 나올수 있는 값은 1부터 7 1234567 반복 
	    }
	}
}
