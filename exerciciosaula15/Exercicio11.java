package exerciciosaula15;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Double salario, salarioAjustado = null, percentual;
		
		System.out.println("Digite o seu salário: ");
		salario = scan.nextDouble();
		
		if (salario <= 280) {
			percentual = 1.20;
			salarioAjustado = salario * percentual; 
		}
		
		else if (salario > 280 && salario <=700) {
			percentual = 1.15;
			salarioAjustado = salario * percentual;
		}
		
		else if (salario > 700 && salario <= 1500) {
			percentual = 1.10;
			salarioAjustado = salario * percentual;
		}
		
		else {
			percentual = 1.05;
			salario *= percentual;
		}
		DecimalFormat f = new DecimalFormat("#.##");
		
		f.format(salario);
		
		System.out.println("Salário antes do reajuste : R$" + f.format(salario));
		System.out.println("Percentual aplicado: " + percentual + "%" );
		System.out.println("Valor do aumento: R$" + (f.format(salarioAjustado - salario)));
		System.out.println("Novo salário: R$" + (f.format(salarioAjustado)));
	}

}
