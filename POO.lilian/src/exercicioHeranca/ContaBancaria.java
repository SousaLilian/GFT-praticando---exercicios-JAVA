package exercicioHeranca;

public class ContaBancaria {

	public String cliente;
	public int numConta;
	public double saldo;
	
	
	public ContaBancaria() {
		
	}


	public ContaBancaria(String cliente, int numConta, double saldo) {
		this.cliente = cliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}