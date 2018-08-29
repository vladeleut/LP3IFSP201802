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
		return "Nome: " + this.getNome() +  "; Pre�o: R$" + this.getPreco() + "; Dura��o: " + this.getDuracao() + "s";
	}
}
