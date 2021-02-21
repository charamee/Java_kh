package com.test03;

public class ArrCube01 {

	/*
	 * 1 4 7 
	 * 2 5 8 
	 * 3 6 9 
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자 
	 * 
	 * 	
	 */
	
	public static void main(String[] args) {

		      //만들기 순서대로 
				int [][] arr = new int [3][3];
				int cnt = 1; 
				for (int i = 0; i < arr.length; i++) {  // arr.length 는 커더란 배열의 크기임 즉 3 
					for (int j = 0; j < arr[i].length; j++) { // arr[i].length 는 i =  0,1,2 즉 3 
				arr[j][i]=cnt++; // cnt 는 들어가는 값을 1부터 9까지 넣어주려고 ! [0][0] = 1 [1][0]=2 [2][0]=3 이런식으로
				//System.out.printf("%2d", arr[i][j]);	//0이 나오는 이유는 큰배열 인덱스 위치순으로 값을 넣고 있는데 
				//출력은 작은배열 인덱스 위치 순으로 출력하고 있어서요


		} 

	}          // 출력하기 
				for (int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.printf("%2d", arr[i][j]);
					}
					System.out.println();
				}

}
}
