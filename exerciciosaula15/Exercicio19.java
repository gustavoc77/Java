package exerciciosaula15;

import java.io.IOException;
import java.util.Scanner;
public class Exercicio19 {
	public static String numeroDivisivel(double resultadof) {
		if (resultadof % 2 == 0) {
			String resposta1 = "N�mero � Par!";
			System.out.println(resposta1);
			String resposta2;
			if (resultadof >= 0) {
				resposta2  = "N�mero � Positivo!";
			}
			else {
				resposta2 = "N�mero � Negativo!";
			}
			System.out.println(resposta2);
			return resposta1;
		}
		else {
			String resposta = "N�mero � �mpar!";
			System.out.println(resposta);
			String resposta2;
			if (resultadof >= 0) {
				resposta2  = "N�mero � Positivo!";
			}
			else {
				resposta2 = "N�mero � Negativo!";
			}
			System.out.println(resposta2);
			return resposta2;
		}
	}
	
	public static void main(String[] args) throws IOException{

		Scanner scan = new Scanner(System.in);
		double numero1, numero2;
		char opcao;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = scan.nextDouble();
				
		System.out.println("Qual opera��o voc� deseja realizar? Soma - S \nSubtra��o - s \nMultiplica��o - M \nDivis�o - D ");		
		opcao = (char)System.in.read();
		
		double resultado;
		switch (opcao) {
			case 'S': {
				resultado = numero1 + numero2;
				System.out.println(numero1 + " + " + numero2 + " = " + (resultado));
				numeroDivisivel(resultado);
				break;
			}
			
			case 's': {
				resultado = numero1 - numero2;
				System.out.println(numero1 + " - " + numero2 + " = " + (resultado));
				numeroDivisivel(resultado);
				break;
			}
			
			case 'M': case 'm': {
				resultado = numero1 * numero2;
				System.out.println(numero1 + " * " + numero2 + " = " + (resultado));
				numeroDivisivel(resultado);
				break;
			}
			
			case 'D': case 'd': {
				resultado = numero1 / numero2;
				System.out.println(numero1 + " / " + numero2 + " = " + (resultado));
				numeroDivisivel(resultado);
				break;
			}
		}
	}
}
