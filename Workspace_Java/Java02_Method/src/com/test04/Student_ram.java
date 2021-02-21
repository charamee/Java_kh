package com.test04;

public class Student_ram {
	
	    public static int getSum(int kor,int eng, int math) {
	    
	    	int res = kor+eng+math;
	    	return res;
	    } 
	    public static double getAvg(int sum) {
	    	
	    	
	    	return sum /3;
	    }
	    	 
			 /*
				 * 1.과목 파라미터 세개를 넣어주면 총점을 리턴하는 getSum 이라는 이름의 메서드를 만들자. 2. 총 합 파라미터 한개를 가진
				 * getAvg라는 이름의 메서드를 만드는데, 리턴은 평균을 리턴한다. 3. main 메서드에서 위의 메서드들을 호출하여 각각 sum 변수와
				 * avg 변수에 리턴되는 값을 담고 , 해당 변수들을 출력하자.
				 * 
				 * +평균은 소수점 둘쨰자리까지만 출력하자.
				 *
				 */
			 public static void main(String[] args) {
				int kor =100;
				int eng =89;
				int math =99;
				
				 
				 int sum =getSum(kor,eng,math);
				 double avg = getAvg(sum);
				 
				 System.out.println(sum);
				 System.out.println(avg);
			}
			 
	
	
}
