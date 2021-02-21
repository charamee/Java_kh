package com.testday;

public abstract class Product {

	public static final String BRAND = "KH";
	private int productCode;
	private String productName;
	
	protected Product() { //객체를 만들려면 생성자가 있어야함 
		
	}
	protected Product(int productCode, String productName) {
		this.productCode=productCode;
		this.productName=productName;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String toString() {
		return "상품코드 :" +productCode +",상품명 :"+productName;
			
	}
	public abstract void makeProduct(); //상속받는 클래스에서 메소드 수행 
}
