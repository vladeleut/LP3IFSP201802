package exAulaHernacaPolimorf;

public class Livro extends Produto {
	private String autor;
	
	public Livro(int codBarras) {
		super(codBarras);
	}
	
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() +  "; Preço: R$" + this.getPreco() + "; Autor: " + this.getAutor();
	}
	
}
