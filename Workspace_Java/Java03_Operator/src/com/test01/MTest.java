package com.test01;

public class MTest {

	//전역변수 ( 클래스 안의 어디서든 사용 할 수 있는 것 ) 
	//public static int ten=10;
	
	// 상수: 변수 앞에 final 
	public static final int TEN = 10 ;
	// 상수는 항상 대문자로 쓰는것이 국룰 (스네이크 표기법) 
	
	public static void main(String[] args) {
		//지역변수 ( 전역변수와 지역변수의 이름이 같으면 "지역변수"가 우선! )
		int ten=100;
	    System.out.println(ten);
	 	System.out.println(op01(TEN,3));
	 	System.out.println(op02());
	 	op03(TEN,3);
	 	//System.out.println(op04()); <void 이기 떄문에 return 값이 없음 
	 	op04();
	 	
	 	String five= (op05())?"재미없다" : "즐겁다"; //< op 05를 먼저 출력했기 때문ㅇㅔ 연산값 3 나온거고 false 값을 다시한번 return 
	 	System.out.println(five);
	 	op06();
	 	op07();
	}
	
	public static String op01(int a , int b) {
		//1.사칙 연산 
	
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		System.out.printf("%d-%d=%d\n",a,b,a*b);
		System.out.printf("%d / %d 의 몫: %d\n",a,b,a/b,a%b);
		
		return "사칙연산 끝!\n";
	}
	
	public static String op02() {
		//2. 대입연산  (+=,-=,*=,/=)
		int res=0;
		System.out.println("res:"+res);
		res=res+10;
		System.out.println("res:"+res);
		res=res-5;
		System.out.println("res:"+res);
		System.out.println(res-5);
		System.out.println(res);
		
		
	
		return null;
	}
	
	public static void op03(int a , int b) {
		//증감연산 
		//++/--
		//변수의 앞 뒤에 증가/ 증감 연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/ 증감 하게된다. 
		//전위연산: 연산자를 변수 앞에 붙여서 연산을 먼저 하게 되고, 값을 나중에 리턴한다.
		//후위연산  : 연산자를 변수 뒤에 붙여서 값을 먼저 리턴하고, 연산을 나중에 하게된다. 
		
		System.out.println(a); // 10
		System.out.println(++a); //전위 연산 : 연산 먼저 11
		System.out.println(a++); //11 (12)
		System.out.println(a);
		//a= 12 b=3
		int result = a++ + --b + b++ + ++a;
		//result= 12 (13) + 2 (2) + 2(3) + 14(14)
		// a = 14 b = 3 
		System.out.println(result);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
			
	}
	
	public static void op04() {
		
		//논리 연산 :&(and) ,|(or) ,&& , || 
		//참 true 거짓 false 
		System.out.println(true&true); //참 그리고 참 : 양쪽 둘다 true여야 true 
		System.out.println(true&false); // 참 그리고 거짓 : 거짓; 
		System.out.println(false& true); // 거짓 그리고 참 : 거짓; 
		System.out.println(false&false); // 거짓 
		
		System.out.println(true|true); // 참 또는 참 : 참; 
		System.out.println(true| false); // 참 또는 거짓 : 참 ; 
		System.out.println(false | true); // 참; 
		System.out.println(false | false); // 거짓; 
		
	    System.out.println("-----------");
		
		System.out.println(true && true); // 참 그리고 참 > 참 
		System.out.println(true&& false); // 참 그리고 거짓 > 거짓 
		System.out.println(false && true); //거짓 그리고 참 (죽은 코드 / 안보겠다는 뜻 / 더 빨라짐)  > 거짓 
		System.out.println(false && false); // 거짓 그리고 거짓 
		
		
		System.out.println(true || true); // 참 그리고 참 >참;
		System.out.println(true|| false); // 참 그리고 거짓 >참;
		System.out.println(false || true); //거짓 그리고 참 >참;
		System.out.println(false || false); //거짓 그리고 거짓 >거짓;
		
		int a = 2;
		int b = 3 ;
		System.out.println((a>b)&&(b>a)); 
	
	
	
	}
	
	public static boolean op05() {
		/*5. 삼항연산
		 * (조건) ? 참일때 리턴값 : 거짓일 때 리턴값; 
		 */
		int a= TEN;
		int b=7;
		int result= (a>b)?a-b:b-a; // a가 b보다 크다면? 참 그게아니면 거짓 
		System.out.println(result);
		
		String res= (a>b)?"a가 b보다 크다" : ((a<b)? "a가 b보다 작다." : "a와 b는 같다");
		System.out.println(res);
		
		return true;
		
	}
	
	public static void op06() {
		//6.비교연산 (>,<,>=,<=,== , != (같지 않다< ! not))
		System.out.println(true==false);
		System.out.println(TEN !=3);
	}
	
	public static void op07() {
		//7. 비트연산 (& | ^ ~ << >> ... ) : 값을 0,1 비트 상태에서 연산한 결과를 리턴 
		int a = 10;
		// 0000 0000 0000 0000 0000 0000 0000 1010; < 자리수 총 32개 32 비트 
		int b = 2 ; 
		// 0000 0000 0000 0000 0000 0000 0000 0010; 
		
		System.out.println(a&b);// 0 거짓 1 참 으로 해석 
		//0000 0000 0000 0000 0000 0000 0000 1010
		//0000 0000 0000 0000 0000 0000 0000 0010
		//&
		//0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(a|b);// 0 거짓 1 참 으로 해석 
		//0000 0000 0000 0000 0000 0000 0000 1010
		//0000 0000 0000 0000 0000 0000 0000 0010
		//|
		//0000 0000 0000 0000 0000 0000 0000 1010
		
		System.out.println(~a);// 0 거짓 1 참 으로 해석 
		//0000 0000 0000 0000 0000 0000 0000 1010
		//~
		//1111 1111 1111 1111 1111 1111 1111 0101
		
		System.out.println("-------------------------------");
	
		int c= 10; 
		System.out.println(c>>2);
		System.out.println(Integer.toBinaryString(c>>2));
		System.out.println(c<<4);
		System.out.println(Integer.toBinaryString(c<<4));
		
		
	}
	
}
