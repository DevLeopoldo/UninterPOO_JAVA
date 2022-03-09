package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList();
		
		Scanner teclado = new Scanner(System.in);
		String msg;
		System.out.println("Digite quantos nomes ira inserir");
		int total = teclado.nextInt();
		
		System.out.println("Digite os nomes");
		for(int i=0; i<total;i++) {
			msg = teclado.next();
			nomes.add(msg);
		}
		System.out.println("Ordem normal");
		
		System.out.println(nomes);
		
		System.out.println("Ordem inversa");
		Collections.reverse(nomes);
		System.out.println(nomes);
		}
		
		
	}


