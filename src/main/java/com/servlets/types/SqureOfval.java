package com.servlets.types;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqureOfval extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int total = (int) req.getAttribute("rel");
		total = total * total;

		PrintWriter writer = resp.getWriter();
		writer.print("<h1> this is squre type of servlett </h1> " + total);

	}

}
