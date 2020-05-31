package exerciciosaula13;

import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int metros, centimetros;
		System.out.println("Digite a distância em metros: "); 
		metros = scan.nextInt();
		centimetros = metros * 100;
		System.out.println(metros + " metros tem " + centimetros + " cm");
	}

}
