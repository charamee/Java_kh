package com.testday;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exception {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		//list.add(null); //얘가 null 이라서 오류 발생 
		list.add(new Date()); 

		list.add("apple");
		list.add("banana");
		list.add(new Integer(1));
		
		for(int i=0;i<=list.size();i++) {
			Object temp = list.get(i);
			
			Char c = ((String) temp).charAt(0); //ClasscastException 형변환 오류... Object 를 String 으로 변환하려고 해서. 
			System.out.println(c);
			
			/*public class ExceptionTest {

				public static void main(String[] args) {

				Object[] array = new Object[5];

				array[0] = null;

				array[1] = new Date();

				array[2] = "apple";

				array[3] = "banana";

				array[4] = new Integer(1);

				for(int i = 0; i < array.length; i++) {

				Object tmp = array[i];

				if(tmp != null && tmp instanceof String) {

				char c = ((String)tmp).charAt(0);

				System.out.println(c);	
			*/
			
			
			
		}
	}

}
