package com.test07;

public class MyProfile extends Profile implements Display, Job {
	//상속 받는 중 Profile implements Display, Job {
	
	private String loc;//field 
	
	public MyProfile(String name, String phone) { //부모 객체에 파라미터2개짜리 생성자가 있기때문에 얘도 2개짜리 생성자를 만들어야함 
		super(name,phone); // 부모에게 보냄 
	}
	
	//setter 와 같은 역할을 함 
	@Override
	public void jobLoc(String loc) {
		this.loc= loc;//field 에 해당값을 넣어줌 

	}

	@Override
	public void display() {
		
		super.print(); // 부모의 print 값 출력 
		System.out.println("주소 : " +loc);
		System.out.println("직종 : "+ JOB_ID);

	}

}
