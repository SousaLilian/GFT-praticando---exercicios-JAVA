package exercicio007;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int inicioLua;
		int fimLua;

		System.out.println("Digite o primeiro percentual observado: ");
		inicioLua = scan.nextInt();

		System.out.println("Digite o segundo percentual observado: ");
		fimLua = scan.nextInt();

		if (inicioLua >= 0 && fimLua <= 2) {
			System.out.println("Lua Nova");
		} else if (fimLua > inicioLua && fimLua <= 96) {
			System.out.println("Lua Crescente");
		} else if (inicioLua > fimLua && fimLua <= 96) {
			System.out.println("Lua Minguante");
		} else {
			System.out.println("Lua Cheia");
		}

		scan.close();
	}

}
