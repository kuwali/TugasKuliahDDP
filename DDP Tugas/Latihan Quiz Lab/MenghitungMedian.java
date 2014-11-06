import java.util.Scanner;

public class MenghitungMedian {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int aa,bb,cc;
		
		if (a>b) {
			if (a>c) {
				if (b>c) {
					aa = a;
					bb = b;
					cc = c;
				} else {
					aa = a;
					bb = c;
					cc = b;
				}
			} else {
				aa = c;
				bb = a;
				cc = b;
			}
		} else {
			if (b>c) {
				if (a>c) {
					aa = b;
					bb = a;
					cc = c;
				} else {
					aa = b;
					bb = c;
					cc = a;
				}
			} else {
				aa = c;
				bb = b;
				cc = a;
			}
		}
		System.out.println(bb);
	}
}
