package exerciciosaula13;

import java.util.Scanner;
public class Exercicio08 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		double ganhoHora, ganhoTotal;
		int horasTrabalhadas;
		
		System.out.println("Quanto � o ganho por hora? ");
		ganhoHora = scan.nextDouble();
		System.out.println("N�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = scan.nextInt();
		
		ganhoTotal = horasTrabalhadas * ganhoHora;
		System.out.println("O seu sal�rio total �: R$" + ganhoTotal);
	}
}
