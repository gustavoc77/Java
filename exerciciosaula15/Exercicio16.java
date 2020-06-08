package exerciciosaula15;

import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b, b2, c, delta;
		double r1, r2;
		
		System.out.println("Digite o valor de a: "); a = scan.nextInt();
		if (a == 0) {
			System.out.println("Não é equação do segundo grau!");
		}
		
		else {
			System.out.println("Digite o valor de b: "); b = scan.nextInt();
			System.out.println("Digite o valor de c: "); c = scan.nextInt();
			
			b2 = b * b;
			delta = b2 + ((-4) * a * c);
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais!");
			}
			else {
				
				r1 = (-b + Math.sqrt(delta)) / (2 * a);
				r2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				if (delta == 0) {
					System.out.println("A raíz real é: " + r1 + r2 );
				}
				
				else {
					System.out.println("As raízes reais são: " + "\n A 1ª Raíz é: " + r1 + "\nA segunda raíz é: " + r2);
				}
			}
			
			
		}
		

		

		
		
	}

}
