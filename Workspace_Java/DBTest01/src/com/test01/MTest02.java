package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest02 {

	public static void main(String[] args) {
		
		try {
			selectList();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void selectList() throws ClassNotFoundException, SQLException {
		
		//1. driver 연결 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//2. 계정 연걸 
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh"; 
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		//3. query 준비 
		String sql = " SELECT DEPTNO, DNAME, LOC " // 공백을 안하면 LOCFROM dept 
					+" FROM DEPT ";
		Statement stmt = con.createStatement();
		
		//4. query 실행 및 리턴 
		ResultSet rs = stmt.executeQuery(sql);//Statement의 executeQuery메소드는 SELECT문일때 전달된 값을 ResultSet 타입으로 리턴한다. 
		while (rs.next()) {
			System.out.println(rs.getInt("DEPTNO") +"\t" + rs.getString(2)+ "\t"+ rs.getString(3));
			
		}
		//5. db 종료 
		rs.close();
		stmt.close();
		con.close();
		
		
		
		
		
	}
}