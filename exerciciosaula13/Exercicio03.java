/*Fa�a um Programa que pe�a dois n�meros e imprima a soma*/
package exerciciosaula13;

import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite o primeiro n�mero: "); numero1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: "); numero2 = scan.nextInt();
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) );
		
	}

}
