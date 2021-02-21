package com.testday;

public class Computer extends Product  {

	private int serialNumber;
	
	public Computer() { //객체를 만들려면 생성자가 있어야함 
		//super(); 가 생략되어있음 
	}
	public Computer(int productCode, String productName, int serialNumber) {
		super(productCode,productName);
		this.serialNumber=serialNumber;
	}
		
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public void makeProduct() {
		System.out.println(super.toString()+",제품번호: "+serialNumber+"컴퓨터를 생산하였습니다.");
		
	}

}
