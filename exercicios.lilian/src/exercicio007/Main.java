package exercicio007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		double produto;

		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		produto = num1 * num2;
		
		System.out.println("Soma dos dois produtos são: " + produto);

		scan.close();

	}

}
