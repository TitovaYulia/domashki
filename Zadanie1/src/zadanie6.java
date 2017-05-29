import java.util.Scanner;
import java.util.ArrayList;

public class zadanie6 {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		ArrayList<Character> arrost = new ArrayList<Character>();
		int a, ost, sum = 0, nov;
		System.out.println("Введите десятичное число");
		a = in.nextInt();

		ost = 16;
		while (a >= 16) {

			sum++;
			nov = a / 16;
			ost = a - nov * 16;
			a = nov;

			if (ost < 10) {
				arrost.add((char) (ost + 48));
			} else {
				arrost.add((char) (ost + 55));
				
			}
		}

		if (a < 10) {
			arrost.add((char) (a + 48));
			
		} else {
			arrost.add((char) (a + 55));
		}
		
		System.out.println("Ваше число в шестнадцатеричной записи");
		int i;
		for (i=sum ; i>=0; i--){
		
		System.out.print(arrost.get(i));	
		}
		
		
	}
}