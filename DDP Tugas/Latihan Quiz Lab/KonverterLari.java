import java.util.Scanner;

public class KonverterLari {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n = in.nextDouble();
		
		double hasil = n * 1.60934;
		
		System.out.printf("%.2f",hasil);
	}
}
