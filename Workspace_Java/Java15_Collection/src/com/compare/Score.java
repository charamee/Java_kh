package com.compare;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//기본 생성자, 파라미터 4개 생성자 
	public  Score() {
		
	}
	
	public Score(String name, int kor,int eng,int math) {
		this.name= name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//getter setter
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
	
	public int getSum() {
		return kor+eng+math;
	}
	public double getAvg() {
		return (double)(kor+eng+math)/3 ;
	}
	public String getGrade() {
		String grade= null; // 리턴값이 grade 이기 때문에 grade 선언하여 초기화? 
		
		switch ((int)getAvg()/10) {
		case 10 :
		case 9 : 
			grade="A";
			break;
		case 8 : 
			grade = "B";
			break;
		case 7: 
			grade = "C";
			break;
		case 6: 
			grade = "D";
			break;
		default : 
			grade = "F";
		}
		return grade;
	}
	public String toString() {
		return String.format("이름: %s\t국어 : %d\t영어 : %d\t수학 : %d\n총점 : %d\t평균 : %.2f\t등급 : %s",
				name,kor,eng,math,getSum(),getAvg(),getGrade());
	}

	@Override
	public int compareTo(Object o) {

		Score other = (Score) o;
		//1이면 앞의 인자가 더 큰값 
		//0이면 같은값 
		//-1이면 뒤의 인자가 더 큰값 
		
		
		if(this.getKor()> other.getKor()){
			return 1;
		}else if(this.getKor()<other.getKor()) {
			return -1;
		}	
		//this.getKor() == other.getKor()
		return 0;
	}
}
