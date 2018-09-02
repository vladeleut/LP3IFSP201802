import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		int entrada;
			
		System.out.println("Insira a quantidade de livros: ");
		entrada = leitorTeclado.nextInt();
		
		//criterio a | criterio b
		if( (0.25*entrada + 7.5) < (0.50*entrada + 2.5) ){
			System.out.println("Critério A");
		}
		else if( (0.25*entrada + 7.5) == (0.50*entrada + 2.5) ){
				System.out.println("Indiferente");
			}
			else 
				System.out.println("Critério B");
		leitorTeclado.close();
	}
}