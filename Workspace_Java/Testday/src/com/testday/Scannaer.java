package com.testday;

import java.util.Scanner;

public class Scannaer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100사이의 정수를 입력하세요: ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 100) { // && 연산자로 바꾸기
			if (num == 1) {
				System.out.println("1은 소수가 아닙니다.");

			} else  {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						System.out.println(num + "은 (는) 소수가 아닙니다.");
						return; // 함수를 끝내겠다는 선언 
						// 얘를 추가하지 않으면 소수가 아닌값 예를들어 4 를 넣었을 때 소수가 아닙니다. 
						        //하고 아래 소수입니다. 이렇게 둘다 나옴 
					} 			
				}				
				System.out.println(num + "은(는) 소수입니다.");	
			}
		} else {
			System.out.println("1부터 100 사이의 정수를 입력하세요! ");
		}
	}
}
