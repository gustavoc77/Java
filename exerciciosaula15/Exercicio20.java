package exerciciosaula15;

import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome, resposta1, resposta2, resposta3, resposta4, resposta5;
		int soma = 0;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		System.out.println("Telefonou para a v�tima? ");
		resposta1 = scan.next();
		if (resposta1.toUpperCase().equals("SIM") ) {
			soma += 1;
		}
		
		System.out.println("Esteve no local do crime? ");
		resposta2 = scan.next();
		if (resposta2.toUpperCase().equals("SIM") ) {
			soma += 1;
			}
		
		System.out.println("Mora perto da v�tima? ");
		resposta3 = scan.next();
		if (resposta3.toUpperCase().equals("SIM") ) {
			soma += 1;
		}
		
		System.out.println("Devia para a v�tima? ");
		resposta4 = scan.next();
		if (resposta4.toUpperCase().equals("SIM") ) {
			soma += 1;
		}
		
		System.out.println("J� trabalhou com a v�tima?");
		resposta5 = scan.next();
		if (resposta5.toUpperCase().equals("SIM") ) {
			soma += 1;
		}
		
		if (soma == 2) {
			System.out.println(nome + " � uma pessoa Suspeita!");
		}
		else if (soma > 2 && soma < 5) {
			System.out.println(nome + " Foi C�mplice!");
		}
		
		else if (soma == 5) {
			System.out.println(nome + " � a Pessoa Assassina!");
		}
		
		else {
			System.out.println(nome + "� uma pessoa Inocente!");
		}
	}
}
