
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class zadanie7 {

	public static void main(String[] args) {
		// ArrayList<String> alf = new ArrayList<String>();
		String mass[];
		Scanner in = new Scanner(System.in);

		System.out.println("������� ���� ����� � �������");
		int a = in.nextInt();
		mass = new String[a];
		System.out.print("������� �����");
		for (int i = 0; i <= (a - 1); i++) {
			mass[i] = in.next();
		}
		Arrays.sort(mass);
		System.out.println();
		System.out.println("��� ������� � ���������� �������:");
		for (int i = 0; i <= (a - 1); i++) {
			System.out.println(mass[i] + " ");
		}
	}

}
