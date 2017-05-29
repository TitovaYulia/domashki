package com.z22;

import java.io.IOException;


import javax.servlet.http.*;



@SuppressWarnings("serial")
public class Zadanie22Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");

		String var1 = req.getParameter("var1");
		int a = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		int b = Integer.parseInt(var2);
		String var3 = req.getParameter("var3");
		int c = Integer.parseInt(var3);

		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			resp.getWriter().println("Корней нет");
		} else {
			double h1 = (-b + Math.pow(d, 0.5)) / (2 * a);
			double h2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			resp.getWriter().println("Первый корень уравнения " + h1 + "<p>");
			resp.getWriter().println("Второй корень уравнения " + h2);
		}
	}
}
