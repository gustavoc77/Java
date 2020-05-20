package Aula07;
import java.util.Scanner;

public class Erro02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont; //variável não iniciada
		
		System.out.print("Digite um número: ");
		cont = s.nextInt();
		System.out.println("Você digitou: " + cont);
		
	}

}
