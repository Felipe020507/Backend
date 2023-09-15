package main;
import java.util.Scanner;
import controller.PaisController;

public class Main {
	public static void main(String[] args) {

		PaisController paisController = new PaisController();

		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar pais");
			System.out.println("2. Exibir lista de paises");
			System.out.println("3. Remover pais da lista"); 
			System.out.println("4. Limpar lista"); 
			System.out.println("5. Retorne o primeiro pais da lista"); 
			System.out.println("6. Retorne o terceiro pais da lista"); 
			System.out.println("7. Retorne o quarto   pais da lista"); 
			System.out.println("8. Testar conexao com o Banco de Dados"); 
			System.out.println("0. Sair");
			System.out.print("Escolha uma opcao: ");
			
			
			try {

				opcao = scanner.nextInt();
	
				switch (opcao) {
	
				case 1:
					System.out.print("Digite o nome do pais: ");
					scanner.nextLine();
					String nome = scanner.nextLine();
					System.out.print("Digite a capital do pais " + nome + ": ");
					String capital = scanner.nextLine();
					paisController.adicionarPais(nome, capital);
					break;
				case 2:
					paisController.exibirListaDePaises();
					break;
				case 3:
					System.out.println("Digite o nome do pais a ser removido: ");
					scanner.nextLine();
					String nomePaisRemover = scanner.nextLine();
					paisController.removerPais(nomePaisRemover);
					break;
				case 4:
					paisController.limparListaDePaises();
					break;
				case 5:
					paisController.primeiro();
					break;
				case 6:
					paisController.terceiro();
					break;
				case 7:
					paisController.quarto();
					break;
				case 8:
					paisController.testaConexao();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao invalida.");
					break;
				}
			} 
			
			catch (java.util.InputMismatchException e) {
				System.out.println("Opcao invalida. Por favor, digite um numero inteiro valido.");
                scanner.nextLine(); 
			}
		}
	}
}
