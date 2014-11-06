/*
public class Jalan {

	public Jalan() {
		// TODO Auto-generated constructor stub
	}
	
	public Jalan (boolean pemain, int baris, int kolom) {
		if (pemain) {
			PapanBaru.getPapan()[baris][kolom] = 'W';
		} else {
			PapanBaru.getPapan()[baris][kolom] = 'B';
		}
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

}
*/