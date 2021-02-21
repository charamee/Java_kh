package com.test01;

import java.io.IOException;

public class RuntimeTest {
	
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime(); //new안쓰니까 싱글톤
	
	try {
		Process prc = rt.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); //해당 주소값을 실행한다 .
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	

	}	
}
