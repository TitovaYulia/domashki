import java.util.Scanner;

public class zadanie1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mass[] = new double[5];
		System.out.println("Input 5 numbers");

		for (int i = 0; i < 5; i++) {
			mass[i] = in.nextDouble();
		}
		double q = Math.abs(mass[1])+10;
		
		double w = 0;
//		for (int i = 0; i < 5; i++) {
//			System.out.print( mass[i] + " ");
//			if (Math.abs(10 - mass[i]) < q) {
//				q = Math.abs(10 - mass[i]);
//				w=mass[i];
//			}
//		}
		System.out.println();
		System.out.print( "The number closest to 10 : " );
		System.out.print( w );
		in.close();
			}

}
