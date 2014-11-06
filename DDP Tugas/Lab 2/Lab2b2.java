import java.util.Scanner;

public class Lab2b2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Siapa namamu?");
		String nama = in.nextLine();
		System.out.println("Hai " + nama + ", kamu telah berhasil membuat program yang menerima masukan");
		
		final double kurs = 11813.00;

		System.out.print("Nominal USD: ");
		double nominal = in.nextDouble();
		System.out.printf("Rp%.0f,-%n", ((nominal*kurs)-(nominal*kurs%1000)));
		
		/*
		Cara Lainnya
		
		double hasil = (Math.floor(((nominal*kurs)/1000)))*1000;
		System.out.printf("Rp%.0f,-%n", hasil);
		*/
		
		in.close();
	}
}
