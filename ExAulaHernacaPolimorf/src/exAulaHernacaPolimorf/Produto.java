package exAulaHernacaPolimorf;

public class Produto {
	private int codBarras;
	
	//construtor:
	public Produto (int codBarras) {
		this.codBarras = codBarras;
	}
	
	private String nome;
		
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private double preco;
	
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double d) {
		this.preco = d;
	}
	
	@Override
	public boolean equals(Object p) {
		if(p instanceof Produto && this.codBarras == ((Produto) p).codBarras) {
			return true;
		}
		return false;
	}
	
}
