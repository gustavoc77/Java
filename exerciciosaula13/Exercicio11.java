/*Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
package exerciciosaula13;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1 = 0, numero2 = 0;
		double numero3 = 0;
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero inteiro: ");
		numero2 = scan.nextInt();
		System.out.println("Digite o n�mero real: ");
		numero3 = scan.nextDouble();
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + ((numero1 + numero1) * (numero2 / 2)));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + (numero1 * 3 + numero3));
		System.out.println("O terceiro elevado ao cubo: " + (Math.pow(numero3, 3)));
	}

}
