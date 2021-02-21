package com.test04;

public class Student {
	public static int getSum(int kor, int eng, int math) {
		int res = kor + eng + math; // <res 는 변수의 이름일 뿐
		return res;
	}

	public static double getAvg(int sum) {
		return sum / 3.0; // double로 리턴됐기 때문에
	}

	public static void main(String[] args) {
		int kor, eng, math; //선언만 한거  

		kor = 100;
		eng = 39;
		math = 78;

		int sum=0 ; // 없어도 되는 값이지만 sum 이라는 변수 쓰겠다는 선언문
		double avg=0 ;
		sum = getSum(kor, eng, math);
		System.out.printf("총 합: %d\n", sum);
		// avg = getAvg(sum);
		avg = getAvg(getSum(kor, eng, math));
		System.out.println("평 균:" + avg);

		/*
		 * 1.과목 파라미터 세개를 넣어주면 총점을 리턴하는 getSum 이라는 이름의 메서드를 만들자. 2. 총 합 파라미터 한개를 가진
		 * getAvg라는 이름의 메서드를 만드는데, 리턴은 평균을 리턴한다. 3. main 메서드에서 위의 메서드들을 호출하여 각각 sum 변수와
		 * avg 변수에 리턴되는 값을 담고 , 해당 변수들을 출력하자.
		 * 
		 * +평균은 소수점 둘쨰자리까지만 출력하자.
		 *
		 */
	}

}
