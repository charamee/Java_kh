package com.test02;

import java.util.Arrays;

public class DeepCopy {
	
	//새로운 객체 생성해서 값만 복사 
	
	public static void main(String[] args) {
		int [] original = {10,20,30,40,50};
		
		
		//1. 배열 인덱스의 값을 가져와서 복사. 
		int [] copy01 =new int[original.length]; // original 의 length 만큼 값의 크기만 복사한것=> 5개의 배열 
		for (int i= 0; i<original.length; i++) {
			copy01[i]=original[i]; // 그리고 똑같은 값을 복사해서 넣어줌 
			
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy01)); // 같은 값을 복사해서 넣엇기 때문에 호출했을 때 나오는 값은 같음 
		System.out.println(original);
        System.out.println(copy01); // but  주소값은 다름 
        System.out.println(original == copy01);
		
		copy01[2]=300;
		System.out.println(Arrays.toString(original)); // copy == original 이기 때문에 다른 값 나옴 
		System.out.println(Arrays.toString(copy01));
				
		System.out.println("---------------------");
		
		//2.original에게 요청하여 복사 
		int [] copy02 = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy02));
		
		copy02[2] = 3000;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy02));
		System.out.println(original);
        System.out.println(copy02);
		
		
		//3. System.arrayCopy 사용 
        
        int[] systemArr = new int [10];
        Arrays.fill(systemArr, 100); // 해당 배열을 100으로 모두 채워주자 
        System.out.println(Arrays.toString(systemArr));
                       //원본      시작점 복사본   시작 갯수
        System.arraycopy(original,0,systemArr,1,3); // 원본의 시작점 값을 복사본의 시작점에 원본의 값 3개를 넣어주는 것 
        System.out.println(Arrays.toString(systemArr));
        

        
        
        
		
	}

}
