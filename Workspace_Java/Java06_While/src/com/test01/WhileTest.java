package com.test01;

public class WhileTest {
  
	public static void main(String[] args) {
		//1. 1~100 까지의 숫자를 역순으로 출력하자. 
		
		//2. 1~!00 까찌의 숫자 중, 2의 배수만 출력하자.
		
		//3. 1~100 가지의 숫자 중 7의 배수의 갯수와, 7의 배수의 총 합을 출력하자. 
		//int count= 0 ;
		// int sum = 0 ;
		
		//test01();
		//test02();
		test03();
		
	}
	
	public static void test01() {
		int i = 100;
		while (i>0) {
			System.out.println(i);
			i--;
		}
	}
	public static void test02() {
		int i = 1; 
		while (i<101) {
			//만일 i가 2의 배수라면, i를 출력하자 
			if (i%2==0) {
				System.out.println(i);	
			}
			i++;	
		}
		
	}
	public static void test03() {
		
		//초기값 
		int i = 1 ;
		int sum= 0 ;
		int count = 0 ;
		
		//조건식
		while (i<101) {
			//i 가 7의 배수인지?? 
			if(i%7==0) {
				System.out.printf("%d ",i);
				//7의 배수의 갯수
				count++;
				//7의 배수의 총 합 
				//sum=sum+i;
			    sum+=i;
				
			}
			//증감식
			i++;
		}
		
		System.out.printf("\n7의 배수의 갯수 : %d\n7의 배수의 총합 : %d",count,sum);
	}
}
