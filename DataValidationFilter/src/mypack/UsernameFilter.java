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
public class UsernameFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)  throws IOException, ServletException {

		System.out.println("Username Filter Executed.");

		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		int unameLength = uname.length();

		System.out.println(unameLength);

		if (unameLength > 3 && unameLength < 10) {
			chain.doFilter(request, response);
		} else {
			out.print("Invalid username! Username length should be > 3 and < 10.");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
