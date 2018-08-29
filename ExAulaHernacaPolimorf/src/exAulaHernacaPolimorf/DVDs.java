package exAulaHernacaPolimorf;

public class DVDs extends Produto {
	private int duracao;
	
	public DVDs(int codBarras) {
		super(codBarras);
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() +  "; Preço: R$" + this.getPreco() + "; Duração: " + this.getDuracao() + "s";
	}
}
