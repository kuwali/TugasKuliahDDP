//Nama : Kustiawanto Halim
//NPM  : 1406543763
//Judul: Lab 3 Decision

import java.util.Scanner;

public class Decision {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nama: ");
		String nama = in.nextLine();
		
		System.out.print("NPM: ");
		int npm = in.nextInt();
		if ((npm <100) || (npm > 500)) {
			System.out.printf("%s dengan NPM %d TIDAK TERDAFTAR",nama,npm);
			System.exit(0);
		}
		
		String space = in.nextLine();
		
		
		System.out.print("Jurusan: ");
		String jurusan = in.nextLine();
		String valid1 = "Ilmu Komputer";
		String valid2 = "Sistem Informasi";
		if (!((jurusan.equals(valid1)) || (jurusan.equals(valid2)))) {
			System.out.printf("Jurusan %s TIDAK TERDAFTAR",jurusan);
			System.exit(0);
		}
		
		System.out.print("Timestamp : ");
		String waktu = in.nextLine();
		int jam = Integer.valueOf(waktu.substring(0,2));
		int menit = Integer.valueOf(waktu.substring(3,5));
		if ((jam < 8) || ((jam == 8) && (menit == 0))) {
			System.out.println(nama + " dengan id " + npm + " TIDAK TERLAMBAT");
		} else {
			System.out.println(nama + " dengan id " + npm + " TERLAMBAT");
		}
	}
}
		
