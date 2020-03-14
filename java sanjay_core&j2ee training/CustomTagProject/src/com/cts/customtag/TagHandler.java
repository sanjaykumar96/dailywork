package com.cts.customtag;



import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		System.out.println("from dostarttag()");
		
		
		//pageContext.getOut();
		JspWriter out=pageContext.getOut();
		try {
			out.write("<h1>"+new Date()+"</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return EVAL_BODY_INCLUDE;//to include body inside tag
		return SKIP_BODY;
		
		}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("from doEndtag()");
		//return super.doEndTag();
		return EVAL_PAGE;//to include page which is out side tage considered as page
	}

}
