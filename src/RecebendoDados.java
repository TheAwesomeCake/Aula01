import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor =  new Scanner(System.in);
		
		String nome,idade,genero;	
		System.out.println("Insira seu nome:");
		nome = leitor.nextLine();
		System.out.println("Insira sua idade:");
		idade = leitor.nextLine();
		System.out.println("Insira seu g�nero:");
		genero = leitor.nextLine();
		System.out.println(" ");
		
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Idade do usuario: " + idade);
		System.out.println("G�nero do usuario: " + genero);
		
		leitor.close();

	}

}
