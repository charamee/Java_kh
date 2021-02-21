package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		
		File fi = new File("a.txt");
		
		try {
		MyOutput(fi);
		MyInput(fi);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//자바에서 파일로 가는건 output , 파일에서 자바로 오는건 input 
	private static void MyInput(File fi) throws IOException {
		FileInputStream fin= new FileInputStream(fi);
		int res = 0; 
		
		//file의 내용 끝 = -1 
		while ((res=fin.read()) !=-1){ // 텍스트부분에 값이 없을때 -1을 리턴함 read 가 값을 하나씩 가져옴 
			System.out.println((char)res);
		}
		fin.close();
	}
	
	//throws : 해당 메소드 내부에서 발생할 수 있는 예외를, 메소드 호출하는 곳으로 위임
	//        > main 메소드에서 메소드호출인 MyOutput(fi);MyInput(fi);에 빨간줄
	private static void MyOutput(File fi) throws IOException { //FileNotFoundException>>IOException 으로 바뀜 포함되는 영역임. 
		FileOutputStream fo= new FileOutputStream(fi); // code>a.txt로 outputstream 
		
		for(int i=65;i<91;i++) { // 이 숫자는 byte값 65바이트는 A :ASKII CODE 
			fo.write(i); // write 메소드는 파일에 글을 써주는 메서드 
		}
		//반드시 close!! 
		fo.close();
	}
	
	
}
