package exerciciosaula15;

import java.io.IOException;
import java.util.Scanner;
public class Exercicio04 {

	// através da cláusula throws indicamos que não iremos
	// tratar possíveis erros na entrada de dados realizada
	// através do método "read" do pacote de classes System.in
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		char letra;
		
		System.out.println("Digite uma letra: ");
		letra = (char)System.in.read();
		
		switch(letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':	
		case 'o':
		case 'O':	
		case 'u':
		case 'U': System.out.println("A letra é vogal"); break;
		default:  System.out.println("A letra é consoante");
		
		}

	}

}
