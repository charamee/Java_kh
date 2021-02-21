package com.score;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//기본생성자 
	public Score() {
		
	}
	
	public Score(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//getter,setter
	
	public String getName() {
		return this.name; // this 생략 가능 
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
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
		this.math=math;
	}
	
	//getSum,getAvg,getGrade
	
	public int getSum() {
		return kor+eng+math;
	}
	public double getAvg() {
		return (double)(kor+eng+math)/3;
		
	}
	public String getGrade() {
				
			switch((int)getAvg()/10){
			
			case 10 :
			case 9 : 
				return "A" ;
			case 8 : 
				return "B";
			case 7: 
				return "C";
			case 6: 
				return "D";
			default : 
				return "F";
			}
			
	}
	public String toString() {
		return name+"\t"+kor+ "\t"+eng+"\t"+math+"\t"+
	           getSum()+"\t"+String.format("%.2f", getAvg())+"\t"+getGrade();
	}

}
