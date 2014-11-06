// Nama : Kustiawanto Halim
// NPM  : 1406543763
// Judul: Lab4a

import java.util.Scanner;

public class Lab4a {
	public static void main (String[] args) {
		
		System.out.println("================================================================");
		System.out.println("Program ini akan mengeluarkan Faktor Bilangan yang anda masukkan");
		System.out.println("================================================================");
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan angka anda: ");
		int masuk = in.nextInt();
		
		for (int i = 1; i<=masuk; i++) {
			if (masuk%i==0) {
				System.out.print(i + " ");
			}
		}
		in.close();
		
	}
}
