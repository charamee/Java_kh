package com.lotto;

import java.util.Arrays;

public class Lotto {

	//로또 "배열" 
	private int[] make() {
		int [] arr= new int [6]; //6개짜리 배열 만들거야 > [0,0,0,0,0,0]
		
		int index= 0; 
		while (index<6) {
			int insert= (int)(Math.random()*45)+1; // 랜덤값 나오는 값을 insert에 저장 그리고 아래 isSame 메소드에서 값을 돌려서
			
			if (!isSame(arr,insert)) { //isSame 일때가 아닌 !isSame 같은 값이 아닐때 // 아래 if문조건 arr[i]==insert 값이 true 가 되니까 
				                       // !true > flase 가 되기때문에 if 문이 돌아가지 않고 다시 랜덤값을 호출하게 됨 
				
				arr[index]= insert; //랜덤으로 나온 insert값을 arr[해당 index열에 저장 ]
				
				index++;

			}

		}
		return arr;
	}
	

	// 1~45 사이의 랜덤한 숫자 6개 "중복없이"
	private boolean isSame(int[] arr, int insert) {
		boolean same = false; 
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]== insert) { // arr[i] 번지의 값과 insert (랜덤으로 나온값 ) 이 같다면 
				same=true;
				break;
			}
		}
		return same;
	}
	
	
	//정렬 (작은 수 부터 큰 수 까지 ) 
	private void sort(int[] arr) {
		
		for (int i=0; i<arr.length;i++) {
			for(int j=1; j<arr.length; j++) {
				if (arr[j]<arr[j-1]) { // j가 2일 때 2번지와 1번지값 비교해서 오른쪽값이 왼쪽값보다 작다면 
					int tmp=arr[j]; // j의 값을 tmp 라는 곳에 저장하고 
					arr[j]=arr[j-1];// j-1 값을 j값으로 이동시켜주고 즉 왼쪽과 오른쪽 자리를 바꿔주는것 
					arr[j-1]=tmp; // j-1자리에는 아까 tmp 에 넣어놨던 j값을 넣어주는 것 
				}
			}
		}
	}
	
	public void prn() {
		int[] arr = make(); // 중복되지 않은 값을 만듦 
	
		sort(arr); // 얘는 정렬 인접한 두가지 값을 비교하는것을 버블정렬이라고 함 
		
		System.out.print("{");
		for(int i = 0 ; i<arr.length;i++) {
			System.out.printf("%3d",arr[i]);
		}
	    System.out.println("}");
		 
	}
		
		
		
		
		
		
		
		
	
}
