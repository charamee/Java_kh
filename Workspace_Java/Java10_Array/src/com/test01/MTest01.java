package com.test01;

import java.util.Arrays;

public class MTest01 {

	public static void main(String[] args) {
		// 여러개의 같은 타입의 값을 효과적으로 관리하기 위한 객체 
		
		//방법1. 
		int [] a ;    // a라는 변수 선언하는것 . [] 대괄호는 여러가지를 담아줄 수 있는 방 ! 
		a= new int [5];   //정의. a라는 변수에 값을 넣어줌 . ( 얘는 a라는 이름의 int 값만 들어갈 수 있는 5칸짜리 방이야) 
		a[0]=1; // a의 0번지에는 1 ,1번지에는 2 , ...4번지에는 5
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		//방법2. 
		int [] b = new int [] {5,4,3,2,1};  // 선언 정의 초기화 :(값을 넣는것 )
		
		//방법3. 
		int [] c = {6,7,8,9,10}; // 선언 초기화 
		
		System.out.println(Arrays.toString(a));
	    
		System.out.println(a[0]);
		System.out.println(Arrays.toString(b));
		
		System.out.println(a[0]+b[1]+c[2]);  // 배열은 0부터 시작하기때문에 length가 5라면 배열의 번지는 0부터 4 까지임 
		
		System.out.println(c); //[I@41a4555e 라고 출력되는데 이것이 주소값 / 배열은 참조타입이기때문에 c라는 변수에 들어가져있는 값의 주소값이 나옴 
		
		System.out.println(Arrays.toString(c)); //  java.util 패키지의 Arrays 클래스 toString 메소드를 사용 /일일히 부르기 귀찮으니까 
		
		String[] s = new String [] {"Have","a","nice", "day"}; // s라는 변수에서 Have, a, nice, day 라는 값을 관리중 
		//prn(s); // 위의 값을 받은 아규먼트 
		modi(s); 
 
	}
	
	public static void modi(String[] arr) {
		// nice > good 변경후 전체 출력
		// [Have, a , good, day] /Arrays.toString 사용 금지
		arr[2] = "good";
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {  // 총길이 length 는 4가 된다(방이 4칸)배열의 번지수는 0부터 시작하기 때문에 해당 번지는 length 빼기 1 
			// System.out.printf("%s, ", arr[i]);
			if (i == arr.length - 1) {
				System.out.printf("%s", arr[i]);
			} else {
				System.out.printf("%s, ", arr[i]);

			}

		}
		System.out.println("]");

	}

	public static void prn(String[] arr) { // string 배열을 가진 arr 이라는 Have, a, nice, day 값  
		// {Have a nice day } 로 출력되기 t 원할 때 
		// hint ? 배열은 0부터 length-1 까지 
		System.out.print("{");
		for (int i = 0 ; i<arr.length; i ++) {
			System.out.printf("%s ", arr[i]); // arr의 0번지부터 3번지까지 출력 하기 
		}
		System.out.println("}");
		
		
	}
	
	
	
	
}
