package mult;

public class Quantity {

	public String number;

	public void init(String a) {
		this.number = a;
		
	}
	public String setQuantity(){
		if (number == "Король лев") return "1"; else
		if (number == "Франкенвини") return "2" ;else
		if (number == "Все псы попадают в рай") return "3" ;
		else return "";
	}
	}

