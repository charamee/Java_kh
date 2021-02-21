package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest01 {
	
	public static void main(String[] args) throws IOException {
		
		String file = "a.jpg";
		/*
		FileInputStream fi = new FileInputStream(file);
		
		BufferedInputStream bi = new BufferedInputStream(fi);
		*/
		//위의 두줄을 한줄로 
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));//가지고오는거니까 Input
		//buffered 는 덩어리로 잘라서 뭉텅이로 가져옴 a.jpg파일을 버퍼드로 잘라서 가져올때 이렇게 사용함. 
		 
		
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));//다시 c.jpg로 내보낸거니까 Output
		
		int a = 0;
		while((a= bi.read()) != -1) {
			fo.write(a);//굳이 버퍼드로 뭉쳐놓고 하나씩 가져오고 있긴 함.
		}
		//가장 마지막에 연결한 객체를 가장 먼저 닫자 !! 
		fo.close(); //fileoutputstream 을 먼저 닫아야함 
		bi.close();
		
	}

}
