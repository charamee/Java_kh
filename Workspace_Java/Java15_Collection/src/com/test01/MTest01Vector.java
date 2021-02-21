package com.test01;

import java.util.Vector;

public class MTest01Vector {

	public static void main(String[] args) {
	
		
		//Vector (iCa, caIn)
		// iCa 만큼 용량을 만든다. iCa를 넘어가면 cpIn 만큼 용량 증가한다. 
		Vector<Integer> v = new Vector<Integer>(10,5);
		
		System.out.println(v.size()+" : "+v.capacity());
		//capacity 용량 처음에 지정한 10 , size 는 들어온 값에 따라 달라짐 
		for (int i = 0 ; i<9; i++) {
			v.add(i);
			System.out.println(v+ " ->"+v.size()+" : "+ v.capacity());
			
			
		}
		v.add(9);
		System.out.println(v+ " ->"+v.size()+" : "+ v.capacity());
		
		v.add(10);
		System.out.println(v+ " ->"+v.size()+" : "+ v.capacity());
		v.remove(0);
		System.out.println(v+ " ->"+v.size()+" : "+ v.capacity());

		
		
}
	
}
	
	
