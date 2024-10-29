import java.util.Scanner;
public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first time (hh mm): ");
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        System.out.print("Enter the second time (mm): ");
        int v = input.nextInt();

        int m2 = (m1 + v) % 60;
        int h2 = (h1 + (m1 + v) / 60) % 24;

        System.out.printf("The result is %02d:%02d", h2, m2);
	}
}
