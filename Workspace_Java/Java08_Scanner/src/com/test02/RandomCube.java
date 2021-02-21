package com.test02;

public class RandomCube {

	public static void main(String[] args) {
		/*
		 * 1~9 사이의 
		 *5*5 형태의 숫자들을 출력하고, 
		 전체 난수의 합, 
		 전체 난수의 평균, 
		 x의 합 을 구하자. 
		 * for (i=0~4) 
		 * for (j 0~4) 
		 * 
		 */
		prnCube();
	}
	public static void prnCube() {
		int ranSum=0;
		int ranCount=0;
		double ranAvg=0;
		int xSum= 0;
		
		for (int i =0;i<5;i++) {
			for (int j =0; j<5; j++) {
				
				//난수의 갯수 세기 
				ranCount++;
				//난수 발생 
				//1-9까지의 난수를 나타내고 싶으면 : (Math. random ()* 9-1+1)+1
				int random=(int)(Math.random()*(9))+1;
				System.out.printf("%2d",random);
				// 전체 합 
				ranSum+=random;
				
				//X의 합 
				if ((i==j) || (i+j ==4)) { // i와 j의 값이 같거나 i와 j의 합이 4일 때 X의 값이 출력된다. 
					//Xsum = Xsum+random;는 아래와 같다 
					xSum+=random;
					
				}
				
				
				
			} System.out.println();
		}
		ranAvg=(double)ranSum/ranCount;
		
		System.out.println("전체 난수의 합 : " +ranSum);
		System.out.println("전체 난수의 평균 :"+ranAvg );
		System.out.println("X의 합 :" + xSum);
		
		
		
		
	}
}
