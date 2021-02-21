package com.lotto;

public class LottoAgain {

	public int[] make() {
		int[] arr = new int[6];

		for (int index = 0; index < arr.length; index++) {
			int insert = (int) (Math.random() * 45) + 1;

			if (!isSame(arr, insert)) {
				arr[index] = insert;
			}
		}
		return arr;
	}
	
	public boolean isSame(int[] arr, int insert) {

		boolean same = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == insert) {
				same = true;
				break;
			}
		}

		return same;
	}
	
	public void sort(int [] arr) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=1; j<arr.length;j++) {
				
				if(arr[j]<arr[j-1]) {
					int blank= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=blank;
					
				}
		    }
		}
	}
	
	
	public void prn02() {
		int [] arr=make();
		sort(arr);
		
		System.out.print("로또 번호는"+"{");
		for(int i =0; i<arr.length;i++) {
			System.out.printf("%3d",arr[i]);
		}
		System.out.print("}"+"입니다.");
		
		
		
	}
	
}
