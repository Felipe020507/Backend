package main;

import java.util.Scanner;
import controller.Planeta_controller;

public class Planeta_principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Planeta_controller controller = new Planeta_controller();

        
        while (true) {
            System.out.println("1 - Cadastrar Planeta");
            System.out.println("2 - Mostrar Planetas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            
            switch (opcao) {
            case 1:
                System.out.print("Digite o nome do planeta: ");
                String nome = scanner.nextLine();
                controller.cadastraPlaneta(nome);
                break;
            case 2:
                controller.mostrarPlanetas();
                break;
            case 3:
                System.out.println("Encerrando o aplicativo.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        
	}

}
}
