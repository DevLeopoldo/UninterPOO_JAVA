package empresa;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	double transferir;
	
	boolean sacar(double valor) {
		if(valor>limite || valor >saldo || valor <=0) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	boolean depositar(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}
	
	boolean transferir(double valor) {
		if(valor>limite || valor <= 0) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public Conta(int numero, String titular, double saldo, double limite, double transferir) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.transferir = transferir;
	}

	void info() {
		System.out.println("Nome: " + titular);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}

}
