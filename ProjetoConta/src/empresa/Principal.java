package empresa;

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta("Mario", 5000);
		Conta c2 = new Conta("Luigi", 2000);
		
	
			c1.info();
			c2.info();
			c1.transferir(50000, c2);
			c1.info();
			c2.info();
		
	
	}
}
