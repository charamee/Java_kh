package com.test01;

import java.util.Arrays;

public class Homework {
	public static void main(String[] args) {
		
		char [] ch = new char[26];
		for (int i= 0; i<ch.length;i++) {
			ch[i]=(char)('a'+i);
			
		}System.out.println(Arrays.toString(ch));
		
		for(int i = 1; i<=ch.length;i++) {
			System.out.print(ch[i-1]+" ");
			if(i % 6 == 0 ) {
				System.out.println();
			}
		}
		
		System.out.println("\n");
		
		int input= 1 ; 
		for (int i= ch.length ; i>=1;i--) {
			System.out.printf("%c ",ch[i-1]);
			if (input % 6==0) {
				System.out.println();
			}
			input++;
		}
		
		
		
		
	}
}	
		
