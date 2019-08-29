package firstone1;

import java.util.Scanner;

public class Exponone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = 6;
		double c = 3;
		double N = 4;
		int A = 4;
		int R = 12;
		System.out.println((int) Math.pow(6, 2));
		System.out.println((int) Math.pow(3, 3));
		System.out.println((double) Math.pow(7, 3));
		System.out.println(c);
		System.out.println((int) Math.pow(8, 9));
		System.out.println(A);
		System.out.println(N);
		System.out.println((double) Math.pow(A, q));
		System.out.println("****************");
		Scanner scanner = new Scanner(System.in);
		System.out.println(" My Grade :");
		int L = scanner.nextInt();
		// System.out.println(K);
		if (L > 80 && L <= 85) {
			System.out.println(" A ");
		}
		if (L > 60 && L <= 80) {
			System.out.println("B");
		} else if (L > 0 && L < 60) {
			System.out.println("C");
		} else if (L < 0) {
			System.out.println("Very Bad");
		} else {
			System.out.println(" Very Good");
		}

	}

}
