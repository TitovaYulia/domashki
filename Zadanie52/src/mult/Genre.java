package mult;

public class Genre {

	public String nameganre;
	
	public void init(String a) {
		this.nameganre = a;
		
	}
	public String setGenre(){
		if (nameganre == "������ ���") return "�����"; else
		if (nameganre == "�����������") return "����� ������� �����" ;else
		if (nameganre == "��� ��� �������� � ���") return "�������" ;
		else return "+";
	}
}
