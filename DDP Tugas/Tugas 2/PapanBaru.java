
public class PapanBaru {
	private char[][] papan = new char[19][19];
	private int langkah;
	private int spasi;
	private int baris;
	private int kolom;

	public PapanBaru() {
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				papan[i][j] = '.';
			}
		}
		langkah = 0;
	}

	public void cetakPapan() {
		for (int i = 0; i < 19; i++) {
			System.out.printf("%2d:  ", i + 1);
			for (int j = 0; j < 19; j++) {
				System.out.print(papan[i][j]);
			}
			System.out.println();
		}
	}

	public void jalan (boolean pemain, int baris, int kolom) {
		if (pemain) {
			papan[baris][kolom] = 'W';
		} else {
			papan[baris][kolom] = 'B';
		}
		langkah++;
	}
	
	public boolean cekMenang () {
		boolean menang = false;
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if ((papan[i][j] == 'W') || (papan[i][j] == 'B')) {
					menang = this.cekVertikal(i,j);
					if (menang) {
						return menang; 
					}
					menang = this.cekHorizontal(i,j);
					if (menang) {
						return menang; 
					}
					menang = this.cekDiagonal(i,j);
					if (menang) {
						return menang; 
					}
				}
			}
		}
		return menang;
	}
	
	public boolean cekVertikal (int baris, int kolom) {
		int w = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			if (papan[baris][i+kolom] == 'W') {
				w++;
			}
			if (papan[baris][i+kolom] == 'B') {
				b++;
			}
		}
		if ((w >= 5) || (b >= 5)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cekHorizontal (int baris, int kolom) {
		int w = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			if (papan[i+baris][kolom] == 'W') {
				w++;
			}
			if (papan[i+baris][kolom] == 'B') {
				b++;
			}
		}
		if ((w >= 5) || (b >= 5)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cekDiagonal (int baris, int kolom) {
		int w = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			if (papan[baris+i][kolom+i] == 'W') {
				w++;
			}
			if (papan[baris+i][kolom+i] == 'B') {
				b++;
			}
		}
		if ((w >= 5) || (b >= 5)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getLangkah () {
		return langkah;
	}
	
	public boolean cekkoordinat (String lokasi) {
		spasi = lokasi.indexOf(",");
		this.baris = Integer.parseInt(lokasi.substring(0, spasi));
		this.kolom = Integer.parseInt(lokasi.substring(spasi+1, lokasi.length()));
		if ((baris == 0) || (baris > 19) || (kolom == 0) || (kolom > 19)) {
			return false;
		}
		this.baris--;
		this.kolom--;		
		return true;
		
	}
	
	public int getBaris () {
		return baris;
	}
	
	public int getKolom () {
		return kolom;
	}
}

