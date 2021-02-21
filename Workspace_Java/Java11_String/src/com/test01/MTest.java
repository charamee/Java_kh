package com.test01;

public class MTest {
	
	private static String str ="The String class represents character strings."; //문자열 = char [ ] 과 같다 

	public static void main(String[] args) {
		String s = "Hello";  // 기본타입 spring pool 안에 Hello 값이 둥둥 떠다님 
		System.out.println(s+1+2); // 문자열이 먼저 시작 , Hello 라는 값은 그대로 두고 Hello12 라는 새로운 값이 풀장에 생김 
		System.out.println(1+2+s); //3 hello! 가 나옴 연산자 우선순위 ! 왼족에서 오른쪽으로 더하기 때문임 
		System.out.println(s); // immutable 하기 때문에 그대로 Hello 가 출력 
		
		//s=1+2+s; // 이렇게 만들어줘야 ! > 스트링 풀에 있는 값이 나오면 그 값이 s로 바뀌어버림 
		//System.out.println(s); // 3Hello 로 나옴 
		
		String h = "Hello";
		System.out.println(h);
		
		System.out.println(s==h); // why? 기본타입처럼 써서 spring pool 안에 있는 값을 쓰는데(새로 안만들고), 같은 값을 쓰기 때문에 s,h모두 같은값
		
		String newS= new String ("Hello"); // 참조타입. 새로운 스트링 객체가 만들어짐 
		System.out.println(newS);
		System.out.println(s==newS);
		
		System.out.println("----------------------------");
		
		//1. str의 길이 
		test01();
		
		//2. str 전체 대문자로 출력
		test02();
		
		//3. str 전체 소문자로 출력 
		test03();
		
		//4. str에서 첫번째로 나오는 c의 위치 (인덱스)
		test04();
		
		//5. class 단어를 찾아서 java 로 바꿔서 출력 
		test05();
		
		//6. character 단어를 찾아서 대문자로 변환 후 , 전체 출력 
		test06();
		//7. str을 char[] 로  출력하되, 'c' 만 출력하자.  
		//그리고 c의 갯수를 출력
		test07();
		//8. str을 char[]로 출력하되, 대문자만 출력하자.그리고 대문자의 갯수를 출력 
		test08();
		//9. str 사이의 공백 제거 후 출력 
		test09();
		//10. 전체를 역순으로 출력 
		test10();

		
		
	}

	private static void test10() {
		int arrIndex=0;
		char[] ch = new char[str.length()]; // 새로운 배열을 만들어준것 (얘는 str과 길이가 같은 비어있는 배열임) 
		
		for(int i=str.length()-1;i>=0;i--) {
			ch[i]=str.charAt(arrIndex);
			arrIndex++;
		}
		System.out.println(ch);
	}

	private static void test09() {
		System.out.println(str.trim());
		System.out.println(str.replace(" ",""));
		System.out.println(str.replaceAll(" ",""));
	}

	private static void test08() {
		char[] ch= str.toCharArray(); // 배열로 만들어 주는것 
		int count =0 ;
		for(int i = 0; i <ch.length;i++) {
			// ch[i] > "char" > isUppercase(); 대문자 인지 아닌지 알고싶을때 
			if(Character.isUpperCase(ch[i])) {
				System.out.printf("%c",ch[i]);
				count++;
				
			}
		}
		System.out.println("\n대문자의 갯수 : "+count);
	}

	private static void test07() {
		char[] ch= str.toCharArray();
		int count = 0 ;
		
		for(int i = 0 ; i<ch.length;i++) {
			//System.out.printf("%c" , ch[i]);
			if(ch[i] == 'c' || ch[i] == 'C') {
				System.out.printf("%c " , ch[i]);
				count++;
			}
		}
		System.out.printf("\nc의 갯수 :" +count);
		System.out.println();
		
	}

	private static void test06() {
		//cahranter 찾기 
		String target= "character"; //character 라는 단어가 어디서 부터 시작해서 어디서 끝나는지 찾아야함 
		int start = str.indexOf(target); // start index를 찾고 character라는 단어의 길이 length 만큼 
		int end=start+target.length();//더하면 end 가 나올것임 .
		String upper= str.substring(start,end);
		//대문자로 변환
		upper= upper.toUpperCase(); // 대문자로 만들고 다시 upper 에 대입을 해줘야 값이 바뀜 ! immutable ! 
		//전체출력
		System.out.println(str.replace(target,upper));
		
	}

	private static void test05() {
	
		
		System.out.println(str.replace("class", "java"));
	}

	private static void test04() {
		
		System.out.println(str.indexOf('c')); 
		
	}

	private static void test03() {
		String lower = str.toLowerCase();
		System.out.println(lower);
	}

	private static void test02() {
		System.out.println(str.toUpperCase());
		
	}

	private static void test01() {
	
		int a = str.length();
		System.out.println(a);
		
	}
}
