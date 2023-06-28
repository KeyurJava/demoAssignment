package com.servlets.types;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstServlet implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.getWriter().write(getServletInfo());

	}

	@Override
	public String getServletInfo() {

		return "This is First type of servlet";
	}

	@Override
	public void destroy() {

	}

}
