package exercicio006;

/*desenvolva um algoritmo em Java que leia um n?mero inteiro e imprima o seu
antecessor e seu sucessor.*/

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		System.out.println("Digite o um n?mero: ");
		numero = entrada.nextInt();

		System.out.println("Antecessor: " + --numero);
		System.out.println("Sucessor: " + numero+2);

		entrada.close();

	}

}
