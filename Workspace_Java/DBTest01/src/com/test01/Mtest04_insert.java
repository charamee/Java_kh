package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mtest04_insert {
	
	//DEPT 테이블에 값 저장하기 

	public static void main(String[] args) {
		//insert();
		insertForPrepared();
		
	}
	
	public static void insertForPrepared() {
		Scanner sc= new Scanner (System.in);
		System.out.println("부서 번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("근무지역 입력 : ");
		String loc = sc.next();
		
		
		//1.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con= null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//3.
		String sql = " INSERT INTO DEPT "
				+ " VALUES (?,?,?) "; // ??? 값을 넣어주겠다는 것 아래 pstm.setInt,String, 등등으로 값을 넣어준다. 
		//3-1 preparedStstement 
		PreparedStatement pstm =null; // preparedstatement 객체를 만들면서 동시에 값을 넣어준다. 
		try {
			 pstm = con.prepareStatement(sql);
			 pstm.setInt(1, deptno);
			 pstm.setString(2, dname);
			 pstm.setString(3, loc);
			
			 //4.
			 //4.2 insert,update,delete 
			 //int res = excuteUpdate();
			 int res = pstm.executeUpdate();
			 if(res>0) {
				 System.out.println("입력 성공");
			 }
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			
			//5.
		
		try {
			pstm.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
	public static void insert() {
		Scanner sc= new Scanner (System.in);
		System.out.println("부서 번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("근무지역 입력 : ");
		String loc = sc.next();
		
		//1. 드라이버 연결 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. 계정 연결 
		String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
		String user = "kh"; 
		String password = "kh";
		
		Connection con= null;
		try {
			con = DriverManager.getConnection(url, user, password); 
			// try 안에서 connection con = 어쩌고 이렇게 하면 지역변수가 되기때문에 이 안에서만 사용할 있게 된다. 
			//con.setAutoCommit(false); setAutoCommit : Sets this connection's auto-commit mode to the given state
			// commit : 데이터베이스에 트랜잭션을 저장하는 것 
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		//3. 쿼리 준비 
		//4. 쿼리 실행  3,4 묶어서 진행
		String sql = " INSERT INTO DEPT "
				+ " VALUES ( "+ deptno + ", '"+dname +"', '" + loc +"')"; // 문자열을 받는 것들은 양쪽에 싱글 쿼테이션 추가한다 
		
		Statement stmt = null;
		//ResultSet rs = null; 
		try { 
			//3.
			stmt = con.createStatement();
			//4. 
			int res = stmt.executeUpdate(sql);
			//executeUpdate() : insert, update, delete 된 결과가 int 형으로 리턴된다 (int 번째 Row가 생성되었다는 뜻의 int)
			if(res>0) {
				System.out.println("입력 성공");
				
			}else {
				System.out.println("입력 실패"); 
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			
			//5. 디비 종료 
		}finally {
			try {
				stmt.close();
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
