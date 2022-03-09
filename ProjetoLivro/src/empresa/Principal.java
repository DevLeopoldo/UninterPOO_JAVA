package empresa;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital livroA = new LivroDigital("Senhor dos aneis", new Autor("Tolkien","Britanico","tolkien@email.com"),"Aventura",5,10000,3500);
		
		LivroFisico livroB = new LivroFisico("Sherlock Homles", new Autor("Sir Arthur Conan Doyle","Britanico","arthur@email.com"),"Aventura", 2,50000,2500);
		
		Livro livro;
		
		livro = livroA;
		
		livro.info();
		System.out.println("--------------");
		
		livro = livroB;
		
		livro.info();
	}

}
