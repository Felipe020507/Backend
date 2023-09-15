package controller;

import model.Lojinha;
import model.Lojinha;
import view.Loja_view;

import java.util.List;

import dao.Loja_dao;

public class Loja_controller {

	private Loja_dao lojaDAO = new Loja_dao();
	private Loja_view lojaView = new Loja_view();
	
	public void adicionaProduto(String nome, double produto) {
		Lojinha produto2 = new Lojinha(nome, produto);
	}
	
	public void mostraProduto() {
        List<Lojinha> produtos = lojaDAO.lista();
        lojaView.mostrarProdutos(produtos);
    }	 
	
}
