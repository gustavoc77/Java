package aula12;

import java.util.Scanner;
public class LeituraDadosTeclado1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Voc� tem " + idade + " anos");
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);
		
		System.out.println("Digite o seu primeiro nome, quantidade de filhos, altura e se tem bichos de estima��o:");
		String nome = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro Nome" + nome);
		System.out.println("Idade " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem animais de estima��o? " + temPet);
		
	}

}
