package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest03 {

	//DEPTNO를 입력받아서, 부서테이블의 해당 부서 모든 정보를 출력하자 
	//SELECT DEPTNO DNAME LOC 
	// FROM DEPT 
	//WHERE DEPTNO= ?? 
	public static void main(String[] args) {
		try {
			selectOne();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void selectOne() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호를 입력하세요 :");
		int deptno = sc.nextInt();
		
		//1. driver 연결 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. 계정 연결 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password); // 말그대로 자바와 디비를 연결 
			
		//3. 쿼리 준비 
		String sql = " SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " WHERE DEPTNO =" + deptno;
		
		Statement stmt = con.createStatement(); 
		//위에 한줄 가져온  deptno 는  row가 한 줄이다.  statement라는 객체를 만들어서 저장하고 resultset 으로 호출할수 있다 
		//4. 쿼리 실행 
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) { //while을 안하면 rs 안에 있는 커서가 움직이지 않아서 작동하지 않는다. 
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		//5. 디비 종료 
		rs.close();
		stmt.close();
		con.close();
		
	}
}
