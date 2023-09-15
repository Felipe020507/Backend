package controller;

import model.Pessoa;

import java.util.List;

import dao.Pessoa_dao;

public class Pessoa_controller {

	private Pessoa_dao pessoaDAO;
	
	public Pessoa_controller() {
		pessoaDAO = new Pessoa_dao();
	}
	
	
	public void adicionarParticipante(Pessoa participante) {
        pessoaDAO.adicionarParticipante(participante);
    }
	
	
	public List<Pessoa> listarPorOrdemAlfabetica() {
        return pessoaDAO.listarPorOrdemAlfabetica();
    }

    public List <Pessoa> listarHomensMaioresDe18ComIMCMaiorQue27() {
        return pessoaDAO.listarHomensMaioresDe18ComIMCMaiorQue27();
    }

    public List<Pessoa> listarPorMaiorIMC() {
        return pessoaDAO.listarPorMaiorIMC();
    }
	
	 public Pessoa obterParticipanteComMaiorIMC() {
	        return pessoaDAO.obterParticipanteComMaiorIMC();
	    }

	    public Pessoa obterParticipanteComMenorIMC() {
	        return pessoaDAO.obterParticipanteComMenorIMC();
	    }

	    public Pessoa obterPessoaMaisVelha() {
	        return pessoaDAO.obterPessoaMaisVelha();
	    }

	    public Pessoa obterPessoaMaisNova() {
	        return pessoaDAO.obterPessoaMaisNova();
	    }

	    public double calcularMediaIdadeMulheres() {
	        return pessoaDAO.calcularMediaIdadeMulheres();
	    }

	    public double calcularMediaIdadeHomens() {
	        return pessoaDAO.calcularMediaIdadeHomens();
	    }
	    
	    public void iniciar() {
	        int opcao;
	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpar o buffer do scanner

	            switch (opcao) {
	                case 1:
	                    adicionarParticipante(null);
	                    break;
	                case 2:
	                    listarPorOrdemAlfabetica();
	                    break;
	                case 3:
	                    listarHomensMaioresDe18ComIMCMaiorQue27();
	                    break;
	                case 4:
	                    listarPorMaiorIMC();
	                    break;
	                case 5:
	                    listarPorOrdemAlfabetica();
	                    break;
	                case 6:
	                	obterParticipanteComMaiorIMC();
	                    break;
	                case 7:
	                	obterParticipanteComMenorIMC();
	                    break;
	                case 8:
	                    obterPessoaMaisVelha();
	                    break;
	                case 9:
	                    obterPessoaMaisNova();
	                    break;
	                case 10:
	                    calcularMediaIdadeMulheres();
	                    break;
	                case 11:
	                    calcularMediaIdadeHomens();
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        } while (opcao != 0);
	    }
}
