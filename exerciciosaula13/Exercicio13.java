package exerciciosaula13;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double ganhoHora, salarioBruto, descontos, ir, inss, sindicato, salarioLiquido;
		
		System.out.println("Quanto voc� ganha por hora? ");
		ganhoHora = scan.nextDouble();
		System.out.println("N�mero de horas trabalhadas no m�s: ");
		horasTrabalhadas = scan.nextInt();
		
		salarioBruto = ganhoHora * horasTrabalhadas;
		ir = 0.11 * salarioBruto;
		inss = 0.08 * salarioBruto;
		sindicato = 0.05 * salarioBruto;
		descontos = ir + inss + sindicato;
		
		System.out.println("Sal�rio Bruto: R$" + salarioBruto);
		System.out.println("INSS: R$" + inss);
		System.out.println("Sindicato: R$" + sindicato);
		System.out.println("Sal�rio L�quido: R$" + (salarioBruto - descontos) );
	}

}
