package mult;

public class Multailm {
	
	public String namemult;
	public double kinopoisk;
	
	public void init(String a) {
		this.namemult = a;
		
	}
	public double setKinopoisk(){
		if (namemult == "������ ���") return 8.8; else
		if (namemult == "�����������") return 7.1 ;else
		if (namemult == "��� ��� �������� � ���") return 7.9 ;
		else return 0;
	}
	
}
