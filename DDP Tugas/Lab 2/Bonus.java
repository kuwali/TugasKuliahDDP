import java.util.Scanner;

public class Bonus {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		/* 1
		Cara Biasa
		//Melakukan konversi ke desimal
		//Dengan merubah string ke integer
		//menggunakan method Integer.valueOf
		//Lalu melakukan perkalian
		int satuan = Integer.valueOf(input.substring(3)) * 1;
		int puluhan = Integer.valueOf(input.substring(2,3)) * 2;
		int ratusan = Integer.valueOf(input.substring(1,2)) * 4;
		int ribuan = Integer.valueOf(input.substring(0,1)) * 8;
		
		//Menjumlahkan hasil
		int hasil = satuan + puluhan + ratusan + ribuan;
		*/

		/* 2
		//Cara menggunakan integer
		int input = in.nextInt();
		int hasil = ((input - input%1000)/1000*8); 
		hasil += ((input%1000 - input%100)/100*4);
		hasil += ((input%100 - input%10)/10*2);
		hasil += (input%10);
		
		//printf khusus
		System.out.printf("Hasil konversi binner adalah %04d adalah %d dalam desimal" , input , hasil);		
		*/

		
		/*3
		//Menggunakan case karena kasus hanya 16
		int hasil = 0;
		switch (input) {
			case "0000": hasil = 0; break;
			case "0001": hasil = 1; break;
			case "0010": hasil = 2; break;
			case "0011": hasil = 3; break;
			case "0100": hasil = 4; break;
			case "0101": hasil = 5; break;
			case "0110": hasil = 6; break;
			case "0111": hasil = 7; break;
			case "1000": hasil = 8; break;
			case "1001": hasil = 9; break;
			case "1010": hasil = 10; break;
			case "1011": hasil = 11; break;
			case "1100": hasil = 12; break;
			case "1101": hasil = 13; break;
			case "1110": hasil = 14; break;
			case "1111": hasil = 15; break;
		}
		*/


		// 4
		//Cara for sehingga bisa mengubah nilai lebih dari 4 digit
		//Inisiasi nilai Hasil = 0
		int hasil = 0;
		
		//Melakukan peulangan for dari akhir baris ke awal baris
		for (int i = input.length(); i>0; i--) {
			hasil += Integer.valueOf(input.substring(i-1,i))*Math.pow(2,(input.length()-i));
		}
		
		
		System.out.printf("Hasil konversi binner adalah %s adalah %d dalam desimal" , input , hasil);
		in.close();
	}
}
		
	
		
