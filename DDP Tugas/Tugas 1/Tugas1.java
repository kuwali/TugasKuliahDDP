import java.util.Scanner;

/**
 * Kelas ini menerima input bilangan 1-9999
 * Jika lebih akan melakukan prompt lanjut atau tidak
 * Setelah diproses akan mengeluarkan output berupa angka
 * 
 * @author Kustiawanto Halim
 * @version 2014.10.01
 */

//NPM  : 1406543763
//Title: Tugas 1

public class Tugas1 {
	// Method main 
	public static void main (String[] args) {	
		Scanner in = new Scanner(System.in);	
	
		System.out.print("Masukkan angka 1 - 9999: ");
		// Input
		String masukk = in.nextLine();
		
		// Prompt when input isn't valid
		while ((masukk.equals("0")) || masukk.contains(".") 
			|| masukk.contains(",") || masukk.contains("-")) {
			
			System.out.println("Masukkan yang anda berikan salah!");
			System.out.print("Silahkan masukkan ulang: ");
			masukk = in.nextLine();
		}
		
		if (masukk.length() > 4) {
			System.out.print("Masukkan yang anda berikan lebih dari 9999! Apakah anda ingin lanjut? (Y/N) ");
			String prompt = in.nextLine();
			if (prompt.contains("N") || prompt.contains("n")) {
				System.exit(0);
			}
		}
		
		int masuk = Integer.parseInt(masukk);
		
		// Output and method calling
		System.out.println(bilangan(masuk));		
		in.close();
	}
	
	// Method cetak bilangan rekursif
	public static String bilangan(int masuk) {
		// Output var
		String keluar = "";	
		// Array of Numbers 
		String[] angka = {"","Satu","Dua","Tiga","Empat","Lima","Enam",
			"Tujuh","Delapan","Sembilan","Sepuluh","Sebelas","Seratus",
			"Seribu"};
		// Recursive
		if (masuk < 12) {
			keluar = angka[masuk];
		}
		if (masuk>=12 && masuk<=19) {
			keluar = angka[masuk%10] + " Belas";
		}
		if (masuk>=20 && masuk<=99) {
			keluar = bilangan(masuk/10) + " Puluh " + bilangan(masuk%10);
		}
		if (masuk>=100 && masuk<=199) {
			keluar = angka[12] + " " + bilangan(masuk%100);
		}
		if (masuk>=200 && masuk<=999) {
			keluar = bilangan(masuk/100) + " Ratus " + bilangan(masuk%100);
		}
		if (masuk>=1000 && masuk<=1999) {
			keluar = angka[13] + " " + bilangan(masuk%1000);
		}
		if (masuk>=2000 && masuk<=999999) {
			keluar = bilangan(masuk/1000) + " Ribu " + bilangan(masuk%1000);
		}
		if (masuk>=1000000 && masuk<=999999999) {
			keluar = bilangan(masuk/1000000) + " Juta " + bilangan(masuk%1000000);
		}
		// Return
		return keluar;
	}
}
