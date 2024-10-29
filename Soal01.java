import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int bil1 = input.nextInt();
		int bil2 = input.nextInt();
		int bil3 = input.nextInt();
		int bil4 = input.nextInt();
		int bil5 = input.nextInt();
		
		validasi(bil1);
		validasi(bil2);
		validasi(bil3);
		validasi(bil4);
		validasi(bil5);
	}
	private static void validasi(int bilangan) {
		int digit1 = bilangan / 100;
		int digit2 = bilangan / 10 % 10;
		int digit3 = bilangan % 10;
		
		String status = "";
		if (digit1 < digit2 || digit2 < digit3) {
			status = "tidak valid";
		} else {
			if (digit3 % 2 == 0) {
				status = "valid";
			} else {
				status = "tidak valid";
			}
		} System.out.println(bilangan + " " + status);
	}
}
