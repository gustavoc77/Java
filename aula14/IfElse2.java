package aula14;

import java.util.Scanner;
public class IfElse2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//barato <= 10
		//10 < valor > 15 - pedir desconto
		//15 < valor > 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar");
		}
		else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir desconto");
		}
		
		else if (valor >=15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		}
		else {
			System.out.println("Muito caro");
		}
	}

}
