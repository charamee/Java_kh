package com.testday;

public class DuckManager {

	public static void main(String[] args) {
		Duck[] duck = new Duck[5];

		duck[0] = new RubberDuck("도날드", "러버덕", 100);
		duck[1] = new Mallard("꽥꽥이", "청둥오리", "서울", "white");
		duck[2] = new RubberDuck("고무고무", "러버덕", 100);
		duck[3] = new Mallard("청둥이", "청둥오리", "부산", "blue");
		duck[4] = new Mallard("미세먼지", "청둥오리", "중국", "yellow");

		for (Duck d : duck) {
			d.quack();

		}

	}
}