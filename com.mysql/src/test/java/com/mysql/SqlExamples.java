package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlExamples {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/testingcampus");
		Statement stement=connection.createStatement();
		ResultSet result=stement.executeQuery("select Ename from employee where eid=101");
		//System.out.println(result);
		
		while(result.next()) {
		
		System.out.println(result.getString(1)+result.getString(2));
		}
	}

}
