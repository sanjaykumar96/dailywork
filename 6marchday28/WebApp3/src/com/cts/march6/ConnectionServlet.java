package com.cts.march6;

import java.io.IOException;
import java.sql.DriverManager;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
public class ConnectionServlet extends HttpServlet{
	String user, password, url, driver;
	Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");
		url= config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			con = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello from service ser1!");
	}
}
