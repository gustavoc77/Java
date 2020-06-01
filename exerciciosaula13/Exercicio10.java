package exerciciosaula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double fahrenheit, celsius;
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = scan.nextDouble();
		fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
		
	}
}
