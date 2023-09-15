package controller;

import java.util.List;

import dao.Participante_dao;
import view.Participante_view;
import model.Participante;

public class Partcipante_controller {

	private Participante_dao participanteDAO;
    private Participante_view view;

    public Partcipante_controller() {
        this.participanteDAO = new Participante_dao();
        this.view = new Participante_view();
    }

    public void adicionarParticipante(String nome, int idade, String sexo, double peso, double altura) {
        Participante participante = new Participante(nome, idade, sexo, peso, altura);
        participante.calcularImc();
        participanteDAO.adicionarParticipante(participante);
    }

    public List<Participante> listarParticipantesOrdenadosAlfabeticamente() {
        return participanteDAO.listarParticipantesOrdenadosAlfabeticamente();
    }

    public List<Participante> listarHomensMaioresDe18ComImcMaiorQue27() {
        return participanteDAO.listarHomensMaioresDe18ComImcMaiorQue27();
    }

    public List<Participante> listarParticipantesPorMaiorImc() {
        return participanteDAO.listarParticipantesPorMaiorImc();
    }

    public void exibirDadosCompletosDoParticipante(String nome) {
        Participante participante = participanteDAO.buscarParticipantePorNome(nome);
        view.mostrarParticipante(participante);
    }

    public void exibirEstatisticas() {
        double maiorImc = participanteDAO.calcularMaiorImc();
        double menorImc = participanteDAO.calcularMenorImc();
        int idadeMaisVelha = participanteDAO.calcularIdadeMaisVelha();
        int idadeMaisNova = participanteDAO.calcularIdadeMaisNova();
        double mediaIdadeMulheres = participanteDAO.calcularMediaIdadeMulheres();
        double mediaIdadeHomens = participanteDAO.calcularMediaIdadeHomens();
        view.mostrarEstatisticas(maiorImc, menorImc, idadeMaisVelha, idadeMaisNova, mediaIdadeMulheres, mediaIdadeHomens);
    }
    
    public Participante buscarParticipantePorNome(String nome) {
    	return  participanteDAO.buscarParticipantePorNome(nome);
    }
}
