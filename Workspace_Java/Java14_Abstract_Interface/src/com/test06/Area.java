package com.test06;

public interface Area {

	//static final
	//변수는 "상수화" >> 다른데서 Area.PRINT = "abcd"; 이런식으로 바꿀 수 없음 
	//얘는 스네이크 표기법을 따르기 때문에 모두 대문자로 되어있으면 상수인것을 짐작할 수 있음. 
	String PRINT = "넓이 : ";
	
	public void print();
	public void make();
}
