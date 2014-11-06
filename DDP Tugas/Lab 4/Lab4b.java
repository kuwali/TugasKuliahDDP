// Nama : Kustiawanto Halim
// NPM  : 1406543763
// Judul: Lab4b

public class Lab4b {
	public static void main (String[] args) {
		
		System.out.println("=================================================================");
		System.out.println("Program ini akan mengeluarkan Bilangan Sempurna kurang dari 10000");
		System.out.println("=================================================================");
		System.out.println();
		
		for (int i = 1; i<=10000; i++) {
			int faktor = 0;
			for (int j = 1; j<i; j++) {
				if (i%j==0) {
					faktor+=j;
			}
			}
			if (faktor == i) {
				System.out.println(i);
			}
		}
	}
}
