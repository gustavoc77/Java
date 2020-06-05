package exerciciosaula15;

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		}
		else {
			System.out.println("O maior número é: " + numero2);
		}
			
	}

}
