package exerciciosaula15;

import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double numero1, numero2, numero3, maiorNumero, menorNumero;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextDouble();
		maiorNumero = numero1;
		menorNumero = numero1;
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextDouble();
		if (numero2 > numero1) {
			maiorNumero = numero2;
		}
		else {
			menorNumero = numero2;
		}
		System.out.println("Digite o terceiro número: ");
		numero3 = scan.nextDouble();
		if (numero3 > maiorNumero) {
			maiorNumero = numero3;
		}
		else {
			if (numero3 < menorNumero) {
				menorNumero = numero3;
			}
		}	
			System.out.println("O maior número é: " + maiorNumero);
			System.out.println("O menor número é: " + menorNumero);
	}

}
