package exercicio007;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String alphabet = scan.next();
			String word = "";
			int letters = scan.nextInt();
			for (int i = 0; i < letters; i++) {
				int letter = scan.nextInt() - 1;
				word += alphabet.charAt(letter);
			}
			System.out.println(word);

			scan.close();
		}

	}

}
