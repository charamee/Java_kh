package com.j04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest {

	public static void main(String[] args) {
		//person  타입의 값 5개를 받을 수 있는 배열을 만들고, 
		//좋아하는 연예인 5명을 넣자. 
		
		Person[] ps = new Person[5];
		
		ps[0] = new Person("수지",50,'F');
		ps[1] = new Person("태연",40,'F');
		ps[2] = new Person("코코",30,'M');
		ps[3] = new Person("샤넬",20,'F');
		ps[4] = new Person("라미",10,'F');
		
		//반복문을 사용하여 전체 출력하는데, 나이가 10인 사람은 이름만 출력하자 
		for(int i = 0; i<ps.length; i++) {
			if(ps[i].getAge()==10) {
				System.out.println(ps[i].getName());
			}else {
				System.out.println(ps[i]);
			}
		}
		
		//for each문 
		for(Person p : ps) {
			if(p.getAge()==10) {
				System.out.println(p.getName());
			}else {
				System.out.println(p);
			}
		}
		//array : 같은 타입의 여러개의 값을 효과적으로 관리하기 위한 객체 /타입 고정/ 크기 고정 
		//collection :  여러개의 값을 효과적으로 관리하기 위한 객체 /타입 가면/ 크기 가변
		
		List<Person> list = new ArrayList<Person>();
		list.addAll(Arrays.asList(ps));
		//System.out.println(list);
		
		Set<Person> set = new HashSet<Person>();
		set.addAll(list);
		
		Map<String, Person> map = new HashMap<String, Person>();
		for(int i=0;i<ps.length;i++) {
			map.put(ps[i].getName(), ps[i]);
			
		}
		System.out.println(map);
		
		/*
		 * 			Collection 
		 * List   Set   Map
		 * O	   X	 X	    순서
		 * O	   X   K:X V:O	중복
		 * 
		 * 
		 * 
		 */
		
		//map을 반복해서 가지고와서 , age 가 10인 사람의key 와 value를 각각 출력하는데 
		//key 를 출력하고/ value 가 가지고 있는 age만 출력하자. 
		//단  iterator 와 entry 를 사용하자 
		System.out.println(map.get("코코")); // 스트링을 통해서 펄슨값을 가져온다. 
		Set<Entry<String, Person>> entrySet = map.entrySet(); //엔트리를 가져오는 방법 
		//for(Entry<S,P>e : entrySet){} 으로 하면 쉬운데 iterator로 값을 가져올거임 
		//map은 키를 통해서 밸류를 가져올수 있다. 근데 entry가 키랑 밸류를 따로 가지고 있다. 
		
		//Iterator: collection 내부의 값을 읽어내는 표준화된 방법 
		Iterator<Entry<String,Person>> entryIr = entrySet.iterator();
		while(entryIr.hasNext()) { //이터레이터가 가지고있는 커서가 한칸씩 움직이면서 entry 를 가져온다. 
			Entry<String,Person> entry = entryIr.next();
			
			if(entry.getValue().getAge() ==10) {
				System.out.println(entry.getKey()+":"+ entry.getValue().getAge());
			}
		}
		
		
	}
}
