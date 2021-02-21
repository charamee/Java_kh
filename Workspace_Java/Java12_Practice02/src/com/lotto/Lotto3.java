package com.lotto;

import java.util.Random;

public class Lotto3 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		//1~45 번까지의 난수를 만들자 
		Random rd = new Random();
		
		
		//int lottoNum = rd.nextInt(45)+1; 
		
		
			
		
		//System.out.println(lottoNum);
		
		for(int i=0; i<lotto.length;i++) {
				lotto[i]=rd.nextInt(45)+1; 
				System.out.println(lotto[i]);
		}
		
	}
	
	

}
