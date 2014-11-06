import java.util.Scanner;

public class MenghitungDNA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String dna = in.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		
		for (int i = 0; i<dna.length(); i++) {
			if (dna.substring(i,i+1).equals("A")) {
				a++;
			}
			if (dna.substring(i,i+1).equals("C")) {
				b++;
			}
			if (dna.substring(i,i+1).equals("G")) {
				c++;
			}
			if (dna.substring(i,i+1).equals("T")) {
				d++;
			}
		}
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
