package mult;

public class Genre {

	public String nameganre;
	
	public void init(String a) {
		this.nameganre = a;
		
	}
	public String setGenre(){
		if (nameganre == "Король лев") return "драма"; else
		if (nameganre == "Франкенвини") return "драма фентези ужасы" ;else
		if (nameganre == "Все псы попадают в рай") return "фентези" ;
		else return "+";
	}
}
