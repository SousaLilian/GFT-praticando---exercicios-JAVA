package exercicio004;

import java.util.Scanner;

/*Escrever um algoritmo que l�:
- a porcentagem do IPI a ser acrescido no valor das pe�as
- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1
- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1).*/

public class Algoritmo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double IPI;
		double valor1;
		double valor2;
		double quant1;
		double quant2;

		System.out.println("Digite o IPI: ");
		IPI = entrada.nextDouble();

		System.out.println("Digite o primeiro valor: ");
		valor1 = entrada.nextDouble();

		System.out.println("Digite o segundo valor: ");
		valor2 = entrada.nextDouble();

		System.out.println("Digite a primeira quantidade: ");
		quant1 = entrada.nextDouble();

		System.out.println("Digite a segunda quantidade: ");
		quant2 = entrada.nextDouble();

		double resultado = (valor1 * quant1 + valor2 * quant2) * (IPI / 100 + 1);
		System.out.println("O valor total a ser pago � R$ : " + resultado);

		entrada.close();

	}

}
