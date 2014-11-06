// Nama : Kustiawanto Halim
// NPM  : 1406543763
// Judul: Bonus Lab 4

import java.util.Scanner;

public class Bonus {
	// Method untuk mencetak space didepan piramida
	public static void space (int a) {
		for (int i=0; i<a; i++) {
			System.out.print(" ");
		}
	}
	// Method untuk mencetak bintang
	public static void bintang (int a) {
		for (int j=1; j<=a; j++) {
			System.out.print("* ");
		}
	}

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Program ini akan mengeluarkan Piramida bintang berdasarkan masukkan");
		System.out.println("===================================================================");
		System.out.println();
		
		System.out.print("Masukkan tinggi piramida yang akan dibuat: ");
		int masuk = in.nextInt();
		
		// Iterasi 
		for (int i=1; i<=masuk; i++) {
			space(masuk-i);
			bintang(i);
			System.out.println();
		}
		in.close();
	}
}
