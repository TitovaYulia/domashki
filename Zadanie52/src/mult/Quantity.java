package mult;

public class Quantity {

	public String number;

	public void init(String a) {
		this.number = a;
		
	}
	public String setQuantity(){
		if (number == "������ ���") return "1"; else
		if (number == "�����������") return "2" ;else
		if (number == "��� ��� �������� � ���") return "3" ;
		else return "";
	}
	}

