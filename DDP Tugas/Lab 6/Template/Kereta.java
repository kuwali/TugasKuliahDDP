import java.util.ArrayList;

/**
 * Kelas yang merepresentasikan sebuah kereta
 * 
 * @author KUSTIAWANTO HALIM
 * @version 1.0 
 * NPM : 1406543763 
 * Date : 11/03/2014 
 * Title : Lab 6
 * 
 */
class Kereta {
	// TODO: Tambahkan variabel yang dibutuhkan
	private Gerbong[] arrGerbong = new Gerbong[10];
	private int jumlahPenumpang;
	private int keuntunganKereta;

	/*
	 * Variabel ini merepresentasikan penurunan penumpang yang harus dilakukan
	 * setiap sampai di suatu stasiun
	 */
	ArrayList<Penurunan> penurunanPenumpang = new ArrayList<Penurunan>();

	// TODO: Membuat constructor Kereta
	public Kereta() {
		for (int i = 0; i < 10; i++) {
			arrGerbong[i] = new Gerbong();
		}
	}

	// TODO: Membuat getter and setter class Kereta
	public int getKeuntungan() {
		return keuntunganKereta;
	}

	public int getJumlahPenumpang() {
		return jumlahPenumpang;
	}

	public void setJumlahPenumpang(int penumpang) {
		jumlahPenumpang = penumpang;
	}

	public int totalPenumpang() {
		for (int i = 0; i < 10; i++) {
			jumlahPenumpang += arrGerbong[i].getPenumpang();
		}
		return jumlahPenumpang;
	}

	/**
	 * Method getter dari gerbong
	 * 
	 * @param gerbong
	 *            merupakan gerbong keberapa yang diminta
	 * @return gerbong gerbong sesuai dengan nomor yang diminta
	 */
	public Gerbong getGerbong(int gerbong) {
		// TODO: Implementasikan
		return arrGerbong[gerbong];
	}

	/**
	 * Method printKereta yang akan mencetak status dari seluruh gerbong
	 */
	public void printKereta() {
		// TODO: Implementasikan
		jumlahPenumpang = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("Gerbong %d: ", i);
			arrGerbong[i].printGerbong();
		}
		System.out.println("Jumlah penumpang di kereta: " + totalPenumpang());
	}

	/**
	 * Menambahkan banyak penumpang pada gerbong tertentu
	 * 
	 * @param gerbong
	 *            gerbong yang ingin dinaiki
	 * @param penumpang
	 *            banyak penumpang yang dinaiki
	 */
	public void addPenumpang(int gerbong, int penumpang, String jenisKelamin,
			Stasiun turunDi, Stasiun asal) {
		// TODO: Validasi apakah jenis kelamin dan nomor gerbong sesuai
		if ((gerbong >= 0) && (gerbong <= 4)
				&& ("pria".equalsIgnoreCase(jenisKelamin))) {
			System.out.printf("Gerbong %d tidak dapat ditempati oleh Pria%n",
					gerbong);
		} else if ((gerbong >= 5) && (gerbong <= 9)
				&& ("perempuan".equalsIgnoreCase(jenisKelamin))) {
			System.out.printf(
					"Gerbong %d tidak dapat ditempati oleh Perempuan%n",
					gerbong);
		} else

		// TODO: Validasi apakah gerbong sudah penuh
		if ((arrGerbong[gerbong].getPenumpang() + penumpang > 100)) {
			System.out.printf("Gerbong %d penuh%n", gerbong);
		} else

		// TODO: Tambah jumlah penumpang di gerbong tersebut
		{
			arrGerbong[gerbong].addPenumpang(penumpang);

			// TODO: Tambahkan penumpang tersebut ke penurunanPenumpang
			penurunanPenumpang.add(new Penurunan(gerbong, penumpang, turunDi,
					asal));
		}
	}

	/**
	 * Method ini merupakan method yang dipanggil setiap sampai pada sebuah
	 * stasiun untuk mengurangi penumpang berdasarkan penumpang yang ingin turun
	 * dimana
	 * 
	 * @param stasiun
	 *            stasiun di mana orang tersebut turun
	 */
	public void turun(Stasiun stasiun) {
		int keuntunganStasiun = 0;
		// TODO: Loop semua Penurunan yang ada pada array List
		for (Penurunan yangTurun : penurunanPenumpang) {
			// Variabel lokal untuk mempermudah membaca program
			Stasiun turunSekarang = yangTurun.getTurun();
			int gerbongSekarang = yangTurun.getGerbong();
			int penumpangTurun = yangTurun.getTurunPenumpang();
			int keuntunganSekarang = yangTurun.hitungKeuntungan();

			// TODO: Jika nama stasiun Penurunan sama dengan nama stasiun pada
			// parameter
			// Kurangi jumlah penumpang pada gerbong tersebut
			// Hitung keuntungan pada stasiun ini
			// Tambahkan keuntungan kereta dengan keuntungan pada stasiun ini
			if (turunSekarang.equals(stasiun)) {
				arrGerbong[gerbongSekarang].kurangPenumpang(penumpangTurun);
				keuntunganStasiun += keuntunganSekarang;
			}
		}
		keuntunganKereta += keuntunganStasiun;
		System.out.println("Keuntungan kereta di Stasiun " + stasiun.getNama()
				+ " = " + keuntunganStasiun);
	}

}
