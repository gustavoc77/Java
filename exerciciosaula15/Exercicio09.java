package exerciciosaula15;

import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, numero3, aux;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = scan.nextInt();
		
		if (numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		if (numero2 > numero3) {
			aux = numero2;
			numero2 = numero3;
			numero3 = aux;
		}
		
		if (numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}

		System.out.println("Ordem decrescente: " + numero3 + " - " + numero2 + " - " + numero1);
			
	}

}
