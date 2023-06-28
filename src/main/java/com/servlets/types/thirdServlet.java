package com.servlets.types;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

@WebServlet("/testing")
public class thirdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));

		int tot = n1 + n2;

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h1> this is third type of servlett </h1> " + tot);

		RequestDispatcher dispatcher = request.getRequestDispatcher("sq");
		request.setAttribute("rel", tot);
		// dispatcher.forward(request, response);
		dispatcher.include(request, response);

		// System.out.println("==>" + dispatcher.getClass());

	}

	public void doget(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h1> this is third type of servlet </h1>" + n1 + n2);

	}

	public void dopost(HttpServletRequest request, HttpServletResponse response) {

	}

}
