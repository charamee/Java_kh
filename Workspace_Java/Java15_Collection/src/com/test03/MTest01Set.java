package com.test03;

import java.util.HashSet;
import java.util.Set;

public class MTest01Set {
	//Set : 순서 없고 중복 불가능 
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//list 는 내가 넣어준 순서대로 1,3,5,2,4,6,8,null 이 순서대로 가지고 있음 
		//set은 자기가 편한대로 넣었다가 편한대로 출력하는거임 정렬 xx 
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("4");
		set.add("6");
		set.add("7");
		//set.add(null); 저장은 가능하나 사용하면 nullpointexception 오류 발생 
	    set.add("3"); // 중복 안됨 
		
		for(String s : set) {
			System.out.print(s + " ");	
		}
		System.out.println();
		
		findElement(set,"3"); // Set <String> set, STring find
		deleteElement(set,"3");//Set<String> set, String delete
		
		
	}
	public static void findElement(Set<String> set, String find) {
		//for (int i= 0; i<set.size();i++) {
			//set.get(i); 순서가 없기 떄문에 get (i) 0번지 1번지 개념이 없음 
		
		for(String s : set) {
			if(s.equals(find)) { //s 의 값 null 이 있는데 아무것도 없는 값을 equals 할 수 없음 
				System.out.println(find + "찾았따 ! ! ");
				
			}
		
		
		}
	}
	public static void deleteElement(Set<String> set, String delete) {
		for(String s : set) {
			if(s.equals(delete)) {
				set.remove(s); // 원래 remove의 리턴타입은 boolean 이라 true , flase 값이 나오는데 그냥 true 라고 가정하고, 바로 syso 
				System.out.println(delete+"지웠따!!");
				break;
			}
		}
		System.out.println(set);
	}

}
