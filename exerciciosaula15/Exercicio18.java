package exerciciosaula15;

import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero � Par!");
		}
		else {
			System.out.println("O n�mero � �mpar!");
		}
	}

}
