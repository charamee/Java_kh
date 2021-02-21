package com.generic;

public class MTest {

	public static void main(String[] args) {
		Emp emp = new Emp();
	    emp.setEmpno(111);
	    emp.setEname("홍길동");
	    System.out.println(emp.getEname()+":"+emp.getEmpno());
	    
	    Emp emp2 = new Emp("112a","김선달");
	    System.out.println(emp2.getEname()+":"+emp2.getEmpno());
		
	//똑같은 empno 라는 필드에 T가 들어가니까 int 도 가능하고 string 도 들어감 
	    
	    Emp<String> emp3 = new Emp<String>("113a","이순신"); //Emp에 <String>타입 강제 
	    System.out.println(emp3.getEname()+":"+emp3.getEmpno());
	
	    //Emp<Integer> emp4 = new Emp<Integer>("11","킹세종");// 이거는 11을 문자로 받는거라 Integer 강제에서는 불가 
	    Emp<Integer> emp4 = new Emp<Integer>(11,"킹세종");
	    System.out.println(emp4.getEname()+":"+emp4.getEmpno());
	}
}
