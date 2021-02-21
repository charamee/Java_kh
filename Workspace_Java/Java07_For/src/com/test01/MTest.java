package com.test01;

public class MTest {
	public static void main(String[] args) {
		// prn01();
		// prn02();
		prn03();

	}

	public static void prn01() {
		// for (초기값 ; 조건식 ; 증감식 ) { }
		for (int i = 0; i < 10; i++) { // 실행 순서 : 1. 초기값 2. 조건식 (조건이 참이면) 3. 명령 4. 증감식 >2>3>4>2>3>4>반복
			System.out.println(i);
		}
	}

	public static void prn02() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void prn03() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d, %d\n", i, j);

			}

			System.out.println();
		}
	}
}
