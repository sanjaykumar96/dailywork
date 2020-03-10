package com.cts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/RequestHandlerServlet")
public class SecondFilter implements Filter {
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("from init of second filter");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (request.getParameter("pwd").equals("patel")) {
			chain.doFilter(request, response);
		} else {
			response.getWriter().write("<h1>invalid password</h1>");
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("from destroy of second filter");
	}

}
