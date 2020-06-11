package exerciciosaula15;

import java.util.Scanner;
public class Exercício23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String tipoCarne;
		int qtdCarne, escolha;
		double precoCarne = 0, precoTotal = 0, desconto;
		
		System.out.println("Qual carne deseja levar? ");
		tipoCarne = scan.next();
		
		System.out.println("Quantos KG? ");
		qtdCarne = scan.nextInt();
		
		if(tipoCarne.toUpperCase().equals("File Duplo")){
			if (qtdCarne < 5) {
				precoCarne = 4.90;
			}
			else {
				precoCarne = 5.80;
			}
			precoTotal = precoCarne * qtdCarne;
		}
		else if(tipoCarne.toUpperCase().equals("Alcatra")){
			if (qtdCarne < 5) {
				precoCarne = 5.90;
			}
			else {
				precoCarne = 6.80;
			}
			precoTotal = precoCarne * qtdCarne;
		}
		
		else if(tipoCarne.toUpperCase().equals("Picanha")){
			if (qtdCarne < 5) {
				precoCarne = 6.90;
			}
			else {
				precoCarne = 7.80;
			}
			precoTotal = precoCarne * qtdCarne;
		}
		
		System.out.println("Escolha o método de pagamento: \nDinheiro - 1 \nCartão Tabajara - 2 ");
		escolha = scan.nextInt();
		
		if (escolha == 1) {
			System.out.println("Tipo da Carne: " + tipoCarne +
		"\nQuantidade" + qtdCarne + 
		"\nPreço Total: R$ " + precoTotal +
		"\nTipo de Pagamento: " + "Dinheiro" +
		"\n Valor do desconto:" + 0 +
		"\nValor a Pagar: R$ " + precoTotal); 
		}
		
		else {
			System.out.println("Tipo da Carne: " + tipoCarne +
		"\nQuantidade" + qtdCarne + 
		"\nPreço Total: R$ " + precoTotal +
		"\nTipo de Pagamento: " + "Cartão Tabajara" +
		"\n Valor do desconto:" + (precoCarne * 0.05) +
		"\nValor a Pagar: R$ " + (precoTotal * 0.95)); 
		}
		
	}

}
