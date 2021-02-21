package com.test03;

public class PrnTest {

	/*
	 * System.out.print() - 줄 바꿈 없음
	 * System.out.println() - 줄 바꿈 포함 
	 * 
	 * System.out.printf(String format, Object, ... args)
	 * > java.util.Formatter 에 저장됨 
	 * 
	 */
	public static void main(String[] args) {
		int i= 100;
		
		System.out.print("1.i:\\"+i+"\n"); //역슬래쉬 +문자 >> 어떤 기능을 함 역슬래쉬 자체로 쓰려면 \\ 두번 
		System.out.println("2.i:\t"+i);
		System.out.printf("3.i:%10d", i);
		System.out.println("----------------");
		
		//시험 점수 결과는 100(su)점 이고, 학점은 'A(ch)' 가 나왔따. 
		//나의 오늘 감정지수는 90.50(d)% 이다. 
		int su=100; // 10자리 > %d > 정수일 경우 d 
		char ch = 'A'; //5자ㅏ리 > 캐릭터(문자) 하나 출력할 때는 c 
		double d = 90.50d;// 5자리 (소수점 2자리 ) 
		//System. out.printf() 를 쓰자. 
		System.out.printf("시험 점수 결과는 %10d점이고,학점은 '%5c'가 나왔다.\n나의 오늘 감정지수는 %5.2f%%이다.", su,ch,d);
		// 오늘은 11\24 입니다. 제 나이는 ㅇㅇ 입니다. 제 이름은 name 입니다 .  
		int age=27;
		String name="차가람";
		System.out.printf("오늘은 11\\24입니다. 제 나이는 %d 입니다. 제 이름은 %s입니다.",age,name);
	
		System.out.printf("%3.2f,%6.2f,%7.2f",d,d,d);
	}
	
	
}
