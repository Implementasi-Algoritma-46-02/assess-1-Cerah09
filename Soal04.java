import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		String kodePosisi = input.next();
		int jumlahJam = input.nextInt();

		int tunjangan = 0;
		switch (kodePosisi) {
			case "MGR" : tunjangan = 1000000; break;
			case "STF" : tunjangan = 500000; break;
			case "TCH" : tunjangan = 750000; break;
			case "DRV" : tunjangan = 350000; break;
			default: break;
		}
		double bonus = 0;
		double gaji = jumlahJam * 50000;
		double totalGaji = gaji + tunjangan; 
		if (jumlahJam > 160 && jumlahJam <= 170) {
			bonus = totalGaji * 0.05;
		} else if (jumlahJam > 170) {
			bonus = totalGaji * 0.07;
		} 
		totalGaji += bonus;
		System.out.println(totalGaji);
	}
}
