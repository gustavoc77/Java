/*Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto*/
package exerciciosaula15;

import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano: ");
		ano = scan.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("O ano é Bissexto!");
		}
		
		else {
			
			if (ano % 4 == 0 && ano % 100 != 0) {
				System.out.println("O ano é Bissexto!");
			}
			else {
				System.out.println("O ano não é Bissexto!");
			}
			
		}
		
	}

}
