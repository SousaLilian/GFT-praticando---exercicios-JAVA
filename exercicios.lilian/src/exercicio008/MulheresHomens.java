package exercicio008;

import java.util.Scanner;

public class MulheresHomens {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int sexo = 0;
		int qtMulheres = 0;
		int qtHomens = 0;

		float altura = 0;
		float somaH = 0;
		float mediaHomens = 0;
		float maior = 0;
		float menor = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem) ");
			sexo = entrada.nextInt();
			System.out.print("Digite a altura: ");
			altura = entrada.nextFloat();
		}
		if (sexo == 1) {
			qtMulheres++;
		} else if (sexo == 2) {
			qtHomens++;
			somaH = somaH + altura;
		} else {
			System.out.println("Op��o sexo inv�lida!");
		}
		if (altura > maior) {
			maior = altura;
		} else if (altura < menor) {
			menor = altura;
		}

		mediaHomens = somaH / qtHomens;

		System.out.println("A maior altura do grupo � de " + maior + " m, e a menor � de " + menor + " m");
		System.out.println(" A m�dia de altura dos homens � " + mediaHomens + " m");
		System.out.println("O n�mero de mulheres � " + qtMulheres);

		entrada.close();

	}

}
