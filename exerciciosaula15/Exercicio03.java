package exerciciosaula15;

import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sexo;
		
		System.out.println("Digite seu sexo:"
				+ "F - Feminino "
				+ "M - Masculino: ");
		sexo = scan.next().toUpperCase();
		
		if (sexo.equals("F")) {
			System.out.println("Sexo Feminino!");
		}
		else if (sexo.equals("M")){
			System.out.println("Sexo Masculino!");
		}
		else {
			System.out.println("Sexo Inválido!");
		}
		
		
		
	}

}
