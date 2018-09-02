import java.util.Scanner;

public class Exercicio1 {
	
	
	
	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		
		int[] nros = new int[5];
		int maior = 0, menor = 0;
		
		for (int i = 0; i < 5; i++){
			
			System.out.println("Insira o " + (i+1) + "o. nro: ");
			nros[i] = leitorTeclado.nextInt();
			
			if(i == 0){
				maior = nros[i];
				menor = nros[i];
			}
			
			else{
				if(nros[i] < menor) 
					menor = nros[i];
				if(nros[i] > maior) 
					maior = nros[i];
			}
		}
		
		System.out.println("Maior = " + maior + ", Menor = " + menor);
		leitorTeclado.close();
		
	}
}