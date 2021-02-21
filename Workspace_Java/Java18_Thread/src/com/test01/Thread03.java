package com.test01;

class MyThread03 extends Thread{
	
	public MyThread03(String name) {
		super(name);
		
	}
	@Override
	public void run() {
		for(int i =0;i<11;i++) {
			System.out.println(this.getName()+":"+i);
		}
		System.out.println(this.getName()+" 끝 !! !! !! ");
	
	}
	
}
public class Thread03 {

	public static void main(String[] args) {
		MyThread03 dog = new MyThread03("멍멍");
		MyThread03 cat = new MyThread03("야옹");
		
		//java의 thread scheduling은 우선순위priority 와 순활할당 round-robin 방식을 사용한다. 
		//priority : 우선순위
		
		dog.setPriority(10);
		cat.setPriority(Thread.MIN_PRIORITY); // 우선순위 상관없이 돌아가면서 끝남.......왜지? 종나 불필요해.. 
		
		dog.start();
		cat.start();
		
	}
}
