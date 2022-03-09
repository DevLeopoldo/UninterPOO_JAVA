package empresa;

public class Moeda {
	private String Nome;
	private double valor;

	public Moeda(String nome, double valor) {
		super();
		Nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
