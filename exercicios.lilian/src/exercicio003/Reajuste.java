package exercicio003;

import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Reajuste {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do saldo: ");

		double saldo;
		saldo = entrada.nextDouble();
		System.out.println("Saldo ?: " + saldo);
		
		double reajuste = saldo + (saldo / 100);
		System.out.println("Reajuste ?: " + reajuste);

		entrada.close();
	}

}
