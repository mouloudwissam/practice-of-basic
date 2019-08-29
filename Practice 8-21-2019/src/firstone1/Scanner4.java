package firstone1;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println(" the highest grade :");
		int x = scanner.nextInt();
		// System.out.println(x);

		if (x > 90 && x < 100) {
			System.out.println("A");
		} else if (x > 80 && x < 90) {
			System.out.println("B");
		} else if (x > 0 && x <= 80) {
			System.out.println("C");
		} else {
			System.out.println("the number you write is not in the range");
		}
	}

}
