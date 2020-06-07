package exerciciosaula15;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {

		DecimalFormat f = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		Double valorHora, salarioBruto, IR, valorIR, INSS, FGTS, sindicato, salarioLiquido = null;
		int horasTrabalhadas;
		
		System.out.println("Digite o valor da hora de trabalho: ");
		valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();
	
		salarioBruto = horasTrabalhadas * valorHora;
		sindicato = 0.03 * salarioBruto;
		FGTS = 0.11 * salarioBruto;
		INSS = 0.10 * salarioBruto;
		
		if (salarioBruto <= 900) {
			IR = 0.0;
			valorIR = 0.0;
		}
			
		else if (salarioBruto <= 1500) {
			IR = 0.95;
			valorIR = salarioBruto - (IR * salarioBruto);		
			}
		
		else if (salarioBruto <= 2500) {
			IR = 0.90;
			valorIR = salarioBruto - (IR * salarioBruto);
		}
		
		else {
			IR = 0.80;
			valorIR = salarioBruto - (IR * salarioBruto);		
			}
		
		salarioLiquido = salarioBruto - (valorIR + FGTS + INSS + sindicato);
		
		
		System.out.println("Salário Bruto: " + valorHora + " + " + horasTrabalhadas + " : R$ " + salarioBruto);
		System.out.println(" - IR : R$ " + valorIR );		
		System.out.println("(-) INSS (10%) : R$ " + f.format(INSS));
		System.out.println("FGTS (11%) : R$ " + FGTS);
		System.out.println("Total de descontos: R$ " + f.format((valorIR + INSS + sindicato)));
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
	}

}
