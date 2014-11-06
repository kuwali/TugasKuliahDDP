import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Kustiawanto Halim
 * NPM 		: 1406543763
 * Title 	: Rainbow Cake Lab 5
 * @version 2014.10.13
 * 
 * This class will calculate duplicate sms 
 * and numbers of sms sent 
 *
 */
public class Bonus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String baca = in.nextLine();

		StringTokenizer tk = new StringTokenizer(baca);

		ArrayList<String> isiSms = new ArrayList<String>();

		// Add message to Array List isiSms
		while (tk.hasMoreTokens()) {
			isiSms.add(tk.nextToken());
		}


		/**
		 * Iteration to check duplicate and remove 
		 * the duplicate message from Array List
		 */
		int duplikasi = 0;
		int j = 0;
		boolean cek = false;
		while (j < isiSms.size() - 1) {
			String sama = isiSms.get(j);
			if (isiSms.get(j + 1).toString().equals(sama)) {
				isiSms.remove(j + 1);
				if (cek == false) {
					duplikasi++;
					cek = true;
				}
			} else {
				cek = false;
				j++;
			}
		}
		
		
		int jumlah = isiSms.size();

		System.out.printf("Jumlah sms yang dikirim : %d%n", jumlah);
		System.out.printf("Jumlah sms terduplikasi : %d%n", duplikasi);
		System.out.print("Urutan pengiriman SMS: ");
		
		// Print message
		for (int i = isiSms.size() - 1; i >= 0; i--) {
			System.out.print(isiSms.get(i) + " ");
		}
		
		System.out.println();

		in.close();
	}
}
