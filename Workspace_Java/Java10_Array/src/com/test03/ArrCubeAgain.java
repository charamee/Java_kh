package com.test03;

public class ArrCubeAgain {
	
	

	/*
	 * 1 2 3 4 5  1-5 순서대로 출력 (0,0)(0,1)(0,2)(0,3)(0,4)
	 * 10 9 8 7 6  6-10 역순으로 출력 (1,4)(1,3)(1,2)(1,1)(1,0) 호출 
	 * 11 12 13 14 15 11-15 순서대로 출력 (2,0)(2,1)(2,2)(2,3)(2,4)
	 * 20 19 18 17 16
     * 21 22 23 24 25  21-15 순서대로 출력 (3,4)(3,3)(3,2)(3,1)(3,0) 호출 
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자 
	 * 
	 * i가 0 2 4 일땐 정방향 아닐땐 역방향 
	 */
	
	public static void main(String[] args) {
		
		int[][] arr = new int [5][5]; 
		
		
		//값 저장하기 
		int value=1; 
		
		for (int i = 0; i<arr.length;i++) {
			
			if (i % 2==0) {
				
				for( int j=0; j<arr[i].length;j++) {
					arr[i][j]=value++;
				}
		
			} else {
				
				for (int j=arr[i].length-1;j>=0;j--) {
					arr[i][j]=value++;
				}
			}
			
		}
		
		
		//출력

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
