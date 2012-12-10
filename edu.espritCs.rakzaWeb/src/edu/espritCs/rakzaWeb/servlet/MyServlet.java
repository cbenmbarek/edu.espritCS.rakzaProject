package edu.espritCs.rakzaWeb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		Date date = new Date();
		String name=request.getParameter("issm");
		
		printWriter.write("<html><body><h1> from "+name+" and it is : "
				+ date + " </h1> </body>  </html>");
		
	}

}
