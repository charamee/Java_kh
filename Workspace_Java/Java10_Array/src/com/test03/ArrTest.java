package com.test03;

public class ArrTest {
	
	public static void main(String[] args) {
		int [] [] arr = new int [3][3];
		int cnt = 1; 
		for (int i =0; i<arr.length;i++) {
			for(int j= 0 ;j<arr[i].length;j++) {
				arr[j][i] = cnt ++; 
				System.out.printf("%2d",arr[i][j]);
			}
		}
	}

}
