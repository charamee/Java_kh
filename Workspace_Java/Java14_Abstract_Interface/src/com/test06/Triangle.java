package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해 주세요 : ");
		int x = sc.nextInt();
		System.out.println("높이를 입력해 주세요 : ");
		int y = sc.nextInt();
		
		double res = (double)(x*y)/2; // double로 안바꾸면 모든값이 .0 으로 나오기 때문
		
		//setResult(String.valueOf(res));
		//setResult(Double.toString(res));
		//setResult(res + ""); //double 타입의 값과  "" 문자열이 만나면 문자로 인식됨 
		
		setResult(String.format("%.2f", res)); // .2f 수소점 둘째짜리까지만 
	}

	public void print() {
		System.out.print("삼각형의");
		super.print();
	}
}
