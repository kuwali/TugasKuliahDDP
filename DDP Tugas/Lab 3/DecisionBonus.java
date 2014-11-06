//Nama : Kustiawanto Halim
//NPM  : 1406543763
//Judul: Lab 3 Decision

import java.util.Scanner;

public class DecisionBonus {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nama: ");
		String nama = in.nextLine();
		
		System.out.print("NPM: ");
		int npm = in.nextInt();
		if (!((npm % 2) == 0) && ((npm >= 100) || (npm <= 500))) {
			System.out.printf("%s dengan NPM %d TIDAK TERDAFTAR",nama,npm);
			System.exit(0);
		}
		
		String space = in.nextLine();
		
		
		System.out.print("Jurusan: ");
		String jurusan = in.nextLine();
		if (!((jurusan.equalsIgnoreCase("Ilmu Komputer")) || (jurusan.equalsIgnoreCase("Sistem Informasi")))) {
			System.out.printf("Jurusan %s TIDAK TERDAFTAR",jurusan);
			System.exit(0);
		}
		
		System.out.print("Timestamp : ");
		String waktu = in.nextLine();
		int jam = Integer.valueOf(waktu.substring(0,2));
		int menit = Integer.valueOf(waktu.substring(3,5));
		while ((menit >= 60) || (jam >=24)) {
			System.out.print("Masukkan anda salah, ulangi: ");
			waktu = in.nextLine();
			jam = Integer.valueOf(waktu.substring(0,2));
			menit = Integer.valueOf(waktu.substring(3,5));
		}
		if ((jam < 8) || ((jam == 8) && (menit == 0))) {
			System.out.println(nama + " dengan NPM " + npm + " TIDAK TERLAMBAT");
		} else {
			jam -= 8;
			menit += (jam*60);
			System.out.println(nama + " dengan NPM " + npm + " TERLAMBAT " + menit + " menit");
			
		in.close();
		}
	}
}
		
