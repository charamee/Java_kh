package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest0 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ojdbc6.jar (꼭 추가해야한다 !!) 
		//파일 안에  oracle.jdbc.driver.OracleDriver 이게 들어있다. 
		//1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver"); // import랑 비슷한 개념이다. 
		
		//2.계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 디비버에 네비게이터와 같은 
		String user= "kh";
		String password ="kh";
		
		Connection con = DriverManager.getConnection(url, user, password); // 이클리스와 데이터베이스를 연결한 정보를 connection이 가지고 있다. 
		
		
		//3. qeury 준비
		String sql= " SELECT * FROM EMP "; // 쿼리 쓸때는 따옴표 앞뒤에 ★공백 넣어야한다★
		Statement stmt = con.createStatement(); // 전달 된 값을 실행해서 리턴해줄 애
		
		//4. qeury 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql); //자바에서는 위에서 전달된 값을 executeQuery 메소드를 실행하여 Resultset으로 리턴해준다. select * from emp 의 값이 저장된다 전체 로우를 가져올거니까 
		while (rs.next()){ // 토크나이저에서 배웠던 커서가 있는데 hasnext 라고 생각한다 다음 값이 없으면 false 
			System.out.printf("%5d %11s %9s %5d %10s %8.2f %8.2f %2d \n", 
					rs.getInt(1),rs.getString(2),rs.getString("JOB"),rs.getInt(4), //컬럼에 있는 타입에 따라 호출하는 값에 맞는 호출언어를 입력해준다. getInt,String,Double,Date 등등
					rs.getDate(5),rs.getDouble("SAL"),rs.getDouble(7),rs.getInt(8)); //인덱스값에 숫자로해도되고 컬럼이름으로 해도 된다 , 소수점을 받으려면 double로 값 호출해야한다. 
		}
		//5. db 종료 마지막에 열었던것 부터 역순으로 닫아준다 
		rs.close();
		stmt.close();
		con.close();
		
	}

}
