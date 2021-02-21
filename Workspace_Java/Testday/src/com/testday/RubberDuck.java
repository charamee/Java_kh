package com.testday;

public class RubberDuck extends Duck {

	public static final String PLACE = "석촌호수";
	private int weight;
	
	public RubberDuck() {
		
	}
	public RubberDuck(String name,String kinds,int weight) {
		super(name,kinds);
		this.weight=weight;
		
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public void quack() {
		System.out.println(super.toString()+"몸무게는"+weight+"kg입니다. 하지만 전 말을 하지 못해요.");
	

	}
	

}
