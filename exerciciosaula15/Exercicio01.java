package exerciciosaula15;

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		}
		else {
			System.out.println("O maior n�mero �: " + numero2);
		}
			
	}

}
