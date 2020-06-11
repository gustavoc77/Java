package exerciciosaula15;

import java.util.Scanner;
public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int kgMorango, kgMaca;
		double precoMorango, precoMaca, precoTotalMorango, precoTotalMaca;
		
		System.out.println("Digite quantos kg de Morango adquiridos: ");
		kgMorango = scan.nextInt();
		if (kgMorango <= 5) {
			precoMorango = 2.50;
			precoTotalMorango = kgMorango * precoMorango;
		}
		else {
			precoMorango = 2.20;
			precoTotalMorango = kgMorango * precoMorango;
			if (kgMorango > 8 || precoTotalMorango > 25 ) {
				precoTotalMorango = precoTotalMorango * 0.90;
			}
		}
		
		System.out.println("Digite quantos kg de Maçã adquiridos:");
		kgMaca = scan.nextInt();
		if (kgMaca <= 5) {
			precoMaca = 1.80;
			precoTotalMaca = kgMaca * precoMaca;
		}
		else {
			precoMaca = 1.50;
			precoTotalMaca = kgMaca * precoMaca;
			if (kgMaca > 8 || precoTotalMaca > 25 ) {
				precoTotalMaca = precoTotalMaca * 0.90;
			}
		}
		
		System.out.println("Preço Total Maçã: R$" + precoTotalMaca);
		System.out.println("Preço Total Morango: R$" + precoTotalMorango);
		
	}

}
