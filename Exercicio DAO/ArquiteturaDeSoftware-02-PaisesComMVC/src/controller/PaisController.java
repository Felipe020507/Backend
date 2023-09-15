package controller;

import java.util.List;

import dao.PaisDao;
import model.Pais;
import view.PaisView;

public class PaisController {

	private PaisDao paisDAO;

	private PaisView paisView;

	
	public PaisController() {
		paisDAO = new PaisDao();
		paisView = new PaisView();
	}
	

	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);
		paisDAO.adicionarPais(pais);
		;
	}
	
	

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(paisDAO.exibirPaises());
	}

	
	
	public void removerPais(String nomePaisRemover) {
		Pais paisRemover = null;

		for (Pais pais : paisDAO.exibirPaises()) {
			if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
				paisRemover = pais;
				break;
			}
		}

		if (paisRemover != null) {
			paisDAO.removerPais(paisRemover);
			paisView.removerPais(true);
			
		} else {
			paisView.removerPais(false);
		}
	}
	
	

	public void limparListaDePaises() {
		paisDAO.limparListaDePaises();
		paisView.limparListaDePaises();

	}

}
