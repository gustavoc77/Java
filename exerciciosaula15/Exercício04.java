package exerciciosaula15;

import java.io.IOException;
import java.util.Scanner;
public class Exerc�cio04 {

	// atrav�s da cl�usula throws indicamos que n�o iremos
	// tratar poss�veis erros na entrada de dados realizada
	// atrav�s do m�todo "read" do pacote de classes System.in
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
		case 'U': System.out.println("A letra � vogal"); break;
		default:  System.out.println("A letra � consoante");
		
		}

	}

}
