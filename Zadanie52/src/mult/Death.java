package mult;

public class Death {
	
	public String yesno;
	
	public void init(String a) {
		this.yesno = a;
		
	}
	public String setDeath(){
		if (yesno == "������ ���") return "������"; else
		if (yesno == "�����������") return "������" ;else
		if (yesno == "��� ��� �������� � ���") return "����" ;
		else return "";
	}

}
