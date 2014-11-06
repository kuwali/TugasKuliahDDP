/**
 * Kelas yang merepresentasikan stasiun kereta
 * 
 * @author KUSTIAWANTO HALIM
 * @version 1.0
 * 
 */
public class Stasiun {
	// TODO: Tambahkan variabel yang dibutuhkan
	private String stasiun;
	private int urutan;

	// TODO: Membuat constructor Stasiun
	public Stasiun(String stasiun, int urutan) {
		this.stasiun = stasiun;
		this.urutan = urutan;
	}

	// TODO: Membuat getter and setter class Stasiun
	public void setStasiun(String stasiun, int urutan) {
		this.stasiun = stasiun;
		this.urutan = urutan;
	}

	public String getNama() {
		return stasiun;
	}

	public int getUrutan() {
		return urutan;
	}
}
