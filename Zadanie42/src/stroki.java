import java.util.Scanner;

public class stroki {

	public static void main(String[] args) {
		String stih = new String(
				"Сказать, что ты мертва? \n Но ты жила лишь сутки \n Как много грусти в шутке творца, \n Едва могу произнести жила!");

		Scanner in = new Scanner(System.in);
		String mass[][] = new String[4][8];
		int a = 0;
		int b = 0;
		String q;

		for (String retval : stih.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				b++;
				a = 0;
				System.out.println();
			} else {
				
				System.out.printf("%10s", mass[b][a] = retval + "\t");
				a++;
			}

		}

		System.out.println("\n Введите искомое значение");
		q = in.next();
		System.out.println("Координаты этого слова");
		int s = 0;

		for (a = 0; a < 4; a++) {
			for (b = 0; b < 8; b++) {
				if (mass[a][b]!=null){
				s = mass[a][b].indexOf(q);
				if (s != -1) {
					System.out.println(a + " " + b);	
				}
				}
			}
		}
		
	}
}
