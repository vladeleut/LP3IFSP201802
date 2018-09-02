import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitorTeclado = new Scanner(System.in);
		float a, b, c;
		
		System.out.println("Primeiro lado: ");
		a = leitorTeclado.nextFloat();
		System.out.println("Segundo lado: ");
		b = leitorTeclado.nextFloat();
		System.out.println("Terceiro lado: ");
		c = leitorTeclado.nextFloat();
		
		//verifica se forma triangulo
		if( a + b > c && a+c > b && b+c > a ){
			
			if((a != b)&&(a != c)&&(b != c))
			System.out.println("Escaleno");
			else if((a == b)&&(a == c)&&(b == c))
				System.out.println("Equilatero");
			else
				System.out.println("Isosceles");
		}
		else
			System.out.println("Nao forma um triangulo");
		leitorTeclado.close();
	}
}