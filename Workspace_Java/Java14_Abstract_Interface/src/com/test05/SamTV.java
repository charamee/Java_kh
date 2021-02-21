package com.test05;

public class SamTV implements TV {
	
	public SamTV() { //객체 생성 
		System.out.println("SamTV 구매"); 
	}
	
	private int volume;
	
	@Override
	public int volumeUp() {
		volume +=3;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume-=3;
		if(volume<0) {
			volume=0;
		}
		return volume;
	}

}
