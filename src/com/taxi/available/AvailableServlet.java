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
		int available=3;
		//general setting
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<body bgColor='green'>");
		
	
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
		pw.println("<center><u><h1>BOOK YOUR TAXI</h1></u></center>");
		pw.println("<br>");
		pw.println("<input type='radio' value='taxi1' name='t'>TAXI1</input>");
		pw.println("<input type='radio' value='taxi2' name='t'>TAXI2</input>");
		pw.println("<input type='radio' value='taxi3' name='t'>TAXI3</input>");
		
	
		pw.println("<br>");
		int wanted=1;
		try {
			Thread.sleep(2000);

			pw.println("Hi You Reserve your taxi for "+result+" hour");
		
			pw.println("<center style=color:black>Hi, There 1 Taxis are available for You");
			int available1=available-wanted;
			pw.println("Now total available of taxi is"+available1);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		pw.println("</body>");
		
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}

}
