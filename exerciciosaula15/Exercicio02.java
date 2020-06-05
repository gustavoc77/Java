package exerciciosaula15;

import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = scan.nextInt();
		
		if (valor < 0) {
			System.out.println("O número é negativo!");
		}
		else {
			System.out.println("O número é positivo!");
		}
		
	}

}
