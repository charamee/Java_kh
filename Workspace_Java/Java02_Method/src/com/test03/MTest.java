package com.test03;

public class MTest {

	public static void main(String[] args) {
		int mySum = MyCalc.sum(10, 2);
		System.out.println(mySum);

		MyCalc.sub(10, 3);

		/*
		 * mul 메소드 호출하는데 아규먼트는 10,3 호출해서 리턴된 결과 값을 console에 출력하자
		 * 
		 */

		double mulmul = MyCalc.mul(10, 3);// 숫자앞에 아무것도 안쓰면 int 로 반환되는데 int> double 로 묵시적 변환 됨
		System.out.println(mulmul);

		
		//Mycalc.div(10,4); non-Static 이라서 호출 불가능 
		MyCalc calc= new MyCalc();
		calc.div(10, 3);

		
	}

}
