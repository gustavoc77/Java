package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		resultado *= 2;
		System.out.println(resultado);
		
		resultado /= 2;
		System.out.println(resultado);
		
		resultado += 8;
		System.out.println(resultado);
		
		resultado %= 7;
		System.out.println(resultado);
		
		//concatena��o de String
		String primeiroNome = "Esta � ";
		String segundoNome = "uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		System.out.println(resultado++); //imprime e depois soma
		System.out.println(++resultado); //soma e imprime
	}

}
