package exercicio008;

import java.util.Scanner;

/* Uma parede em formato retangular, cuja altura � hp (altura da parede) e a largura lp (largura da parede) 
 * precisa ser coberta por azulejos tamb�m retangulares. O azulejo retangular tem dimens�es ha (altura do azulejo) e la (largura do azulejo). 
 * Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
 * calcule e imprima quanto azulejos com as medidas dadas s�o necess�rios para cobrir a parede dada.*/
public class Parede {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double hp,lp,ha,la;
		double qtd;

		System.out.println("Qual altura da parede? ");
		hp = scan.nextDouble();

		System.out.println("Qual largura da parede? ");
		lp = scan.nextDouble();

		System.out.println("Qual altura do azulejo? ");
		ha = scan.nextDouble();

		System.out.println("Qual largura do azulejo? ");
		la = scan.nextDouble();

		qtd = (hp * lp) / (ha * la);
		System.out.println("A quantidade necess�ria � de: " + qtd);

		scan.close();

	}

}
