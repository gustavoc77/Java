package exerciciosaula13;

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final double PI = 3.1415;
		double circulo, raio;
		
		System.out.println("Qual � o raio do c�rculo? ");
		raio = scan.nextDouble();
		circulo = PI * (Math.pow(raio, 2));
		System.out.println("O valor da �rea do c�rculo � " + circulo);
		
		
	}

}
