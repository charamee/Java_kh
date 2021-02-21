package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//db 연결, 연결해제, 원할때만 commit(저장) , 취소 (rollback) 
// 메소드를 static 으로 만들자. -> 객체가 계속 생성되는것을 막기 위해 or 싱글톤으로 만들어서 객체 한번만 만들어서도 가능 
public class JDBCTemplate {

	// 1.
	// 2. dao 단계에서 1,2 번이 계속 반복되기때문에 만들어준 클래스이다. 
	//5. close 도 일일히 try catch 하기 귀찮으니까 메소드를 미리 만들어 놓는다. 

	public static Connection getConnection() {
		// 1.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false); // 내가 원할때만 commit 하겠다는 뜻 autocommit을 안하겠다. 
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
	//5. db 종료 메소드 

	public static void close(Connection con) { // 같은 close이름으로 여러가지 다른것을 하는거 > 오버로드
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) { // preparedStatement 는 자식객체이기때문에 안써도 이걸로 호출 가능 
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
