package exercicio005;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
(1SM=R$788,00).*/

public class Salario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do sal�rio m�nimo: ");
		double salarioMinimo = entrada.nextDouble();
		

		System.out.println("Digite o valor do sal�rio usu�rio: ");
		double salarioUsuario = entrada.nextDouble();
	
		double soma = salarioMinimo + salarioUsuario;
		System.out.println("A soma �: " + soma);

		entrada.close();
	}

}
