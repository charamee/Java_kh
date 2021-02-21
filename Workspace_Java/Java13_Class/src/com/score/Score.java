package com.score;

public class Score {
	
	// extends object >> java의 모든 class 는 object 를 상속받는다 즉 쓰지않아도 부모클래는 object 임 
	
	//field
	private String name;
	private int kor; 
	private int eng;
    private int math;
    
    
    //constructor (객체 생성, 필드 초기화)
    public Score() { 	//파라미터 0 개짜리 생성자가 "기본생성자"
    	
    }                                         // 같은 모양이기때문에 생성자 overloading 한것 
    public Score(String name, int kor, int eng, int math) { // 파라미터4개짜리 생성자 
    	this.name= name;
    	this.kor=kor;
    	this.eng=eng;
    	this.math=math;
    }
    
    //getter  & setter 
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public int getKor() {
    	return kor;
    }
    public void setKor(int kor) {
    	this.kor = kor;
    }
    
    public int getEng() {
    	return eng;
    }
    public void setEng(int eng) {
    	this.eng=eng;
    }
    
    public int getMath() {
    	return math;
    }
    
    public void setMath(int math) {
    	this.math = math;
    }
    
    //getSum,getAvg,getGRade
    public int getSum() {
    	return kor+eng+math;
    	
    	
    }
    public double getAvg() {
    	return(double)(kor+eng+math)/3;
    }
    
    public String getGrade() {
    	String grade=null;
    	//100-90: A, 80-89 : B, 70-79 : C, 60-69: D, 0-59: F
    	switch((int)getAvg() /10) {
    		case 10 :
    		case 9 : 
    			grade="A";
    			break;
    		case 8: 
    			grade="B";
    			break;
    		case 7: 
    			grade="C";
    			break;
    		case 6: 
    			grade="D";
    			break;
    		default :
    			grade="F";			 			
    	}
   	
    	return grade; 
    }
   
    @Override // 재정의 원래 부모객체 object 가 가진 toString 은 getClass().getName() + '@' + Integer.toHexString(hashCode())
    // 가 나와야 되는데 내가 다시 재정의 했기 때문에 내가 만든 toString 값 대로 나옴 >>system.out.println(lee.toString) 이게 자동으로 됨 
    public String toString() {
    	
    	return "이름 : " + name +" 국어 :"+kor+" 영어 : "+eng+" 수학: "+math+
    			"\n총점: "+getSum()+" 평균: "+getAvg()+" 등급: "+getGrade();
    }
    
    
    
}
