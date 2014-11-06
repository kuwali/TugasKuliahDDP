public class Lab2a2 {
	
	public static void main (String[] args) {
		
	/* Soal : 
		
		Isian diubah menjadi:
		'a' menjadi 'b'
		10 menjadi 100
		"2014" menjadi "orion 2014"
		false menjadi true
		3.4 menjadi 9.8
	*/
	
	//Jawaban :
		byte variabelA = 10;
		double variabelB = 3.4;
		boolean variabelC = false;
		char variabelD = 'a';
		String variabelE = "2014";
	
	//Mengubah nilai
		variabelA *= 10;
		variabelB = variabelB + 6.4;
		variabelC = !variabelC;
		variabelD += 1;
		variabelE = "orion " + variabelE;
		
	//Mencetak hasil
		System.out.println(variabelA);
		System.out.println(variabelB);
		System.out.println(variabelC);
		System.out.println(variabelD);
		System.out.println(variabelE);
	}
}
