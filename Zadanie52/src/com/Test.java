package com;

import mult.Multailm;
import mult.Genre;
import mult.Death;
import mult.Role;
import mult.Quantity;

public class Test {

	public static void main(String[] args) {
		
		
		String mult="������ ���";
		
		
		Genre g = new Genre();
		g.init(mult);
		System.out.println("���� ���������� �����������: " + g.setGenre());
		
		Death d = new Death();
		d.init(mult);
		if (d.setDeath()=="������") 
		System.out.println("����� ����� ����������� �����");
		else System.out.println("�� ���� ����� ����� ����������� �� �����");
		
		Role r = new Role();
		r.init(mult);
		System.out.println("� ���� ����������� ����� �������������� ��������� ���������: " + r.setRole());

		Quantity q = new Quantity();
		q.init(mult);
		System.out.println("����������� ������� ���������� � �����������: " + q.setQuantity());
		
		Multailm film = new Multailm();
		film.init(mult);
		if (film.setKinopoisk()!=0)
		System.out.print("������� �� ����������: " + film.setKinopoisk());
		else System.out.print("������� ����������� ����������� ����������");

	}
}
