package exerciciosaula15;

import java.io.IOException;
import java.util.Scanner;
public class Exercicio21 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int litrosVendidos;
		char tipoCombustivel;
		double precoGasolina = 2.50, precoAlcool = 1.90, precoTotal, desconto;
		
		System.out.println("Digite a quantidade de litros que você deseja: ");
		litrosVendidos = scan.nextInt();
		
		System.out.println("Digite o tipo de combustível: \nA - Álcool \nG - Gasolina ");
		tipoCombustivel = (char)System.in.read();
		
		if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
			if (litrosVendidos <= 20) {
				desconto = (precoAlcool * litrosVendidos) * 0.03;
			}
			else {
				desconto = (precoAlcool * litrosVendidos) * 0.05;
			}
			
			precoTotal = litrosVendidos * precoAlcool - desconto;
			System.out.println("Você pagará: R$ " + precoTotal );
		}
		else {
			if (litrosVendidos <= 20) {
				desconto = (precoAlcool * litrosVendidos) * 0.04;
			}
			else {
				desconto = (precoAlcool * litrosVendidos) * 0.06;
			}
		
			precoTotal = (litrosVendidos * precoAlcool) - desconto;
			System.out.println("Você pagará: R$ " + precoTotal );
		}
		
		
	}

}
