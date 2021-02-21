package com.test02;

public class Gugudan {
	public static void main(String[] args) {
		// gugu01();
		// gugu02(5);
		//guguWhile01();
		guguWhile02(5);
		// 1. 2단 부터 9단까지 전체 출력
		// 2. 아규먼트로 들어온 값의 단만 출력 >> for 문을 사용하여 출력 !
	}

	public static void guguWhile01() { // while 안에 또 다른 while 추가 = 조건식 안에 다시 초기값, 조건식, 증감식 입력
		// 초기값
		int i = 2;

		// 조건식
		while (i < 10) {
			System.out.println("<" + i + "단>");
			// 초기값
			int j = 1;
			// 조건식
			while (j < 10) {

				System.out.printf("%d* %d= %d \n", i, j, (i * j));
				// 증감식
				j++;
			}
			// 증감식

			i++;
		}
	}

	public static void guguWhile02(int dan) {
		
		System.out.println("<" + dan + "단>");
		//초기값 
		int j= 1;
		
		//조건식
		while(j<10) {
			System.out.printf("%d* %d= %d \n", dan, j, (dan * j));
		
		//증감식 
			j++;
		}
		
	}

	public static void gugu01() {
		for (int i = 2; i < 10; i++) {

			System.out.println("<" + i + "단>");

			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, (i * j));
			}
		}

	}

	public static void gugu02(int dan) {
		System.out.println("<" + dan + "단>");

		for (int j = 1; j < 10; j++) {

			System.out.printf("%d * %d = %d \n", dan, j, (dan * j));

		}

	}
}
