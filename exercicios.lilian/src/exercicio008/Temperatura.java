package exercicio008;

import java.util.Scanner;

/*Escreva um programa que, com base em uma temperatura em graus celsius, 
 * a converta e exiba em Kelvin (K), R?aumur (Re), Rankine (Ra) e Fahrenheit (F), 
 * seguindo as f?rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/

public class Temperatura {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double C = 2.43;
		double K;
		double F;
		double Re;
		double Ra;

		F = C * 1.8 + 32;
		K = C + 273.15;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;

		System.out.println("Kelvin " + K);
		System.out.println("R?aumur  " + Re);
		System.out.println("Rankine " + Ra);
		System.out.println("Fahrenheit " + F);

		scan.close();

	}

}
