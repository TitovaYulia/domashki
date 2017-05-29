package mult;

public class Death {
	
	public String yesno;
	
	public void init(String a) {
		this.yesno = a;
		
	}
	public String setDeath(){
		if (yesno == "Король лев") return "правда"; else
		if (yesno == "Франкенвини") return "правда" ;else
		if (yesno == "Все псы попадают в рай") return "ложь" ;
		else return "";
	}

}
