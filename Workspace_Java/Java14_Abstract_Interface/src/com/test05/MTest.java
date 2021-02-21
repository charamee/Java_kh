package com.test05;

public class MTest {

	public static void main(String[] args) {
		TV ig = new IgTV();
		System.out.println(ig.volumeUp());//1
		System.out.println(ig.volumeUp());//2
		System.out.println(ig.volumeUp());//3
		System.out.println(ig.volumeUp());//4
		
		System.out.println(ig.volumeDown());//3
		System.out.println(ig.volumeDown());//2
		System.out.println(ig.volumeDown());//1
		System.out.println(ig.volumeDown());//0
		
		TV sam = new SamTV();
		System.out.println(sam.volumeUp());//3
		System.out.println(sam.volumeUp());//6
		System.out.println(sam.volumeDown());//3
		System.out.println(sam.volumeDown());//0
		
	}
}
