package com.cg.iter.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="iter";
		String password="iter123";
		Connection conn= null;
		String query= "select id, name,mobile,desig,dept,doj from emp";
		// 1. Add driver jar to library/classpath
		// 2. load the driver class
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3. Get the connection to DB
			System.out.println("Driver loaded successfully");
			//3. Get the connection to DB
			Connection conn1= DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established");
			//4. Create Statement using the connection object
			Statement stmt= conn1.createStatement();
			//5. Execute SQL query
			ResultSet rs = stmt.executeQuery(query);
			//6. Iterate through the ResultSet
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"," + rs.getString(2) +"," + rs.getLong(3)+ ","+ rs.getString(4) + ", " + rs.getInt(5)+ "," + rs.getDate(6));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not loaded");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try { if(conn!=null)conn.close();} catch (SQLException e) {}
		}
	
	}

}
