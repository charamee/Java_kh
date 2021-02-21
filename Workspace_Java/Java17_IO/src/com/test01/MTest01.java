package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		
		
		File fi = new File("C:/test_io"); //씨드라이브안에 test _io 폴더 만든거 
		
		if (fi.exists()) {
			System.out.println("exists");
		}else {
			System.out.println("make directory");
		}fi.mkdirs();
		
		//fi 안에 (밑에)
		
		File fiAA = new File(fi,"AA");
		fiAA.mkdir();
		
		File fiBB = new File ("C:\\test_io","BB"); // \t \n 이렇게 되기때문에 역슬랙쉬 두개를 해야 찐 역슬래쉬
		fiBB.mkdir();
		
		// AA 밑에 a.txt 파일 생성
		
		File aTxt = new File(fiAA,"a.txt");
		
		try { //java.io 는 거의 checked exception. 
			//checked exception : 컴파일하기전에 예외를 반드시 처리해야함. > 이클립스가 미리 알려줌 (빨간줄 뜨면서 예외처리하라고 함) 
			aTxt.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
