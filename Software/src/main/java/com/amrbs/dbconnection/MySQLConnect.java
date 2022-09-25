package com.amrbs.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect
{
	private static Connection con = null;
	
	public MySQLConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amrbs_db", "root", "Sabeshnav12!@");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static Connection getCon() {
		return MySQLConnect.con;
	}

	public static void setCon(Connection con) {
		MySQLConnect.con = con;
	}
	
	
	
}

