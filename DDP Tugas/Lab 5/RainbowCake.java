import java.util.Scanner;

/**
 * @author Kustiawanto Halim
 * NPM 		: 1406543763
 * Title 	: Rainbow Cake Lab 5
 * @version 2014.10.13
 * 
 * This class will calculate the most 
 * and last layers color 
 *
 */
public class RainbowCake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String baca = args[0];
		
		// Split input to string arrFormula
		String[] arrFormula = baca.split(",");

		int[] arrJumlah = new int[7];
		int[] arrIndex = new int[7];
		
		// Iteration to calculate colors and index
		for (int i = 0; i < arrFormula.length; i++) {
			switch (arrFormula[i]) {
			case "me":
				arrJumlah[0]++;
				arrIndex[0] = i;
				break;
			case "ji":
				arrJumlah[1]++;
				arrIndex[1] = i;
				break;
			case "ku":
				arrJumlah[2]++;
				arrIndex[2] = i;
				break;
			case "hi":
				arrJumlah[3]++;
				arrIndex[3] = i;
				break;
			case "bi":
				arrJumlah[4]++;
				arrIndex[4] = i;
				break;
			case "ni":
				arrJumlah[5]++;
				arrIndex[5] = i;
				break;
			case "u":
				arrJumlah[6]++;
				arrIndex[6] = i;
				break;
			}
		}

		// Iteration to find the most and lastest layers 
		int max = 0;
		int nilai = 0;
		int index = 0;
		for (int i = 0; i <= 6; i++) {
			if ((arrJumlah[i] >= max) || (arrIndex[i] >= index)) {
				max = arrJumlah[i];
				nilai = i;
				index = arrIndex[i];
			}
		}
		
		// To save colors
		switch (nilai) {
		case 0:
			baca = "Merah";
			break;
		case 1:
			baca = "Jingga";
			break;
		case 2:
			baca = "Kuning";
			break;
		case 3:
			baca = "Hijau";
			break;
		case 4:
			baca = "Biru";
			break;
		case 5:
			baca = "Nila";
			break;
		case 6:
			baca = "Ungu";
			break;
		}

		System.out.printf("Warna %s lebih dominan", baca);

		in.close();
	}
}
