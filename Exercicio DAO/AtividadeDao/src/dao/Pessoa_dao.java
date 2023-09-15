package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Pessoa;

public class Pessoa_dao {
	
	private List<Pessoa> pessoas = new ArrayList<>();

	
	public void adicionarParticipante(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
	
	public List<Pessoa> listarPorOrdemAlfabetica() {
        return pessoas.stream()
                .sorted((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()))
                .collect(Collectors.toList());
    }

    public List<Pessoa> listarHomensMaioresDe18ComIMCMaiorQue27() {
        return pessoas.stream()
                .filter(p -> p.getSexo() == 'M' && p.getIdade() > 18 && p.getImc() > 27)
                .collect(Collectors.toList());
    }

    public List<Pessoa> listarPorMaiorIMC() {
        return pessoas.stream()
                .sorted((p1, p2) -> Double.compare(p2.getImc(), p1.getImc()))
                .collect(Collectors.toList());
    }
	
    public Pessoa obterParticipanteComMaiorIMC() {
        Optional<Pessoa> maxIMC = pessoas.stream().max((p1, p2) -> Double.compare(p1.getImc(), p2.getImc()));
        return maxIMC.orElse(null);
    }
    
    public Pessoa obterParticipanteComMenorIMC() {
        Optional<Pessoa> minIMC = pessoas.stream().min((p1, p2) -> Double.compare(p1.getImc(), p2.getImc()));
        return minIMC.orElse(null);
    }
    
    public Pessoa obterPessoaMaisVelha() {
        Optional<Pessoa> maisVelho = pessoas.stream().max((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
        return maisVelho.orElse(null);
    }
    
    public Pessoa obterPessoaMaisNova() {
        Optional<Pessoa> maisNovo = pessoas.stream().min((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
        return maisNovo.orElse(null);
    }

    public double calcularMediaIdadeMulheres() {
        OptionalDouble mediaIdadeMulheres = pessoas.stream()
                .filter(p -> p.getSexo() == 'F')
                .mapToInt(Pessoa::getIdade)
                .average();
        return mediaIdadeMulheres.orElse(0.0);
    }

    public double calcularMediaIdadeHomens() {
        OptionalDouble mediaIdadeHomens = pessoas.stream()
                .filter(p -> p.getSexo() == 'M')
                .mapToInt(Pessoa::getIdade)
                .average();
        return mediaIdadeHomens.orElse(0.0);
    }
    


    
}
