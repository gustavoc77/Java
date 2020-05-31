package exerciciosaula13;

import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double fahrenheit, celsius;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = scan.nextDouble();
		celsius = (5 * (fahrenheit - 32) / 9);
		System.out.println("A temperatura em Celsius é: " + celsius + "°C");
		
		
	}
}
