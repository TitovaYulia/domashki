import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Для рассчета по формуле ax^2+bx+c");
		System.out.println("Введите значение коэффициента a");
		int a = in.nextInt();
		System.out.println("Введите значение коэффициента b");
		int b = in.nextInt();
		System.out.println("Введите значение коэффициента c");
		int c = in.nextInt();
		System.out.println(a + "x^2+" + b + "x+" + c);
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			System.out.println("Корней нет");
		} else {
			double h1 = (-b + Math.pow(d, 0.5)) / (2 * a);
			double h2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			System.out.printf("Первый корень уравнения " + h1 + "%nВторой корень уравнения " + h2);
		}
	}

}
