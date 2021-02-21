package com.test06;

import java.util.Scanner;

public class MTest {
	//원의 넓이: 반지름 *반지름 *파이 
	//삼각형의 넓이: 밑변 *높이*1/2
	//사각형의 넓이 : 밑변 *높이  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택해 주세요 \n[1:원  2:삼각형  3:사각형]");
		int select = sc.nextInt();
		
		Area area = null;
		switch(select) {
		case 1:
			area = new Circle();
			break;
		case 2:
			area = new Triangle();
			break;
		case 3:
			area = new Square();
			break;
		}
		area.make();
		area.print();
	}
}
