package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Connection conn;

		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?zeroDateTimeConversionBehavior=convertToNull", "root", "password");
		PreparedStatement stmt = conn.prepareStatement("select * from user");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.println("Result -> " + rs.getString(1) + "--" + rs.getString(2) + "--" + rs.getString(3));
		}
		conn.close();
	}
}
