package com.jdbc.hib;

import java.sql.Connection;
import java.sql.DriverManager;

public class Check {
	
	
	public static void main(String args[])
	{
		String jdbcul="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			Connection con =DriverManager.getConnection(jdbcul,user,pass);
			System.out.println("sucess");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
