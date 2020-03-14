package com.cts.bean;
//POJO Model JavaBean
public class LogicBean {
private String userName,password;

public LogicBean() {
	
}
public String getUserName() {
	System.out.println("from get username");
	return userName;
}

public void setUserName(String userName) {
	this.userName=userName;
	System.out.println("from set userName");
}

public String getPassword() {
	System.out.println("from getpassword");
	return password;
}

public void setPassword(String password) {
	this.password = password;
	System.out.println("from setPassword");
}
}
