package com.mon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	public void  doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String uname=req.getParameter("uname");
		
		String password = req.getParameter("password");
		
		PrintWriter out =res.getWriter();
		
		ArrayList<String> uid=new ArrayList<String>();
		ArrayList<String> pid=new ArrayList<String>();
		
		
		if( uid.contains(uname) && pid.contains(password)) {
			
			out.println("login");
			
		}
		else if(uname.equals(null) && password.equals(null)) {
			
			res.sendRedirect("/login");
		}
		else {
			uid.add(uname);
			pid.add(password);
			out.print("Login Successfull");
		}
		
		for(String n:uid) {
			System.out.println(n);
			
			
		}
		
		
		
	}
	

}
