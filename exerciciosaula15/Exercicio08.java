package exerciciosaula15;

import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double precoProduto1, precoProduto2, precoProduto3;
		String produto1, produto2, produto3;
		
		System.out.println("Qual é o nome do produto?");
		produto1 = scan.next();
		System.out.println("Digite o preço do primeiro produto: ");
		precoProduto1 = scan.nextDouble();
		
		System.out.println("Qual é o nome do produto?");
		produto2 = scan.next();
		System.out.println("Digite o preço do segundo produto: ");
		precoProduto2 = scan.nextDouble();
		
		System.out.println("Qual é o nome do produto?");
		produto3 = scan.next();
		System.out.println("Digite o preço do terceiro produto: ");
		precoProduto3 = scan.nextDouble();
		
		if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
			System.out.println("O " + produto1 + " deve ser comprado!");
		}
		
		else if (precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
			System.out.println("O " + produto2 + " deve ser comprado!");
		}
		
		else {
			System.out.println("O " + produto3 + " deve ser comprado!");
		}
	}

}
