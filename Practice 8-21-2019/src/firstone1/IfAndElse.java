package firstone1;

import java.util.Scanner;

public class IfAndElse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("THE Best Score in Class:");
		int z = scanner.nextInt();
		if (z > 15 && z < 20) {
			System.out.println("Very Good ");

		} else if (z > 10 && z <= 15) {
			System.out.println("Good");
		} else if (z >= 5 && z < 10) {
			System.out.println("Not Bad");

		} else if (z >= 0 && z < 4) {
			System.out.println("Bad");
		} else {
			System.out.println(" VeryBad");

		}

	}
}