package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.score.Score;

public class MTest02 {
	
	public static void main(String[] args) {
		Score sc01 = new Score("김선호",100,89,57);
		Score sc02 = new Score("강슬기",89,100,67);
		Score sc03 = new Score("수지",100,100,100);
		
		Map<Integer, Score> map = new HashMap<Integer,Score>();
		map.put(1, sc01);
		map.put(3, sc03);
		map.put(2, sc02);
		
		
		//System.out.println(map);
		prn(map);
		
	}
	public static void prn(Map<Integer,Score> map) {
		// 이름이 "김선호" 인 value를 찾아, 다음과 같이 출력하자.
				// 출력 결과) 1: 김선호 (82)

		
		Set<Entry<Integer,Score>> entrySet = map.entrySet();
		//Set<Map.Entry<Integer,Score>> 라고 하는건데 import java.util.Map.Entry; 이렇게 임포트를 하게되면 Map은 생략가능. 
		
		/*for(Entry<Integer,Score> entry : entrySet) {
			if(entry.getValue().getName().equals("김선호")) {
			    System.out.println(entry.getKey()+" : " +entry.getValue().getName() +" (" + entry.getValue().getAvg()+")");
			}*/
		Iterator<Entry<Integer,Score>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer,Score>temp = iterator.next();  // Iterator로 리턴된 Entry 값 안에서 
			
			if(temp.getValue().getName().equals("김선호")) { //getValue() 중에서 getName 이름이 equals = 김선호를 찾는거 
				System.out.println(temp.getKey()+" : " +temp.getValue().getName() +" (" + temp.getValue().getAvg()+")");
			}
			
		
	
	
	
	
	
	
	}
		
		
		
		
		
	}

}
