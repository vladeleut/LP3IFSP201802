package exAulaHernacaPolimorf;

public class CDs extends Produto {
	private int nroFaixas;
	
	public CDs(int codBarras) {
		super(codBarras);
	}
	
	public int getNroFaixas() {
		return this.nroFaixas;
	}
	public void setNroFaixas(int nroFaixas) {
		this.nroFaixas = nroFaixas;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "; Pre�o: R$%" + this.getPreco() + "; Nro de faixas: " + this.getNroFaixas() ;
	}
}
