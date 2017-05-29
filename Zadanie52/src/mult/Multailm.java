package mult;

public class Multailm {
	
	public String namemult;
	public double kinopoisk;
	
	public void init(String a) {
		this.namemult = a;
		
	}
	public double setKinopoisk(){
		if (namemult == "Король лев") return 8.8; else
		if (namemult == "Франкенвини") return 7.1 ;else
		if (namemult == "Все псы попадают в рай") return 7.9 ;
		else return 0;
	}
	
}
