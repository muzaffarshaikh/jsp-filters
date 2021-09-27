package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/insertdata")
public class EmailFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Email Filter Executed.");
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		
		if(email.contains("@") && email.contains(".com")) {
			chain.doFilter(request, response);
		} else {
			out.print("Invalid Email. Please enter a valid Email.");
		}		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
