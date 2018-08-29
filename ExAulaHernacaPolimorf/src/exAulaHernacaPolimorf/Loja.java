package exAulaHernacaPolimorf;

public class Loja {

	public static void main(String[] args) {
		
		Produto[] produtos = new Produto[5];
		
		produtos[0] = new Livro(123456);
		produtos[1] = new CDs(654321);
		produtos[2] = new DVDs(142536);
		produtos[3] = new Livro(123456);
		produtos[4] = new CDs(635241);
		
		((Livro)produtos[0]).setAutor("Eu");
		produtos[0].setPreco(36.00);
		produtos[0].setNome("Meu Livro");
		
		((CDs)produtos[1]).setNroFaixas(15);
		produtos[1].setPreco(5.00);
		produtos[1].setNome("Meu CD");
		
		((DVDs)produtos[2]).setDuracao(5000);
		produtos[2].setPreco(50.00);
		produtos[2].setNome("Meu DVD");
		
		((Livro)produtos[3]).setAutor("Ele");
		produtos[3].setPreco(50.00);
		produtos[3].setNome("Livro Dele");
		
		((CDs)produtos[4]).setNroFaixas(20);
		produtos[4].setPreco(2.00);
		produtos[4].setNome("Sandy & Júnior");
		
		//for(Tipo objetoTemp: objeto)
		for(Produto p: produtos) {
			System.out.println(p.toString());
		}
		
		System.out.println(produtos[0].equals(produtos[3]));
		System.out.println(produtos[0].equals(produtos[2]));
		
		//Produto p = new Produto(256380); "Não foi encontrado"
		Produto p = new Produto(142536);
		int cont = 0;
		boolean busca = false;
		
		for(Produto prod: produtos) {
			cont++;
			if(prod.equals(p)) {
				busca = true;
				System.out.println("Posição: " + cont);
			}
		}
		
		if (!busca) {
			System.out.println("Não foi encontrado");
		}
		
	}

}
