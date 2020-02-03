package br.com.agendaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo  extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest rquest, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Oi mundo Servlet! pqp será que funciona essa bosta!!!!!!!!!!!!!!!!!!!!!111</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
