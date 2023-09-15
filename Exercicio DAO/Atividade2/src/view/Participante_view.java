package view;

import java.util.List;
import model.Participante;

public class Participante_view {
	public void mostrarListaParticipantes(List<Participante> participantes) {
        System.out.println("Lista de Participantes por Ordem Alfabética:");
        for (Participante participante : participantes) {
            System.out.println(participante.getNome());
        }
    }

    public void mostrarParticipante(Participante participante) {
        System.out.println("Dados do Participante:");
        System.out.println("Nome: " + participante.getNome());
        System.out.println("Idade: " + participante.getIdade());
        System.out.println("Sexo: " + participante.getSexo());
        System.out.println("Peso: " + participante.getPeso());
        System.out.println("Altura: " + participante.getAltura());
        System.out.println("IMC: " + participante.getImc());
    }

    public void mostrarEstatisticas(double maiorImc, double menorImc, int idadeMaisVelha, int idadeMaisNova, double mediaIdadeMulheres, double mediaIdadeHomens) {
        System.out.println("Estatísticas:");
        System.out.println("Maior IMC: " + maiorImc);
        System.out.println("Menor IMC: " + menorImc);
        System.out.println("Idade mais velha: " + idadeMaisVelha);
        System.out.println("Idade mais nova: " + idadeMaisNova);
        System.out.println("Média de Idade das Mulheres: " + mediaIdadeMulheres);
        System.out.println("Média de Idade dos Homens: " + mediaIdadeHomens);
    }
}

