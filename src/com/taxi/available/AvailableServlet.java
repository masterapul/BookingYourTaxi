package com.taxi.available;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.SimpleTimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AvailableServlet extends HttpServlet  {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int x=3;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<body bgColor='green'>");
		pw.println("<center style=color:black>Hi, There "+x+" Taxis are available for You");
		pw.println("<a href='trap.jsp'>BOOK HERE</a>");
		String s=req.getParameter("txtResult");
		
		pw.println("your access time is "+s);
		//adding the integer of the string like 2 h 00 min=2*60=120 min 
		String something = s;
		int length = something.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
		    Character character = something.charAt(i);
		    if (Character.isDigit(character)) {
		        result += Character.getNumericValue(character);
		    }
		}
		pw.println("<br>");
		pw.println("Hi You Reserve your taxi for "+result+" hour");
		
		pw.println("<body>");
		
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}

}
