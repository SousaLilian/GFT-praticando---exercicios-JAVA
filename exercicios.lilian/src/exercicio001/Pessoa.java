package exercicio001;

public class Pessoa {

	public int anos;
	public int meses;
	public int dias;

	public Pessoa() {
	}

	public void calcularDias(int anos, int meses, int dias) {

		int resultado = anos * 365 + meses * 30 + dias;
		System.out.println(resultado);
	}

}


/*Fa?a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em considera??o o ano com 365 dias e o m?s com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
