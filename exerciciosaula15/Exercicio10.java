package exerciciosaula15;

import java.util.Scanner;
import java.io.IOException;
public class Exercicio10 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		char turno;
		
		System.out.println("Em qual turno você estuda? ");
		System.out.println("M - Matutino    V - Vespertino    N - Noturno");
		turno = (char)System.in.read();
		
		switch (turno) {
		case 'M': case 'm': System.out.println("Bom Dia!"); break;
		case 'V': case 'v': System.out.println("Boa Tarde!"); break;
		case 'N': case 'n': System.out.println("Boa Noite!"); break;
		default: System.out.println("Valor Inválido!");
		}
		
	}

}
