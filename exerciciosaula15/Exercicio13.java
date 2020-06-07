package exerciciosaula15;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int diaSemana;
		
		System.out.println("Digite o dia da semana: ");
		System.out.println("1 - Domingo \n2 - Segunda \n3 - Terça \n4 - Quarta \n5 - Quinta \n6 - Sexta \n7 - Sábado" );
		diaSemana = scan.nextInt();
		
		switch (diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda-Feira"); break;
			case 3: System.out.println("Terça-Feira"); break;
			case 4: System.out.println("Quarta-Feira"); break;
			case 5: System.out.println("Quinta-Feira"); break;
			case 6: System.out.println("Sexta-Feira"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Dia Inválido!");
		
		}
		
	
	}

}
