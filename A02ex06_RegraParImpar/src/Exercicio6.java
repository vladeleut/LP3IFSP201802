import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		int x;
		
		System.out.println("Insira um valor inteiro: ");
		x = leitorTeclado.nextInt();
		
		while(x !=1 ){
			if(x%2 == 0){//x é par
				x = x/2;
			}
			else{
				x = 3*x + 1;
			}
			System.out.println(x + " ");
		}
		leitorTeclado.close();
		
	}
}