package com.testday;

public abstract class Duck {

	private String name;
	private String kinds;
	
	protected Duck() {
		
	}
	protected Duck(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public String toString(){
		
		
		return "저는"+kinds+"이고, 이름은"+name+"입니다.";
		
	}
	public abstract void quack();
}
