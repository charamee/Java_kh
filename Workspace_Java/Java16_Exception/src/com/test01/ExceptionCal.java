package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCal {
	// Exception 예외. 

	public int calculation() {
		int res= 0; 
		
		while(true) {
			try { 
			res= inputNum() / inputNum();//예외가 발생할 수 있는 명령문들
			break;
			
			}catch(InputMismatchException e) { // (발생하면 잡아줄 예외)
				//e.printStackTrace();
				System.out.println("잘못 입력하셨습니다. 숫자만 입력해 주세요.");
			} catch(ArithmeticException e) { //ArithmeticException 는 java.lang에 있어서 import 안해두 돼  (발생하면 잡아줄 예외)
				System.out.println("0으로 나누면 안됩니다. 다시 입력해 주세요. "); 
			} finally { //정상종료 or 예외 발생 상관없이 무조건 실행되어야 하는 명령
				System.out.println("계산 완료 ! ");
			}
			//System.out.println(res);
		}
		
		return res;
	}
	
	public int inputNum() {
		int n= 0;
		
		System.out.println("숫자만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		return n;
		}
}
