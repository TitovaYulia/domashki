package com.z24;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Zadanie24Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		int mass[][] = new int [5][8];
		int a=-99, b=199;
		int max = -99;
		for (int i=0; i<5; i++){
			for (int j=0; j<8; j++){
				mass[i][j]= a + (int) (Math.random() * b);
				resp.getWriter().print("   " + mass[i][j] );
				if (mass[i][j] > max ){
					max=mass[i][j];
				}
			}
			resp.getWriter().print("<p>");
		}
		resp.getWriter().print("Максимальное значение массива: "+max);
	}
}
