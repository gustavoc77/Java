package exerciciosaula15;

import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Digite o tamanho do primeiro lado: ");
		lado1 = scan.nextInt();
		
		System.out.println("Digite o tamanho do segundo lado: ");
		lado2 = scan.nextInt();
		
		System.out.println("Digite o tamanho do terceiro lado: ");
		lado3 = scan.nextInt();
		
		if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
			System.out.println("� um tri�ngulo!");
			if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("Tri�ngulo Equil�tero!");
			}
			else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				System.out.println("Tri�ngulo Is�sceles!");
			}
			else {
				System.out.println("Tri�ngulo Escaleno!");
			}
		}
		
		else {
			System.out.println("N�o � um tri�ngulo!");
		}
		
	}

}
