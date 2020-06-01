package exerciciosaula13;

import java.util.Scanner;
public class Exercicio14 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		double arquivo, velocidadeLink, download;
		
		System.out.println("Qual é o tamanho do arquivo para download? (em MB)");
		arquivo = scan.nextDouble();
		
		System.out.println("Qual é a velocidade do link de internet? (em MBps)");
		velocidadeLink = scan.nextDouble();
		
		download = arquivo / velocidadeLink;
		System.out.println("Tempo aproximado de download do arquivo: " + download + " segundos");
	}
}
