import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		String kodePosisi = input.next();
		int jumlahJam = input.nextInt();

		int tunjangan = 0;
		switch (kodePosisi) {
			case "DES" : tunjangan = 600000; break;
			case "PRG" : tunjangan = 1200000; break;
			case "WRT" : tunjangan = 400000; break;
			case "MKT" : tunjangan = 500000; break;
			default: break;
		}
		double bonus = 0;
		double gaji = jumlahJam * 30000;
		double totalGaji = gaji + tunjangan; 
		if (jumlahJam > 160 && jumlahJam <= 169) {
			bonus = totalGaji * 0.5;
		} else if (jumlahJam > 170) {
			bonus = totalGaji * 0.7;
		} 
		totalGaji += bonus;
		System.out.println(totalGaji);
	}
}
