package exercicio007;

import java.util.Scanner;

public class QtdeNumerosPositivos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numero;
		int positivo = 0;
		
		System.out.println("Digite 6 numeros, positivos ou negativos: ");
				
		for (int i=0; i<6; i++) {
			numero = scan.nextDouble();
			if(numero>0) positivo++;
		}
		
		System.out.println("A quantidade de positivos foi: " + positivo);
		
		scan.close();

	}

}
 