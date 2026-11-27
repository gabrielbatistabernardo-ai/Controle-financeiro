import java.util.Scanner;

public class ControleFinanceiro {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Digite o nome e sobrenome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua receita: ");
		float receita = scanner.nextFloat();
		System.out.println("receita total de:R$" + receita);

        System.out.println("Digite sua despesa: ");
		float despesa = scanner.nextFloat();
		System.out.println("Despesa total de:R$" + despesa);

		
	}










}
