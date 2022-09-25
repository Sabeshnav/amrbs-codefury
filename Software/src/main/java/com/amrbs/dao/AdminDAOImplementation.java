package com.amrbs.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.amrbs.dbconnection.MySQLConnect;
import com.amrbs.interfaces.UserDAO;

public class AdminDAOImplementation implements UserDAO
{

	@Override
	public void login(int id, String email, int pin )
	{
		MySQLConnect m = new MySQLConnect();
		PreparedStatement stat1 = null;
		try {
			 stat1 = MySQLConnect.getCon().prepareStatement("select * from users where (id=? and email=?)");
			 stat1.setInt(1, id);
	         stat1.setString(2, email);
	         ResultSet rs = stat1.executeQuery();
	         while(rs.next())
	         {
	        	 if(rs.getInt("id") == pin)
	        	 {
	        		 System.out.println("log in successful");
	        	 }
	         }
	         rs.close();
	         stat1.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
