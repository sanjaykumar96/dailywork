package com.cts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sanjay")
public class MyServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		
		
		// TODO Auto-generated method stub
		 
		super.init();
		System.out.println("from init_get called alway ones");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("from init_get called multiple times");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("from destroy called  ones");
	}

}
