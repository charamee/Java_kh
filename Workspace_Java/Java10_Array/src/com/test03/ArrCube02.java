package com.test03;

public class ArrCube02 {

	
	/*
	 * 1 2 3 4 5  1-5 순서대로 출력 (0,0)(0,1)(0,2)(0,3)(0,4)
	 * 10 9 8 7 6  6-10 역순으로 출력 (1,4)(1,3)(1,2)(1,1)(1,0) 호출 
	 * 11 12 13 14 15 11-15 순서대로 출력 (2,0)(2,1)(2,2)(2,3)(2,4)
	 * 20 19 18 17 16 16-20 역순으로 출력 (3,4)(3,3)(3,2)(3,1)(3,0)
     * 21 22 23 24 25  21-25 순서대로 출력 (4,0)(4,1)(4,2)(4,3)(4,4) 호출 
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자 
	 * 
	 * i가 0 2 4 일땐 정방향 아닐땐 역방향 
	 */
	
	public static void main(String[] args) {

		int[][] res = new int[5][5]; //배열 만들어 주기 
		
		int cnt = 1; // 얘는 차례대로 값이 될거임 

		// 값 저장
		for (int i = 0; i < res.length; i++) {

			// i=0,2,4
			if (i % 2 == 0) {
				// 정방향 출력
				for (int j = 0; j < res[i].length; j++) {
					res[i][j] = cnt++;
				}

			} else { // 역방향
				for (int j = res[i].length - 1; j >= 0; j--) { //(i,4) 부터 차례대로 출력하면 됨. 즉 length 5-1= 4 
					res[i][j] = cnt++; 

				}
			}
		}

		// 출력
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%3d", res[i][j]);

			}
			System.out.println();
		}

	}
}
