package com.test02;

public class Testagin {
	/*
	 * A B C D E 
	 * F G H I J 
	 * K L M N O 
	 * P Q R S T 
	 * U V W X Y 
	 * Z 형태로 출력하자 !
	 */

	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int count = 0 ; 
		char input = 'A';
		boolean stop = false;
		
		
		while (!stop) {
			while(true) {
				System.out.print(input + " ");
				count ++;
				input++;
				if(count % 5 == 0) {
					break;
				}
				if(count == 26) {
					stop = true;
					break;
				}
			}
			System.out.println();
			
		}
	}
}

	