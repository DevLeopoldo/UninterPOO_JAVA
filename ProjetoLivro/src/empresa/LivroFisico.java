package empresa;

public class LivroFisico extends Livro{
	private int tiragem;
	private int peso;
	
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	public LivroFisico(int tiragem, int peso) {
		super();
		this.tiragem = tiragem;
		this.peso = peso;
	}
	public LivroFisico() {
		
	}
	public LivroFisico(String string, Autor autor, String string2, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void info() {
		super.info();
		System.out.println("Tiragem: " + tiragem);
		System.out.println("Peso: " + peso);
	}
	
}
