package com.triangle;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
 * 
 *      
 *           1
 *         1   1
 *       1   2   1
 *     1   3   3   1
 *   1   4   6   4   1 
 * 1   5   10  10  5   1
 * ....
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class PascalTriangle {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("level : ");
		int n = sc.nextInt(); // n은 커다란 배열의 수 
		
		int[][]arr= new int [n][];
		arr[0]= new int [] {1}; // 0번지일 때 1이라고 지정해버림 or 아래 for문 안에 i=0 부터 시작해두 됨 
		for (int i =1; i<arr.length;i++) {
			arr[i]= new int [i+1]; // 작은 배열의 값은 큰배열 + 1 값이기 때문 
			
			for(int j =0; j<arr[i].length;j++) {
				
				if (j==0 || j==arr[i].length-1) { //j가 작은배열의 0번지 이거나 작은배열j의 length -1 값과 같다면
					arr[i][j]=1; //무조건 1이 들어가야함 
				
				}else {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j]; // 위의 두 수 더한 값 
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
		prn(arr);
		
	}
	 private static void prn(int[][]arr) {
		 for (int i=0;i<arr.length;i++) {  // 큰배열 i 
			 for(int j=arr.length;j>i;j--) {
				 System.out.print("  ");
				 
			 }for (int j=0;j<arr[i].length;j++) {  // 작은 배열 j 
				 System.out.printf("%4d", arr[i][j]);
			 }
			 System.out.println();
		 }
	 }

}
