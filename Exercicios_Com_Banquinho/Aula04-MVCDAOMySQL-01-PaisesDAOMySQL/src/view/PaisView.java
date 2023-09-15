package view;

import java.util.List;

import model.Pais;

public class PaisView {
    public void exibirListaDePaises(List<Pais> paises) {
        System.out.println("==== Lista de Paises ====");
        System.out.println("--------------------");
        for (Pais pais : paises) {
            System.out.println("Paises: " + pais.getNome() + 
            				   " - Capital: " + pais.getCapital());
        }
        
        System.out.println("--------------------");
    }
    
    public void removerPais(boolean paisRemovido) {
        if (paisRemovido) {
        	System.out.println("Pais removido com sucesso!\n");
        } else {
        	System.out.println("Pais nao encontrado na lista.\n");
        }
    }
    
    public void limparListaDePaises() {
        System.out.println("Lista de paises foi limpa!\n");
    }
    
    public void exibirPais(Pais pais) {
    	System.out.println("Pais: " + pais.getNome() + 
				   		   " - Capital: " + pais.getCapital());
    }
    
    public void exibirMensagem(String msg) {
    	System.out.println(msg);
    }
}
