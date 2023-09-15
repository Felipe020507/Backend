package main;

import java.util.List;
import view.Participante_view;
import controller.Partcipante_controller;
import model.Participante;

public class Participante_main {

	 public static void main(String[] args) {
	        Partcipante_controller controller = new Partcipante_controller();

	        controller.adicionarParticipante("Pedro", 25, "Masculino", 80.0, 2.75);
	        controller.adicionarParticipante("Valeria", 30, "Feminino", 45.0, 1.70);
	        controller.adicionarParticipante("Adan", 22, "Masculino", 90.0, 1.80);
	        controller.adicionarParticipante("Ettore", 36,"Masculino", 88.54, 1.82);
	        controller.adicionarParticipante("Bruno", 32, "Masculino", 86.0, 1.76);
	        controller.adicionarParticipante("Fred", 20, "Masculino", 98.4, 1.80);
	        
	        List<Participante> listaOrdenada = controller.listarParticipantesOrdenadosAlfabeticamente();
	        System.out.println("Participantes por Ordem Alfabética:");
	        for (Participante participante : listaOrdenada) {
	            System.out.println(participante.getNome());
	        }

	        List<Participante> homensComImcMaiorQue27 = controller.listarHomensMaioresDe18ComImcMaiorQue27();
	        System.out.println("\nHomens Maiores de 18 com IMC > 27:");
	        for (Participante participante : homensComImcMaiorQue27) {
	            System.out.println(participante.getNome());
	        }

	 
	        List<Participante> participantesPorMaiorImc = controller.listarParticipantesPorMaiorImc();
	        System.out.println("\nParticipantes por Maior IMC:");
	        for (Participante participante : participantesPorMaiorImc) {
	            System.out.println(participante.getNome() + " - IMC: " + participante.getImc());
	        }

	     
	        String nomeDoParticipante = "";
	        Participante participanteSelecionado = controller.buscarParticipantePorNome(nomeDoParticipante);;
	        if (participanteSelecionado != null) {
	            System.out.println("\nDados Completos do Participante " + nomeDoParticipante + ":");
	            new Participante_view().mostrarParticipante(participanteSelecionado);
	        } else {
	            System.out.println("\nParticipante não encontrado.");
	        }

	      
	        controller.exibirEstatisticas();
	    }
	}

