package exerciciosaula13;

import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float areaQuadrado, lado;
		System.out.println("Digite o tamano do lado do quadrado: ");
		lado = scan.nextFloat();
		areaQuadrado = (float) Math.pow(lado, 2);
		System.out.println("O dobro da áreado quadrado é: " + (areaQuadrado * 2));
		
		
	}

}
