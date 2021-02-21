package com.test01;

import java.io.File;

public class MTest02 {

	public static void main(String[] args) {
		File fi = new File("c:\\");
		//prnList01(fi);		
		prnList02(fi);
		
	}
	public static void prnList02(File fi) {
		//파일과 디렉토리를 구분해서 출력하자. listFiles
		//file : swapfile.sys
		//dir : Program FIles 
		// 폴더의 갯수 : 0 개 
		//파일의 갯수 : 0게 
		int fileCount = 0;
		int dirCount = 0;
		
		for(File f : fi.listFiles()) {
			if(f.isDirectory()) {
				System.out.println("dir : "+f.getName());
				dirCount++;
			}else if(fi.isFile()) {
				System.out.println("file : "+f.getName());
			    fileCount++;
			}
		}
		
		System.out.println("file의 갯수 :"+ fileCount);
		System.out.println("dir의 갯수 : "+ dirCount);
		
	}
	
	
	
	
	public static void prnList01(File fi) {
		for(String list : fi.list()) {
			System.out.println(list);
		}
	}
	
	
	
}
