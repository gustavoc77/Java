package exerciciosaula13;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pesoIdeal = 0, altura = 0;
		
		System.out.println("Digite a sua altura em metros: ");
		altura = scan.nextDouble();
		pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal + " kilogramas");
		
	}

}
