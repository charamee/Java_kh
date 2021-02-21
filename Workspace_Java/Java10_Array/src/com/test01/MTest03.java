package com.test01;

import java.util.Arrays;

public class MTest03 {

	
	/*1)
	 * a b c d e f 
	 * g h i j k l 
	 * m n o p q r 
	 * s t u v w x 
	 * y z 
	 * 출력! 
	 * 단, 일차원 배열 (char[]) 에 반복문을 사용하여 알파벡을 저장한 후에 출력하자. 
	
	 * 
	 */
	public static void main(String[] args) {
		char[] ch =new char[26]; // character 는 아스키 코드로 숫자와 문자로 변경 가능함// new char [26] 26가지의 배열  
		for (int i= 0; i<ch.length; i ++) {
			ch[i]= (char)('a' +i); // a 는 아스키코드로 변환 96 + 0 = 다시 a 로 치환 ~ z까지 반복 
			
		}System.out.println(Arrays.toString(ch));
		
		for (int i = 1; i<=ch.length;i++) { // i의 1부터 26 까지 돌아갈것임 
			System.out.print(ch[i-1]+ " "); // 우리가 필요한건 ch[0]부터 [25] 니까 i-1 을 해줌 
			if (i % 6==0) {
				System.out.println();
			}
		}
		
		System.out.println("\n");
		//2. 1번에서 만든 배열을 거꾸로 출력하자. 
		int tmp = 1; 
		for (int i = ch.length; i>0; i --) {
			System.out.printf("%s ",ch[i-1]);// ch [i-1] , i가 26 일때 ch[25] 는 z 출력되니까 
			if (tmp % 6==0) {
				System.out.println();
			}
			tmp++;
		}
		
		System.out.println("\n");
		//3. 1번에서 만든 배열을 대문자로 바꾸어 출력. 
		int cnt = 1 ; 
		for (int i = 0; i <ch.length; i ++) {
			ch[i]=Character.toUpperCase(ch[i]); //ch [i] 의 값을 to UpperCase 대문자로 바꿔서 대입하자 
			System.out.printf("%s ", ch[i]);
			
			if (cnt %6==0) {
				System.out.println();
			}
			cnt ++;
		}
		
		
		
		
	}
}
