package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mario",2000,500,50);
		
		c1.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Problemas ao sacar!");
		}
		if(!c1.depositar(500)) {
			System.out.println("Problema ao depositar!");
		}
		if(!c1.transferir(50)) {
			System.out.println("Problema ao transferir!");
		}
		System.out.println();
		c1.info();
	}

}
