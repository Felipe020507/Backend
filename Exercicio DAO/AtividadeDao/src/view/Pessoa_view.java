package view;

import model.Pessoa;

public class Pessoa_view {

	private ParticipanteController controller;
    private Scanner scanner;

    public ParticipanteView(ParticipanteController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("====== Menu de Opções ======");
        System.out.println("1. Adicionar Participante");
        System.out.println("2. Calcular IMC");
        System.out.println("3. Listar todos os participantes por ordem alfabética");
        System.out.println("4. Listar participantes homens, maiores de 18 anos com IMC maior que 27");
        System.out.println("5. Listar participantes por maior IMC");
        System.out.println("6. Exibir dados completos de um participante");
        System.out.println("7. Exibir maior IMC");
        System.out.println("8. Exibir menor IMC");
        System.out.println("9. Exibir pessoa mais velha");
        System.out.println("10. Exibir pessoa mais nova");
        System.out.println("11. Exibir média de idade das mulheres");
        System.out.println("12. Exibir média de idade dos homens");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
