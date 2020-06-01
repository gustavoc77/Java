package exerciciosaula13;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas;
		double ganhoHora, salarioBruto, descontos, ir, inss, sindicato, salarioLiquido;
		
		System.out.println("Quanto você ganha por hora? ");
		ganhoHora = scan.nextDouble();
		System.out.println("Número de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();
		
		salarioBruto = ganhoHora * horasTrabalhadas;
		ir = 0.11 * salarioBruto;
		inss = 0.08 * salarioBruto;
		sindicato = 0.05 * salarioBruto;
		descontos = ir + inss + sindicato;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("INSS: R$" + inss);
		System.out.println("Sindicato: R$" + sindicato);
		System.out.println("Salário Líquido: R$" + (salarioBruto - descontos) );
	}

}
