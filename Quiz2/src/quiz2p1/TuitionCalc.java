package quiz2p1;

import java.util.Scanner;

public class TuitionCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Initial Tuition Cost: ");
		double tuition = scan.nextDouble();

		System.out.print("Percentage Increase: ");
		double rate = scan.nextDouble();

		scan.close();

		double sum = tuition;

		for (int i = 0; i <= 2; i++) {
			tuition = tuition * (1 + (rate / 100));
			sum+=tuition;
		}
		System.out.printf("%.2f", sum);

	}

}
