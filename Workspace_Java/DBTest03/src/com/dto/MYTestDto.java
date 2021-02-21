package com.dto;

//Data Transfer Object  : 값 전달 객체: 각각의 계층에서 (m,t,c) 값을 서로 주고받을때 사용되는 것이 dto 
//Value Object : 값 객체 
//db table의 row 한개를 저장할 수 있다 
public class MYTestDto {

	private int mno;
	private String mname; 
	private String nickname; // 이렇게 3개의 값이 row 한개 (한줄) 
	
	//기본생성자, 파람3개짜리 생성자
	public MYTestDto() {
		
	}
	public MYTestDto(int mno, String mname, String nickname) {
		this.mno=mno;
		this.mname=mname;
		this.nickname=nickname;
	}
	
	
	
	//getter& setter 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno=mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname=mname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname=nickname;
	}
	
	
	
}
