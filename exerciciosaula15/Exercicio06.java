package exerciciosaula15;

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double numero1, numero2, numero3, maiorNumero = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = scan.nextDouble();
		maiorNumero = numero1;
		System.out.println("Digite o segundo n�mero: ");
		numero2 = scan.nextDouble();
		if (numero2 > numero1) {
			maiorNumero = numero2;
		}
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = scan.nextDouble();
		if (numero3 > numero2) {
			maiorNumero = numero3;
		}
		
		System.out.println("O maior n�mero � o: " + maiorNumero);
		
	}

}
