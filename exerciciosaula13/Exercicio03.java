/*Faça um Programa que peça dois números e imprima a soma*/
package exerciciosaula13;

import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite o primeiro número: "); numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: "); numero2 = scan.nextInt();
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) );
		
	}

}
