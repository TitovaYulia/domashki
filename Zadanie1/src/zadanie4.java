public class zadanie4 {

	public static void main(String[] args) {
		int mass[][] = new int [5][8];
		int a=(-99), b=199;
		int max = -99;
		for (int i=0; i<5; i++){
			for (int j=0; j<8; j++){
				mass[i][j]= a + (int) (Math.random() * b);
				System.out.printf("%4d ", mass[i][j]);
				if (mass[i][j] > max ){
					max=mass[i][j];
				}
			
			}
			System.out.println();
		}
		System.out.println("max = " + max);
	}

}
