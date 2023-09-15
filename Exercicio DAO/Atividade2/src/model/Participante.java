package model;

public class Participante {
	private String nome;
	private int idade;
	private String sexo;
	private double peso;
	private double altura;
	private double imc;
	
	public Participante(String nome, int idade, String sexo ,double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calcularImc() {
	    this.imc = peso / (altura * altura);
	}
	
	
	/*
	 * Metodo Gets e Sets
	 */
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
		
	public double getImc() {
		return imc;
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
}
