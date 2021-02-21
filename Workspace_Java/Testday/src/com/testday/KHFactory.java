package com.testday;

public class KHFactory {
	public static void main(String[] args) {
		System.out.println("===========KH Factory 생산시작============");
		Product[] factory = new Product[5];
		factory[0]= new Computer(1,"KH컴퓨터",123456);
		factory[1]= new Sugar(2,"KH설탕","흑설탕",5);
		factory[2]= new Computer(1,"KH컴퓨터",112233);
		factory[3]=new Sugar(2,"KH설탕","백설탕",2);
		factory[4]=new Computer(1,"KH컴퓨터",111333);
		
		System.out.println(Product.BRAND);
		
		for(Product kh : factory) {
			kh.makeProduct();
		}
	
	}

}
