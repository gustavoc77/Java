/*Fa�a um Programa que pe�a um n�mero correspondente a um
determinado ano e em seguida informe se este ano � ou n�o bissexto*/
package exerciciosaula15;

import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano: ");
		ano = scan.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("O ano � Bissexto!");
		}
		
		else {
			
			if (ano % 4 == 0 && ano % 100 != 0) {
				System.out.println("O ano � Bissexto!");
			}
			else {
				System.out.println("O ano n�o � Bissexto!");
			}
			
		}
		
	}

}
