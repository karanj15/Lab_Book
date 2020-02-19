package com.cg.iter.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="iter";
		String password="iter123";
		Connection conn=null;
		String query= "update emp set mobile=? where id=?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn= DriverManager.getConnection(url, user, password);
			PreparedStatement stmt= conn.prepareStatement(query);
			System.out.println("Enter <id> <mobile> to update");
			stmt.setInt(2, in.nextInt());
			stmt.setLong(1, in.nextLong());
			int rows= stmt.executeUpdate();
			if(rows>0) System.out.println("Data updated");
			else System.out.println("Failed to update");
		} catch (ClassNotFoundException e)
		{
			System.out.println("Driver class not loaded");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try{ if(conn!=null)conn.close();}
			catch(SQLException e){
			}
			}
		}
	}


