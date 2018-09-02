import java.util.Scanner;

public class Exercicio10 {
	
	
	
	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		
		
		int[] A = new int[5];
		int somapar = 0, somaimpar = 0;
		
		for (int i = 0; i < 5; i++){
			
			System.out.println("Insira o " + (i+1) + "o. nro: ");
			A[i] = leitorTeclado.nextInt();
			
			if( A[i] % 2 == 0){
				somapar += A[i];
			}
			else{ 
				somaimpar += A[i];
			}
		}
		
		System.out.println("Soma dos pares = " + somapar + ", soma dos impares = " + somaimpar);
		
		leitorTeclado.close();
	}
}