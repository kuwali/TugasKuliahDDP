/**
 * Kelas ini untuk membaca input menginisialisasi seluruh variabel dan mencetak
 * output
 * 
 * @author KUSTIAWANTO HALIM
 * @version 1.0
 * NPM : 1406543763
 * Date : 11/03/2014
 * Title : Lab 6
 * 
 */
public class KeretaTest {
	/**
	 * Method ini merupakan method main
	 * 
	 * @param args
	 *            merupakan param args
	 */
	public static void main(String[] args) {
		// Membuat Stasiun-Stasiun Kereta
		Stasiun[] arrStasiun = new Stasiun[5];
		arrStasiun[0] = new Stasiun("Gorbo", 0);
		arrStasiun[1] = new Stasiun("Cikantung", 1);
		arrStasiun[2] = new Stasiun("Depo", 2);
		arrStasiun[3] = new Stasiun("Depo Baru", 3);
		arrStasiun[4] = new Stasiun("Dok Cin", 4);

		// Membuat objek Kereta
		Kereta kereta = new Kereta();

		System.out.println("==========================");
		System.out.println("Pemberhentian Berikutnya Stasiun "
				+ arrStasiun[0].getNama());

		kereta.addPenumpang(0, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(5, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(6, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(7, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(8, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(9, 100, "Pria", arrStasiun[3], arrStasiun[0]);
		kereta.addPenumpang(5, 100, "Pria", arrStasiun[1], arrStasiun[0]);
		kereta.addPenumpang(0, 1000, "Perempuan", arrStasiun[3], arrStasiun[0]);
		kereta.printKereta();

		System.out.println("==========================");
		System.out.println("Pemberhentian Berikutnya Stasiun "
				+ arrStasiun[1].getNama());

		kereta.turun(arrStasiun[1]);
		kereta.addPenumpang(0, 101, "Perempuan", arrStasiun[3], arrStasiun[1]);
		kereta.addPenumpang(5, 40, "Pria", arrStasiun[3], arrStasiun[1]);
		kereta.addPenumpang(8, 20, "Pria", arrStasiun[2], arrStasiun[1]);
		kereta.addPenumpang(9, 20, "Pria", arrStasiun[4], arrStasiun[1]);
		kereta.addPenumpang(1, 50, "Perempuan", arrStasiun[4], arrStasiun[1]);
		kereta.addPenumpang(3, 70, "Perempuan", arrStasiun[2], arrStasiun[1]);
		kereta.printKereta();

		System.out.println("==========================");
		System.out.println("Pemberhentian Berikutnya Stasiun "
				+ arrStasiun[2].getNama());
		kereta.turun(arrStasiun[2]);
		kereta.addPenumpang(7, 40, "Perempuan", arrStasiun[3], arrStasiun[2]);
		kereta.addPenumpang(1, 30, "Perempuan", arrStasiun[4], arrStasiun[2]);
		kereta.addPenumpang(6, 50, "Pria", arrStasiun[4], arrStasiun[2]);
		kereta.addPenumpang(8, 90, "Pria", arrStasiun[3], arrStasiun[2]);
		kereta.printKereta();

		System.out.println("==========================");
		System.out.println("Pemberhentian Berikutnya Stasiun "
				+ arrStasiun[3].getNama());
		kereta.turun(arrStasiun[3]);
		kereta.addPenumpang(5, 20, "Pria", arrStasiun[4], arrStasiun[3]);
		kereta.addPenumpang(1, 21, "Perempuan", arrStasiun[4], arrStasiun[3]);
		kereta.printKereta();

		System.out.println("==========================");
		System.out.println("Pemberhentian Berikutnya Stasiun "
				+ arrStasiun[4].getNama());
		kereta.turun(arrStasiun[4]);
		kereta.printKereta();

		System.out.println("Kereta Ki-111 sudah selesai menjalankan Tugasnya");
		System.out.println("Uang yang didapat = " + kereta.getKeuntungan());

	}
}

// Output yang diharapkan:
// ==========================
// Pemberhentian Berikutnya Stasiun Gorbo
// Gerbong 0 tidak bisa ditempati oleh Pria
// Gerbong 5 penuh
// Gerbong 0 penuh
// Gerbong 0: 0
// Gerbong 1: 0
// Gerbong 2: 0
// Gerbong 3: 0
// Gerbong 4: 0
// Gerbong 5: 100
// Gerbong 6: 100
// Gerbong 7: 100
// Gerbong 8: 100
// Gerbong 9: 100
// Jumlah penumpang di kereta: 500
// ==========================
// Pemberhentian Berikutnya Stasiun Cikantung
// Keuntungan kereta di Stasiun Cikantung = 1000000
// Gerbong 0 penuh
// Gerbong 9 penuh
// Gerbong 0: 0
// Gerbong 1: 50
// Gerbong 2: 0
// Gerbong 3: 70
// Gerbong 4: 0
// Gerbong 5: 40
// Gerbong 6: 0
// Gerbong 7: 0
// Gerbong 8: 20
// Gerbong 9: 100
// Jumlah penumpang di kereta: 280
// ==========================
// Pemberhentian Berikutnya Stasiun Depo
// Keuntungan kereta di Stasiun Depo = 225000
// Gerbong 7 tidak bisa ditempati oleh Perempuan
// Gerbong 0: 0
// Gerbong 1: 80
// Gerbong 2: 0
// Gerbong 3: 0
// Gerbong 4: 0
// Gerbong 5: 40
// Gerbong 6: 50
// Gerbong 7: 0
// Gerbong 8: 90
// Gerbong 9: 100
// Jumlah penumpang di kereta: 360
// ==========================
// Pemberhentian Berikutnya Stasiun Depo Baru
// Keuntungan kereta di Stasiun Depo Baru = 695000
// Gerbong 1 penuh
// Gerbong 0: 0
// Gerbong 1: 80
// Gerbong 2: 0
// Gerbong 3: 0
// Gerbong 4: 0
// Gerbong 5: 20
// Gerbong 6: 50
// Gerbong 7: 0
// Gerbong 8: 0
// Gerbong 9: 0
// Jumlah penumpang di kereta: 150
// ==========================
// Pemberhentian Berikutnya Stasiun Dok Cin
// Keuntungan kereta di Stasiun Dok Cin = 465000
// Gerbong 0: 0
// Gerbong 1: 0
// Gerbong 2: 0
// Gerbong 3: 0
// Gerbong 4: 0
// Gerbong 5: 0
// Gerbong 6: 0
// Gerbong 7: 0
// Gerbong 8: 0
// Gerbong 9: 0
// Jumlah penumpang di kereta: 0
// Kereta Ki-111 sudah selesai menjalankan Tugasnya
// Uang yang didapat = 2385000