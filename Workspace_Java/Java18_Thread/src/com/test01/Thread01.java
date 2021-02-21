package com.test01;

class MyThread01 implements Runnable{

	@Override
	public void run() { 
		
			for(int i=0; i<10; i++) {
				System.out.println("i : "+i);
			
		}
		
	}
	
}

public class Thread01 {

	//main thread 이다 > 우선 순위가 높다. 
	public static void main(String[] args) {
		System.out.println("main start ----------------------");
		
		//Thread 가 아니다 >> 싱글 쓰레드이다 
		/*
		MyThread01 my01 = new MyThread01();
		MyThread01 my02 = new MyThread01();
		
		my01.run(); 호출
		my02.run(); 호출  
		*/
		
		//Thread이다 >> 실행 흐름이 세개가 만들어지는것 
		Thread my01 = new Thread(new MyThread01()); //러너블 상속이기 떄문에 쓰레드로 만들어 줘야함 
		Thread my02 = new Thread(new MyThread01());
		
		my01.start();
		my02.start();
		
		
		
		
		
		System.out.println("main stop------------------------");
	}
	
}

