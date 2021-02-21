package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest01Map {

	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for( int i = 111;i<116;i++) {
			//map.put(k,v)
			map.put(i, i+"abc");
			
		}
		System.out.println(map);
		System.out.println(map.get(111));// value를 바로 가져올 수 없고 키를 통해 가져올수 있음. 111이라는 Key 안에 111abc라는 값이 들어감. 
		map.put(111, "115abc");
		System.out.println(map);
		System.out.println("======================================================");
		prn(map);
		
	}
	
	public static void prn(Map<Integer,String> map) {
		Collection<String> values = map.values();//value 값만 가져오는 것 
		System.out.println(values); 
		
		Set<Integer> keys = map.keySet(); // key 값만 가져오는것 
		System.out.println(keys);
		
		//Entry :  K 와 V를 같이 관리 
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		//Entry<K,V> 라는 객체들을 Set 으로 관리하겠따. 
		//Map 은 k를 통해서 v를 가지고 올 수 있음. (map.get(k) > value)
		// Entry 는 k와 v를 각각 가지고 올 수 있음. (entry.getkey(),entry.getValue())
		
		for(Entry<Integer, String> entry : entrySet) {
			System.out.printf("%d : %s\n",entry.getKey(),entry.getValue());
		}
		
		
		
		
		
		
		
		
	}
}
