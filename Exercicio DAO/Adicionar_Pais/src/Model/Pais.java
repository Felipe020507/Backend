package Model;

public class Pais {
String nome;
String capital;

//Construtor

public Pais (String nome, String capital) {
	this.capital = capital;
	this.nome = nome;
}

//Metodo Getts e Setts

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
}
