package firstone1;

import java.util.Scanner;

public class Arrayone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I like Some Subjects Then Others :");
		String subjects[] = { "Math", "English", "Arabic", "Spanish" };
		String books[] = { "English Book", "math Book", "Arabic Book" };
		int mathinamtic[] = { 4, 43, 34, 12, 78, 45, };
		boolean M[] = { true, false };
		System.out.println("The Best Example for subject:");
		System.out.println(subjects[3]);
		if (M[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if (M[0]) {
			System.out.println("The letter M is false .");
		} else {
			System.out.println("The Letter M is true .");
			try {
				System.out.println(M[3]);
			} catch (Exception e) {
				System.out.println("The Letter M 3 is :");
			}
		}
		System.out.println(subjects[0]);

		try {
			System.out.println(subjects[4]);
		} catch (Exception e) {
			System.out.println("The Best Four :");

			// TODO: handle exception
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(" the best :");
		int LL = scanner.nextInt();
		System.out.println("The Books of This year : ");
		// System.out.println(books[3]);
		System.out.println(books[1]);
		System.out.println(books[2]);
		System.out.println(books[0]);
		System.out.println(" The Best Number on The  List is :");
		try {
			System.out.println(books[3]);
		} catch (Exception e) {
			System.out.println(" the BOOKs in Number 3");
		} //
		System.out.println(" The Best Number on The  List is :");

		System.out.println(mathinamtic[5]);
		System.out.println(mathinamtic[3]);
		System.out.println(mathinamtic[4]);
		System.out.println(mathinamtic[0]);
		System.out.println(mathinamtic[1]);
		System.out.println(mathinamtic[2]);
		try {
			System.out.println(mathinamtic[14]);
		} catch (Exception e) {
			System.out.println("The Number 14 is not there yet :");

		}
		for (int O =0;O<3;O++) {
			System.out.println(subjects[O]);
		}
		for (int HH=0;HH<3;HH++) {
			System.out.println(books[HH]);
		}
		for (int RR=3;RR<=5;RR++) {
			System.out.println(mathinamtic[RR]);
		}
		System.out.println("*******************************************************");
		String Mybeauty[][] = { {"love","My heart","My Sweet ","My suger"},
				          {"My care","My Cure","My EveryThing","My LOvely","Lovely"}
			
	};
		for(int U =0;U<2;U++) {
			for(int JJ=0;JJ<4;JJ++) {
				System.out.println(Mybeauty[U][JJ]);
			}
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		String MyWorst[][] = {{"1","2","","1","2","","1","2","",},
				{"a","w","e","t","y","U","I","O","P"},
				{"QWEE","TTTT","OOOO","PPPP","hhhh","LLLL","KKKKKK"},
				{"VVVV","LKLJ","ASDA","IIIYK","PPPK","CVXCD"}
		};
		for(int jamal=0;jamal<4;jamal++) {
			for(int jamal1=0;jamal1<5;jamal1++) {
				System.out.println(MyWorst[jamal][jamal1]);
			}
		}
	}

}
