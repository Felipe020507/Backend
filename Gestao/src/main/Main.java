package main;

import java.util.Scanner;
import controller.ContatoController;

public class Main {

	public static void main(String[] args) {
		ContatoController contatoController = new ContatoController();

	        Scanner lerDado = new Scanner(System.in);

	        int opcao = -1;

	        while (opcao != 0) {

	        	System.out.println("==== Menu ====");
	            System.out.println("1. Adicionar contato");
	            System.out.println("2. Exibir lista de contatos");
	            System.out.println("3. Buscar contato por ID");
	            System.out.println("4. Buscar contato por nome"); 
	            System.out.println("5. Atualizar contato");
	            System.out.println("6. Excluir contato");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");

	            try {

	                opcao = lerDado.nextInt();

	                switch (opcao) {

	                    case 1:
	                    	System.out.print("Digite o id do contato: ");
	                    	int id = lerDado.nextInt();
	                        System.out.print("Digite o nome do contato: ");
	                        String nome = lerDado.nextLine();
	                        System.out.print("Digite o email do contato: ");
	                        String email = lerDado.nextLine();
	                        System.out.print("Digite o telefone do contato: ");
	                        String telefone = lerDado.nextLine();
	                        contatoController.adicionarContato(id, nome, email, telefone);
	                        break;

	                    case 2:
	                        contatoController.exibirListaDeContatos();
	                        break;

	                    case 3:
	                        System.out.print("Digite o ID do contato a ser buscado: ");
	                        int idContato = lerDado.nextInt();
	                        contatoController.buscarContatoPorId(idContato);
	                        break;
	                        
	                    case 4:
	                        System.out.print("Digite o nome do contato a ser buscado: ");
	                        String nomeContato = lerDado.nextLine();
	                        contatoController.buscarContatoPorNome(nomeContato);
	                        break;
	                        
	                    case 5:
	                        System.out.print("Digite o ID do contato a ser atualizado: ");
	                        int idContatoAtualizar = lerDado.nextInt();
	                        System.out.print("Digite o nome do contato: ");
	                        lerDado.nextLine(); 
	                        String novoNome = lerDado.nextLine();
	                        System.out.print("Digite o email do contato: ");
	                        String novoEmail = lerDado.nextLine();
	                        System.out.print("Digite o telefone do contato: ");
	                        String novoTelefone = lerDado.nextLine();
	                        contatoController.atualizarContato(idContatoAtualizar, novoNome, novoEmail, novoTelefone);
	                        break;

	                    case 6:
	                        System.out.print("Digite o ID do contato a ser excluído: ");
	                        int idContatoExcluir = lerDado.nextInt();
	                        contatoController.excluirContato(idContatoExcluir);
	                        break;

	                    case 0:
	                        System.out.println("Saindo...");
	                        break;

	                    default:
	                        System.out.println("Opção inválida.");
	                        break;
	                }
	            } catch (java.util.InputMismatchException e) {
	                System.out.println("Opção inválida. Por favor, digite um número inteiro válido.");
	                lerDado.nextLine();
	            }
	        }
	    }
	}
