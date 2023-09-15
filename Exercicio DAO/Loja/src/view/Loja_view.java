package view;

import java.util.List;
import model.Lojinha;


public class Loja_view {

	public void mostrarProdutos(List<Lojinha>lojas) {
		System.out.println("Lista de produtos");
	
	for (Lojinha loja : lojas) {
		System.out.println(loja.getNome());
	}
	
	for(Lojinha preco : lojas) {
		System.out.println(preco.getPreco());
	}
}
}
