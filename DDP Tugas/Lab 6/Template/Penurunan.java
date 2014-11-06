/**
 * Merupakan kelas yang merepresentasikan penurunan penumpang di suatu gerbong
 * 
 * @author KUSTIAWANTO HALIM
 * @version 1.0
 * NPM : 1406543763
 * Date : 11/03/2014
 * Title : Lab 6
 * 
 */
public class Penurunan {
	/* Nomor gerbong dari penurunan penumpang */
	int nomorGerbong;

	/* Banyaknya jumlah penumpang yang turun */
	int banyakPenumpangTurun;

	/* Di stasiun mana penumpang tersebut turun */
	Stasiun turun;

	/* Asal penumpang tersebut naik kereta */
	Stasiun asal;

	/**
	 * Constructor kelas penurunan yang akan menginisialisasi semua parameter
	 */
	public Penurunan(int nomorGerbong, int banyakPenumpangTurun, Stasiun turun,
			Stasiun asal) {
		this.nomorGerbong = nomorGerbong;
		this.banyakPenumpangTurun = banyakPenumpangTurun;
		this.turun = turun;
		this.asal = asal;
	}

	/**
	 * Menghitung keuntungan dari suatu penurunan
	 * 
	 * @return keuntungan dari suatu penurunan
	 */
	public int hitungKeuntungan() {
		// TODO: Menghitung keuntungan
		return (2000 + 500 * Math.abs(turun.getUrutan() - asal.getUrutan()))
				* banyakPenumpangTurun;
	}

	// TODO: Mutator dan accesor dari kelas Penurunan
	public int getGerbong() {
		return nomorGerbong;
	}
	
	public int getTurunPenumpang() {
		return banyakPenumpangTurun;
	}

	public Stasiun getTurun() {
		return turun;
	}

	public Stasiun getAsal() {
		return asal;
	}
	
	public void setTurunPenumpang(int penumpang) {
		banyakPenumpangTurun = penumpang;
	}

	public void setTurun(Stasiun turun) {
		this.turun = turun;
	}

	public void setAsal(Stasiun asal) {
		this.asal = asal;
	}
	
	public void setGerbong(int gerbong) {
		nomorGerbong = gerbong;
	}
}