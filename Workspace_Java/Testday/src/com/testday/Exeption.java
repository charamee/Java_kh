package com.testday;

public class Exeption {
	public static void main(String[] args) {
		Object[] sarr = new String[3];

		sarr[0] = new String("123");
		sarr[1] = String.valueOf(new Integer(456));
		// sarr[2] = (String)new Object(); //여기서 형변환 에러난다. 자식클래스로 캐스팅 하려고 해서 Object는
		// 부모인데 자식타입으로 캐스팅해서
		sarr[3] = String.valueOf(789);

		for (Object obj : sarr) {
			System.out.println(obj);
		}
	}
}