import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int masaStudi = input.nextInt();
		double nilaiIPK = input.nextDouble();
		int nilaiEPRT = input.nextInt();
		String suratSKI = input.next();

		String predikat = "";

		if (nilaiIPK >= 2.76 && nilaiIPK <= 3.00) {
			predikat = "Tidak Cumlaude";
		} else if (nilaiIPK >= 3.01 && nilaiIPK <= 3.50) {
			predikat = "Cumlaude";
		} else {
			if (masaStudi <= 6 && nilaiEPRT >= 450 && suratSKI.equalsIgnoreCase("ada")) {
				predikat = "Cumlaude";
			} else {
				predikat = "Tidak Cumlaude";
			}
		}	System.out.println(predikat);
	}
}
