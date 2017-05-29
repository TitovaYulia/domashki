
public class zadanie3 {

	public static void main(String[] args) {
		int mass[][] = new int [8][5];
		int a=10, b=89;
		for (int i=0; i<8; i++){
			for (int j=0; j<5; j++){
				mass[i][j]= a + (int) (Math.random() * b);
				System.out.printf("%+4d ", mass[i][j]);
			}
			System.out.println();
		}

	}

}
