package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		for(int i=10;i>0;i--) {
			list.add(i+"");
		}
		
		System.out.println(list);
		Collections.sort(list,new Mysort());
		System.out.println(list);
		
		
	}
}
//해당 페이지에서만 사용하는 경우 class 또 사용 가능 
class Mysort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		int tmp1 = Integer.parseInt(o1);
		int tmp2= Integer.parseInt(o2);
		//1이면 앞의 인자가 더 큰값 
		//0이면 같은값 
		//-1 이면 뒤의 인자가 더 큰값 
		
		//작은순부터 큰순까지 정렬 
		if(tmp1> tmp2) {
			return 1;
		}else if (tmp1<tmp2){
			return -1;
		}
		
		return 0;
	}
	
}