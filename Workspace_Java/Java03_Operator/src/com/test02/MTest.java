package com.test02;

public class MTest {

	public static void main(String[] args) {
		// class type 변수는 = new class type << nonstatic 
		FruitBasket bananaBasket = new FruitBasket(); //<< fruitbasket(설계도)으로 만들어진 instance 값 
		bananaBasket.basketSetting("바나나",10);
		FruitBasket.basketSize=20;
		//bananaBasket.basketSize=15;<<instance 에서 static을 호출한거니까 이렇게 하지말자 
	    System.out.println(bananaBasket.basketSize);
	    //FruitBasket.count=100; << static 으로 바꿔야함 nonstatic
	    System.out.println(bananaBasket.fruitName);
	    
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.basketSetting("사과",21);
		System.out.println(appleBasket.basketSize);
		System.out.println(appleBasket.fruitName);
		
		FruitBasket pearBasket = new FruitBasket();
		pearBasket.basketSetting("배",1);
		System.out.println(pearBasket.basketSize);
		System.out.println(pearBasket.fruitName);
		
		FruitBasket mango = new FruitBasket();
		mango.basketSetting("망고", 18);
		FruitBasket.basketSize=50;
		System.out.println(mango.count);
		System.out.println(mango.fruitName);
		System.out.println(mango.basketSize);
		
	}
}
