package controller;

import dao.PaisDAO;
import exception.MenosDeQuatroItensException;
import model.Pais;
import view.PaisView;

import java.util.List;
import java.util.NoSuchElementException;

public class PaisController {

    private PaisDAO paisDAO;
    
    private PaisView paisView;

    public PaisController() {
        paisDAO = new PaisDAO();
        paisView = new PaisView();
    }

  
    public void adicionarPais(String nome, String capital) {
        
    	Pais pais = new Pais(nome, capital);
        
        paisDAO.adicionarPais(pais);
    }

    public void exibirListaDePaises() {
    	
        List<Pais> listaDePaises = paisDAO.obterListaDePaises();
        
        paisView.exibirListaDePaises(listaDePaises);
    }

    public void removerPais(String nomePaisRemover) {
  
    	boolean paisRemovido = false;

        for (Pais pais : paisDAO.obterListaDePaises()) {
        	
            if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
            	
            	paisDAO.removerPais(pais);
            	
            	paisRemovido = true;
                break;
            }
        }
        paisView.removerPais(paisRemovido);
    }

 
    public void limparListaDePaises() {
        paisDAO.limparListaDePaises();

        paisView.limparListaDePaises();
    }

    public void primeiro() {
        try {

            Pais primeiroPais = paisDAO.obterPrimeiroPais();
         
            if (primeiroPais == null) {
                throw new NoSuchElementException("A lista esta vazia. Nao e possivel pegar o primeiro elemento.");
            }
      
            paisView.exibirPais(primeiroPais);
        } 
      
        catch (NoSuchElementException e) {
        	paisView.exibirMensagem(e.getMessage());
        }
    }

    public void terceiro() {
        try {
            Pais terceiroPais = paisDAO.obterTerceiroPais();
            if (terceiroPais == null) {
                throw new NoSuchElementException("A lista nao contem pelo menos 3 elementos.");
            }
            paisView.exibirPais(terceiroPais);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public void quarto() {
        try {
            Pais quartoPais = paisDAO.obterQuartoPais();
            if (quartoPais == null) {
                throw new MenosDeQuatroItensException("A lista nao contem pelo menos 4 elementos.");
            }
            paisView.exibirPais(quartoPais);
        } catch (MenosDeQuatroItensException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void testaConexao() {
    	String msg;
    	
    	if (paisDAO.testaConexao()) {
    		msg = "Conexao com o banco de dados bem-sucedida.";
    	} else {
    		msg = "Nao foi possivel estabelecer conexao com o banco de dados.";
    	}
    	
    	paisView.exibirMensagem(msg);
    }
}