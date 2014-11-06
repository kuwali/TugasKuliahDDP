import java.util.*;

public class Gomoku {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PapanBaru game = new PapanBaru();

		System.out.println("Besar Papan adalah 19x19.");
		System.out.println("Koordinat yang sah adalah 1-19.");

		String koor = "";
		boolean menang = false;
		boolean pemain = true;
		while (!menang) {
			if (pemain) {
				System.out.print("Giliran pemain putih. ");
			} else {
				System.out.print("Giliran pemain hitam. ");
			}
			System.out.println("Berikan koordinat (misalnya 10,5) atau quit:");
			koor = in.nextLine();
			if ("quit".equalsIgnoreCase(koor)) {
				System.exit(0);
			}
			while (!game.cekkoordinat(koor)) {
				System.out.println("Masukkan salah tolong ulangi!");
				koor = in.nextLine();
			}
			game.jalan(pemain,game.getBaris(),game.getKolom());
			game.cetakPapan();
			menang = game.cekMenang();
			pemain = !pemain;
		}
		if (pemain) {
			System.out.println("Selamat! hitam menang dalam " + game.getLangkah() + " langkah.");
		} else {
			System.out.println("Selamat! putih menang dalam " + game.getLangkah() + " langkah.");
		}
		
		in.close();
	}
}

