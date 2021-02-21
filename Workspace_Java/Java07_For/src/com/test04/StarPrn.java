package com.test04;

public class StarPrn {
	
	

	/*
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 */
	public void prn01() {
		//i는 줄 (0,1,2,3,4)
		for(int i=1;i<6;i++) {
			//j는 * 갯수 (1+1,2+1,3+1,4+1,5+1)
			for(int j=1;j<i+1;j++) {
	
		System.out.print("★");
			}	
		System.out.println();
		
	}
	}
	/*
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 */
	
	public void prn02() {
		for(int i = 0; i <5; i++) {
			for(int j=0; j<5-i;j++) { // 위에서 j<5-i 로 해도 같은 값 나옴 
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	/*
	 *     ★
	 *    ★★
	 *   ★★★
	 *  ★★★★
	 * ★★★★★    
	 */

	public void prn03() {
		// i는 줄
		for (int i = 0; i < 5; i++) {

			// i가 0 일 때 값 두개 j>"빈칸" 와 k>별 를 나타내야함

			// j는 빈칸 (4-0,4-1,4-2,4-3,4-4)
			for (int j = 0; j < 4 - i; j++) {

				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("★");

			}
			System.out.println();

		}
	}
	/*
	 * ★★★★★
	 *  ★★★★
	 *   ★★★
	 *    ★★
	 *     ★
	 */
	public void prn04() {
		
		for (int i = 0; i < 5; i++) {

			// 

			// j는 빈칸 
			for (int j = 0; j <i; j++) {

				System.out.print(" ");
			}
			// k는 별 
			for (int k = 0; k < 5-i; k++) {
				System.out.print("★");

			}
			System.out.println();
		}
		
		
		
		
		
		
	}
		/*
		 *    ★   4  1 4
		 *   ★★★  3  3 3
		 *  ★★★★★  2 5 2
		 * ★★★★★★★ 1 7 1
		 *★★★★★★★★★  9
		 */
	
		public void prn05() {
			for (int i = 0; i < 5; i++) {
				for (int j = 1; j <5-i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2*i + 1; k++) {
					System.out.print("★");

				}System.out.println();
			}

			
			}
			

		}
	
