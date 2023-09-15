package dao;

import java.util.ArrayList;
import java.util.List;
import model.Lojinha;


public class Loja_dao {
	
	private List<Lojinha> lojas = new ArrayList();

	public void adiciona(Lojinha produto) {
		lojas.add(produto);
	}
	
	public void adiciona1(Lojinha preco) {
		lojas.add(preco);
	}
	
	
	public List<Lojinha>lista(){
		return new ArrayList<>(lojas);
	}
	
	
}
