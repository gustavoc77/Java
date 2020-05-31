package exerciciosaula13;

import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] nota = new float[4];
		float media, soma = 0;
		int i;
		for(i=0; i<4; i++) {
			System.out.println("Digite a " + (i+1) + " nota: ");
			nota[i] = scan.nextFloat();
			soma+=nota[i];
		}
		media = soma / 4;
		System.out.println("Média: " + media);
	}

}
