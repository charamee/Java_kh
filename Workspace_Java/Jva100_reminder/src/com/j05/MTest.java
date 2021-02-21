package com.j05;

public class MTest {

	public static void main(String[] args) {
		//비버랑 독수리랑 객체만들어서 
		//비버의 울음소리 : 
		//독수리 울음소리 : ??
		
		Animal bv = new Beaver("비버", 3); //객체 생성 
		bv.bark("비이이이버"); 
		
		
		Animal eg = new Animal(); //기본생성자를 이용해서 객체 생성 
		eg.bark("독슈뤽");
		eg.setKind("독수리"); //
		System.out.println(eg.getkind());
	}
}
