package exercicio002;

/*Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos 
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.*/

public class Media {

	public static void main(String[] args) {
		
		
		int a = 7; 
		int b = 8;
		int c = 9;
		
		double media1 = a + b + c / 3;
		System.out.println("primeira m�dia �: " + media1);
		System.out.println();

		int d = 4; 
		int e = 5;
		int f = 6;
		
		double media2 = d + e + f / 3;
		System.out.println("segunda m�dia �: " + media2);
		
		System.out.println();
		System.out.println("Soma das duas m�dias �: " + (media1 + media2));
		
		System.out.println();
		System.out.println("As m�dias das m�dias �: " + (media1 + media2)/6);
	}

}
