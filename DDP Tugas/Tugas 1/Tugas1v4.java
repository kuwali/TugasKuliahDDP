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
//Title: Tugas 1 versi 4

public class Tugas1v4 {
	// Main method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Array of numbers
		String[] number = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh ","Sebelas ",
			"Seratus ","Seribu "};
		
		System.out.print("Masukkan angka dari 1-9999: ");
		
		// Input
		String masukk = in.nextLine();
		// Output var
		String keluar = "";
		
		// Prompt when input isn't valid
		while ((masukk.length() > 4) || (masukk.equals("0")) || masukk.contains(".") 
			|| masukk.contains(",") || masukk.contains("-")) {
			
			System.out.println("Masukkan yang anda berikan salah!");
			System.out.print("Silahkan masukkan ulang: ");
			masukk = in.nextLine();
		}
		
		// Get value of input
		int hasil = Integer.parseInt(masukk);

		// Get units for input
		int satuan = hasil%10;
		int puluhan = hasil%100/10;
		int ratusan = hasil%1000/100;
		int ribuan = hasil/1000;
		
		// Translating
		if (ribuan == 1) {
			keluar = number[13];
		} else if (ribuan != 0) {
			keluar = number[ribuan] + " Ribu ";
		}
		
		if (ratusan == 1) {
			keluar = keluar + number[12];
		} else if (ratusan != 0) {
			keluar = keluar + number[ratusan] + " Ratus ";
		}
		
		if (puluhan == 1) {
			if (satuan == 1) {
				keluar = keluar + number[11];
			} else if (satuan == 0) {
				keluar = keluar + number[10];
			} else if (satuan != 0) {
				keluar = keluar + number[satuan] + " Belas ";
			}
		} else {
			keluar = keluar + number[puluhan] + " Puluh ";
		}
		
		if (puluhan != 1) {
			keluar = keluar + number[satuan];
		}
		
		// Output
		System.out.println(keluar);
		in.close();
	}
}
