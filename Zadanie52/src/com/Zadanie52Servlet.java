
package com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mult.Genre;
import mult.Multailm;
import mult.Death;
import mult.Quantity;
import mult.Role;
import com.Test;

@SuppressWarnings("serial")
public class Zadanie52Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");

		String genre = req.getParameter("genre");
		String death = req.getParameter("death");
		String role = req.getParameter("role");
		String quantity = req.getParameter("quantity");

		
		int korollev1 = 0, vsepsi2 = 0, franken3 = 0;

		korollev1 = podschet("Король лев", genre, death, role, quantity);
		vsepsi2 = podschet("Все псы попадают в рай", genre, death, role, quantity);
		franken3 = podschet("Франкенвини", genre, death, role, quantity);
		
		
		int max=0;
		String m;
		
		max=korollev1;
		if (vsepsi2>korollev1) {
			max=vsepsi2;
			
			if	(franken3>vsepsi2)max=franken3;
		}
		else if	(franken3>korollev1)max=franken3;
		
		if (korollev1==0 && vsepsi2==0 && franken3==0)
			resp.getWriter().println("<div class=\"bad\">Введите хоть что-нибудь. Так не интересно...</div>");
		else{
			resp.getWriter().println("<div class=\"well\"> Вам наиболее подойдут следующие мультфилмы:  </div>" );
			
			if (korollev1==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\"> <b>Король лев </b> </div>" );
				Multailm film = new Multailm();
				film.init("Король лев");
				resp.getWriter().println("<div class=\"well\">  Рейтинг на кинопоиске  " + film.setKinopoisk() + "</div>");
			}
			if (vsepsi2==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\"> <b> Все псы попадают в рай </b> </div>" );
				Multailm film = new Multailm();
				film.init("Все псы попадают в рай");
				resp.getWriter().println("<div class=\"well\">  Рейтинг на кинопоиске  " + film.setKinopoisk() + "</div>");
			}
			if (franken3==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\">  <b>Франкенвини  </b> </div>" );
				Multailm film = new Multailm();
				film.init("Франкенвини");
				resp.getWriter().println("<div class=\"well\">  Рейтинг на кинопоиске  " + film.setKinopoisk() + "</div>");
			}
		}
	}
	

	public int podschet(String multf1, String genre1, String death1, String role1, String quantity1) {

		int sum = 0;
		int s;

		Genre g = new Genre();
		g.init(multf1);
		if (g.setGenre().indexOf(genre1) != -1)
			sum++;

		Death d = new Death();
		d.init(multf1);
		if (d.setDeath().indexOf(death1) != -1)
			sum++;

		Role r = new Role();
		r.init(multf1);
		if (r.setRole().indexOf(role1) != -1)
			sum++;

		Quantity q = new Quantity();
		q.init(multf1);
		if (q.setQuantity().indexOf(quantity1) != -1)
			sum++;

		return sum;
		
	}

}


