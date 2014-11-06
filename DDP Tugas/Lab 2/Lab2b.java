import java.util.Scanner;

public class Lab2b {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Siapa namamu?");
		String nama = in.nextLine();
		
		System.out.println("Hai " + nama + ", kamu telah berhasil membuat program yang menerima masukan");
		
		final double kurs = 11813.00;

		System.out.print("Nominal IDR: ");		
		double nominal = in.nextDouble();
		
		in.close();
	}
}
