package com.generic;


//generic : 개발자가 의도한 타입만 저장할 수 있도록 함. 타입을 강제한다. 
public class Emp<T> {
	//똑같은 empno 라는 필드에 <T>가 들어가니까 int 도 가능하고 string 도 들어감 
	private T empno;
	private String ename;
	
	public Emp() {
		
		
	}
	
	public Emp(T empno, String ename) {
		this.empno =empno;
		this.ename=ename;
	}
	
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno=empno;
	}
	public String getEname() {
		return ename;
		
	}
	public void setEname(String ename) {
		this.ename=ename;
	}

	
}
