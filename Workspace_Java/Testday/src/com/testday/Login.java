package com.testday;

import java.util.Scanner;

public class Login {
	public static void test01() {
		Scanner sc= new Scanner(System.in);
		System.out.print("아이디:");
		String id = sc.next();
		sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println(name+"님의 아이디는 "+id+"입니다.");
		
		
		
	}
	
	
	
	
	
	
	
  public static void main(String[] args) {
	test01();
}
}
