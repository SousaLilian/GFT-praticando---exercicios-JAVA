package exercicio008;

/*Criar um programa que calcule a m�dia de sal�rios de uma empresa, 
pedindo ao usu�rio a grade de funcion�rios e os sal�rios, e devolvendo a m�dia salarial*/

public class MediaSalario {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		
		n1 = 1000;
		n2 = 2000;
		n3 = 3000;
		n4 = 4000;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A m�dia dos sal�rios � R$ " + media);
		
	}

}
