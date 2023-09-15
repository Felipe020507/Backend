package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Pais;
import View.Pais_view;

public class Pais_controller {

	private List<Pais>listaPaises;
	private Pais_view paisview;
	
	public Pais_controller() {
		listaPaises = new ArrayList<>();
		paisview = new Pais_view();
	}
	
	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome,capital);
		listaPaises.add(pais);
	}
	
	public void exibirListaPaises() {
		paisview.exibirListapais(listaPaises);
	}
}
