package exercicio008;

import java.util.Scanner;

/*Calcular e apresentar o valor do volume de uma lata de ?leo, utilizando f?rmula: V = 3.14159 * R * R * A, 
 * em que as vari?veis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as vari?veis V, R e A como double e definir um valor qualquer para as vari?veis de altura e de raio. 
Agora vamos escrever a f?rmula, conforme dita no enunciado e, em seguida, 
exibir na tela uma mensagem contendo o resultado do volume encontrado.*/

public class LataOleo {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		double V, R, A;
		
		System.out.println("Digite o volume: ");
		V = scan.nextDouble();
		
		System.out.println("Digite o raio: ");
		R = scan.nextDouble();
		
		System.out.println("Digite a altura: ");
		A = scan.nextDouble();
	
		V = 3.14159 * R * R * A;
		
		System.out.println("O volume encontrado ?: " + V);
		
		scan.close();

	}

}
