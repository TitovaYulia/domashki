package com;

import mult.Multailm;
import mult.Genre;
import mult.Death;
import mult.Role;
import mult.Quantity;

public class Test {

	public static void main(String[] args) {
		
		
		String mult="Король лев";
		
		
		Genre g = new Genre();
		g.init(mult);
		System.out.println("Жанр выбранного мультфильма: " + g.setGenre());
		
		Death d = new Death();
		d.init(mult);
		if (d.setDeath()=="правда") 
		System.out.println("Герой этого мультфильма умрет");
		else System.out.println("Ни один герой этого мультфильма не умрет");
		
		Role r = new Role();
		r.init(mult);
		System.out.println("В этом мультфильме будут присутствовать следующие персонажи: " + r.setRole());

		Quantity q = new Quantity();
		q.init(mult);
		System.out.println("Колличество главных персонажей в мультфильме: " + q.setQuantity());
		
		Multailm film = new Multailm();
		film.init(mult);
		if (film.setKinopoisk()!=0)
		System.out.print("Рейтинг на кинопоиске: " + film.setKinopoisk());
		else System.out.print("Рейтинг выбраннойго мультфильма неизвестен");

	}
}
