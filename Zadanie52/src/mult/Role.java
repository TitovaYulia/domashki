package mult;

public class Role {

	public String	namerole;
	
	public void init(String a) {
		this.namerole = a;
		
	}
	public String setRole(){
		if (namerole == "������ ���") return "���� ����� �������"; else
		if (namerole == "�����������") return "������ ������� ���� �����" ;else
		if (namerole == "��� ��� �������� � ���") return "������ ����" ;
		else return "+";
	}
}
