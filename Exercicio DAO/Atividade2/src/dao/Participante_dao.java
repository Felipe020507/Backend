package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Participante;


public class Participante_dao {
    private List<Participante> participantes = new ArrayList<>();

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public List<Participante> listarParticipantesOrdenadosAlfabeticamente() {
        List<Participante> listaOrdenada = new ArrayList<>(participantes);
        Collections.sort(listaOrdenada, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        return listaOrdenada;
    }

    public List<Participante> listarHomensMaioresDe18ComImcMaiorQue27() {
        List<Participante> resultado = new ArrayList<>();
        for (Participante participante : participantes) {
            if (participante.getSexo().equalsIgnoreCase("Masculino") && participante.getIdade() > 18 && participante.getImc() > 27) {
                resultado.add(participante);
            }
        }
        return resultado;
    }

    public List<Participante> listarParticipantesPorMaiorImc() {
        List<Participante> listaOrdenada = new ArrayList<>(participantes);
        Collections.sort(listaOrdenada, (p1, p2) -> Double.compare(p2.getImc(), p1.getImc()));
        return listaOrdenada;
    }

    public Participante buscarParticipantePorNome(String nome) {
        for (Participante participante : participantes) {
            if (participante.getNome().equalsIgnoreCase(nome)) {
                return participante;
            }
        }
        return null;
    }

    public double calcularMaiorImc() {
        double maiorImc = Double.MIN_VALUE;
        for (Participante participante : participantes) {
            if (participante.getImc() > maiorImc) {
                maiorImc = participante.getImc();
            }
        }
        return maiorImc;
    }

    public double calcularMenorImc() {
        double menorImc = Double.MAX_VALUE;
        for (Participante participante : participantes) {
            if (participante.getImc() < menorImc) {
                menorImc = participante.getImc();
            }
        }
        return menorImc;
    }

    public int calcularIdadeMaisVelha() {
        int idadeMaisVelha = Integer.MIN_VALUE;
        for (Participante participante : participantes) {
            if (participante.getIdade() > idadeMaisVelha) {
                idadeMaisVelha = participante.getIdade();
            }
        }
        return idadeMaisVelha;
    }

    public int calcularIdadeMaisNova() {
        int idadeMaisNova = Integer.MAX_VALUE;
        for (Participante participante : participantes) {
            if (participante.getIdade() < idadeMaisNova) {
                idadeMaisNova = participante.getIdade();
            }
        }
        return idadeMaisNova;
    }

    public double calcularMediaIdadeMulheres() {
        int totalMulheres = 0;
        int somaIdadesMulheres = 0;
        for (Participante participante : participantes) {
            if (participante.getSexo().equalsIgnoreCase("Feminino")) {
                totalMulheres++;
                somaIdadesMulheres += participante.getIdade();
            }
        }
        return totalMulheres > 0 ? (double) somaIdadesMulheres / totalMulheres : 0;
    }

    public double calcularMediaIdadeHomens() {
        int totalHomens = 0;
        int somaIdadesHomens = 0;
        for (Participante participante : participantes) {
            if (participante.getSexo().equalsIgnoreCase("Masculino")) {
                totalHomens++;
                somaIdadesHomens += participante.getIdade();
            }
        }
        return totalHomens > 0 ? (double) somaIdadesHomens / totalHomens : 0;
    }
    
}
