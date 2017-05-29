package mult;

public class Role {

	public String	namerole;
	
	public void init(String a) {
		this.namerole = a;
		
	}
	public String setRole(){
		if (namerole == "Король лев") return "львы кабан сурикат"; else
		if (namerole == "Франкенвини") return "собаки монстры люди кошки" ;else
		if (namerole == "Все псы попадают в рай") return "собаки люди" ;
		else return "+";
	}
}
