package exerciciosaula15;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		char conceito;
		String resultado;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 9 ) {
			conceito = 'A';
			resultado = "APROVADO";
		}
		
		else if (media >= 7.5 && media < 9) {
			conceito = 'B';
			resultado = "APROVADO";
		}
		
		else if (media >= 6 && media < 7.5) {
			conceito = 'C';
			resultado = "APROVADO";
		}
		
		else if (media >= 4 && media < 6) {
			conceito = 'D';
			resultado = "REPROVADO";
		}
		
		else {
			conceito = 'E';
			resultado = "REPROVADO";
		}
		
		System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2);
		System.out.println("Média do aluno: " + media);
		System.out.println("Conceito = " + conceito + "\nResultado = " + resultado);
	}
}