package exercicio005;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00).*/

public class Salario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo: ");
		double salarioMinimo = entrada.nextDouble();
		

		System.out.println("Digite o valor do salário usuário: ");
		double salarioUsuario = entrada.nextDouble();
	
		double soma = salarioMinimo + salarioUsuario;
		System.out.println("A soma é: " + soma);

		entrada.close();
	}

}
