package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.score.Score;

public class MTest02 {

	public static void main(String[] args) {
		//Score객체 3개 만들자. 
		//이름은 홍길동,이순신,김선달,점수는 알아서. 
		
		Score s1= new Score(); 
			s1.setName("홍길동");
			s1.setKor(100);
			s1.setEng(56);
			s1.setMath(88);
			
			Score s2 = new Score("이순신",57,45,78);
			Score s3 = new Score("김선달",78,99,30);
		
		
		//Score객체를 관리할 수 잇는 Set 객체를 만들자. 
		//set type에 Hashset 으로 만들자. 
			
			Set<Score> set = new HashSet<Score>();
			set.add(s1);
			set.add(s2);
			set.add(s3);
			set.add(new Score("샤넬",100,100,100));
			
			//pintCollection(set);
			transElement(set,"홍길동",10);
			
			
		
	}
	public static void transElement(Set<Score> set, String target, int kor) {
		//set에서 홍길동을 찾아서 국어점수를 10점으로 바꾸고 전체 출력
		//찾을 때 iterator 를 사용하자 
		Iterator<Score> itr = set.iterator(); 
		while (itr.hasNext()) { 
			
			/*if(itr.next().getName()==target){
				itr.next().setKor(kor);
			 }*/
			
			Score temp =itr.next();
			if(temp.getName().equals(target)) { //문자열 비교는 .equals로 하기 !!
				// if(temp.getName()==target)으로 하면 위험함. 되긴 됨. 
				temp.setKor(kor);
			}
		}
		//출력
		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}
	

	public static void pintCollection(Set<Score> set) {
		//1. 
		for (Score sc : set) {
			System.out.println(sc);
		}
		System.out.println("---------------------------");
		//2. object 는 가장 큰 부모 Score는 Object 를 상속받음 그래서 Score가 가진 메소드 getName사용 불가능 
		Object[] oArr = set.toArray();
		for (int i = 0; i<oArr.length; i++) {
			//System.out.println(oArr[i]);
			//System.out.println(oArr[i].getName());// object 타입이라 
			System.out.println(
					((Score)oArr[i]).getName() +"\t"+ ((Score)oArr[i]).getAvg());
			//oArr 을 Score로 형변환 후 getName,Avg 호출 
			
			//System.out.printf("%s \t%.2f\n",((Score)oArr[i]).getName() +"\t"+ ((Score)oArr[i]).getAvg());
		}
		System.out.println("==================================================");	
		//3.Iterator : 컬렉션 저장 요소를 읽어오는 표준화된 방법 <list 나 set 을 가져옴 
		
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) { // iterator의 커서가 맨위를 가르키고 있다가 hasNext 가지고있니? 하면 
			System.out.println(iterator.next()); // 커서가 가르키고있는 값을 next가 호출하면서 커서를 다음으로 넘김 *반복 
		}
		
		
		}
	}
	
	
	
	
	

