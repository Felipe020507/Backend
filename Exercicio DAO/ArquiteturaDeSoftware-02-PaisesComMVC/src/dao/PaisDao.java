package dao;

import java.util.ArrayList;
import java.util.List;
import model.Pais;

public class PaisDao {

	private List <Pais> listaDePaises;

	public PaisDao() {
		listaDePaises = new ArrayList<>();
	}

	public void adicionarPais(Pais pais) {
		listaDePaises.add(pais);
	}
	
	public List<Pais> exibirPaises() {
		return listaDePaises;
	}

	public void removerPais(Pais pais) {
		listaDePaises.remove(pais);
	}

	public void limparListaDePaises() {
		listaDePaises.clear();
	}

	

}
