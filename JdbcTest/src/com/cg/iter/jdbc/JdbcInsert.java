package com.cg.iter.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class JdbcInsert {

public static void main(String[] args) {
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String user="iter";
String password="iter123";
Connection conn=null;
String query="insert into emp(id,name,mobile,desig,dept,doj) values(?,?,?,?,?,?)";
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection(url,user,password);
PreparedStatement stmt=conn.prepareStatement(query);
stmt.setInt(1,8754);
stmt.setString(2,"Ashish");
stmt.setLong(3, 90133452245L);
stmt.setString(4, "Developer");
stmt.setInt(5, 5577);
LocalDate date=LocalDate.of(2020, 1, 22);
stmt.setDate(6, Date.valueOf(date));
int rows=stmt.executeUpdate();
if(rows>0)
System.out.println("Data inserted");
else
System.out.println("Failed to insert");
}catch (ClassNotFoundException e) {
System.out.println("Driver class not load");;
}catch (SQLException e) {
System.out.println(e.getMessage());
e.printStackTrace();
}finally {
try
{
if(conn!=null)
conn.close();
}
catch (SQLException e) {
}
}
}
}