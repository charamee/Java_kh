package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest05 {

	public static void main(String[] args) {
		File fi= new File("b.txt");
		
		MyOutput(fi);
		MyInput(fi);
	}
	
	private static void MyInput(File fi) {
		//try with resources
		try(FileReader fr = new FileReader(fi)){ // try () 안에 들어가있는 객체를 넣으면 close를 알아서 해줌. 
			//기본 try catch finally 가 있으면 우리가 열고 우리가 닫아야함close(); try with resources 는 try 안에 () 추가하여 넣어서 알아서 close. 
			int ch;
			
			while ((ch = fr.read()) !=-1) {
				System.out.print((char)ch);
			}
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void MyOutput(File fi) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fi,true);
			fw.write("다시 연습힌다.");
			fw.append("abc\n");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close(); // 얘한테서 IOException날 수 있기 떄문에 다시한번 트라이 캐치 해주면서 닫는다. 
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}


