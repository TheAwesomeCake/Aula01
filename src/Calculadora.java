import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		/*
		double primeiroValor;
		double segundoValor;
		double soma;
		System.out.println("Por favor, digite um valor:");
		primeiroValor = in.nextDouble();
		System.out.println("Por favor, digite um segundo valor:");
		segundoValor = in.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre ambos os valores �: " + soma);
*/
		double valor;
		double valor2;
		
		System.out.println("Insira um valor:");
		valor = in.nextDouble();
		System.out.println("Insira um segundo valor:");
		valor2 = in.nextDouble();
		System.out.println(" ");
		
		double valor3 = valor + valor2;
		double valor4 = valor - valor2;
		double valor5 = valor * valor2;
		double valor6 = valor / valor2;
		
		System.out.println("Conta de adi��o: " + valor3);
		System.out.println("Conta de subtra��o: " + valor4);
		System.out.println("Conta de multiplica��o: " + valor5);
		System.out.println("Conta de divis�o: " + valor6);
	}

}
