import java.util.Scanner;
import controller.PaisController;

public class Main {
	public static void main(String[] args) {

		PaisController paisController = new PaisController();

		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar Pais");
			System.out.println("2. Exibir lista de Pais");
			System.out.println("3. Remover Pais da lista");
			System.out.println("4. Limpar lista");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opcao: ");

			try {
				opcao = scanner.nextInt();

				switch (opcao) {

				case 1:
					System.out.print("Digite o nome do Pais: ");
					scanner.nextLine();
					String nome = scanner.nextLine();

					System.out.print("Digite a capital do Pais " + nome + ": ");
					String capital = scanner.nextLine();

					paisController.adicionarPais(nome, capital);
					break;
				case 2:
					paisController.exibirListaDePaises();
					break;
				case 3:
					System.out.println("Digite o nome do Pais a ser removido: ");
					scanner.nextLine();

					String nomePaisRemover = scanner.nextLine();

					paisController.removerPais(nomePaisRemover);
					break;
				case 4:
					paisController.limparListaDePaises();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao Invalida.");
					break;
				}
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("Opcao Invalida. Por favor, digite um numero inteiro valido.");
				scanner.nextLine();
			}
		}
	}
}
