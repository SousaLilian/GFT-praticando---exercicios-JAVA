package dioBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente lilian = new Cliente();
		lilian.setNome("Lilian");
		
		Conta cc = new ContaCorrente(lilian);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(lilian);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
