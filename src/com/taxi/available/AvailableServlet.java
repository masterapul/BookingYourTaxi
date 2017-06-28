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
		pw.println("<form action='reserve' method='post'>");
		pw.println("<table align='center'>");
		pw.println("<tr><td><h1>Hi You Can Reserve your taxi for "+result+" hour</h1></td></tr>");
		//sending result(total booking time to next page)
		pw.println("<input type='hidden' name='hname' value="+s+">");
		
		pw.println("<tr><td><input type='radio' value='taxi1' name='t'>TAXI1</input></td>");
		pw.println("<td><input type='radio' value='taxi2' name='t'>TAXI2</input></td>");
		pw.println("<td><input type='radio' value='taxi3' name='t'>TAXI3</input></td></tr>");
		pw.println("<tr><td><input type='submit' value='BOOK YOUR TAXI'>");
		pw.println("</table>");
		pw.println("</form>");
		pw.println("<br>");
		
			
		
			pw.println("<center style=color:black>Hi, There 1 Taxis are available for You");
		
			pw.println("</body>");
			
		
		}
		
		
		
		
		
		
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}

}
