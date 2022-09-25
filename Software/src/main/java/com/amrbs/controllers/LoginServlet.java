package com.amrbs.controllers;

import java.io.IOException;

import org.json.JSONObject;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
        JSONObject user1 = new JSONObject();
        try {
        	user1.put("name", "TOM");
			user1.put("age", "26");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        response.setContentType("application/json");
        response.getWriter().write(user1.toString());
	}
}
