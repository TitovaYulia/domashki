import java.util.Scanner;

public class zadanie5 {

	public static void main(String[] args) {
		short a,b;
		int max, min;
		Scanner in=new Scanner(System.in);
		System.out.println("Ââåäèòå äâà ÷èñëà");
		a=in.nextShort();
		b=in.nextShort();
		max = a>b ? a : b ;
		min = a<b ? a : b ;
		for (int i=min; i<=max; i++){
			System.out.print(i+ " ");
		}
	}

}
