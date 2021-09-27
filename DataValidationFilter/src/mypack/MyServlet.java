package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertdata")
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		
		out.println("Data Inserted Successfully!");
		out.println(id);
		out.println(uname);
		out.println(email);
		
		//response.getWriter().append("\n\nServed at: ").append(request.getContextPath());
	}


}
