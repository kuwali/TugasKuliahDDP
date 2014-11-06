/**
 * Merupakan kelas yang merepresentasikan gerbong yang dimiliki oleh kereta
 * 
 * @author KUSTIAWANTO HALIM
 * @version 1.0
 * NPM : 1406543763
 * Date : 11/03/2014
 * Title : Lab 6
 * 
 */
public class Gerbong {

	// TODO: Tambahkan variabel yang dibutuhkan
	private int penumpangGerbong;

	// TODO: Membuat constructor Gerbong
	public Gerbong() {
		penumpangGerbong = 0;
	}

	// TODO: Membuat getter and setter class Gerbong
	public int getPenumpang() {
		return penumpangGerbong;
	}

	public void setPenumpang(int penumpang) {
		penumpangGerbong = penumpang;
	}

	public void addPenumpang(int penumpang) {
		penumpangGerbong += penumpang;
	}

	public void kurangPenumpang(int penumpang) {
		penumpangGerbong -= penumpang;
	}

	/**
	 * Method ini digunakan untuk mengeprint banyak isi dari penumpang pada
	 * sebuah gerbong
	 */
	public void printGerbong() {
		// TODO: Implementasikan
		System.out.println(penumpangGerbong);
	}

}
