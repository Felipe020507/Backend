package model;

public class Lojinha {
	private String nome;
	private double preco;
	
	/*Construtor*/
	
	public Lojinha(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	/* Metodo Gets */
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	
}
