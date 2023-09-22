package controller;

import java.util.List;

import dao.ContatoDAO;
import model.Contato;
import view.ContatoView;

public class ContatoController {
	
	private ContatoDAO contatoDao;
    private ContatoView contatoview;

    
    public ContatoController() {
    	contatoDao = new ContatoDAO();
    	contatoview = new ContatoView();
    }
    
    public void adicionarContato(int id, String nome, String email, String telefone) {
        Contato contato = new Contato( id ,nome, email, telefone);
        contatoDao.inserirContato(contato);
    }
    
    
    public void exibirListaDeContatos() {
        List<Contato> listaDeContatos = contatoDao.listarContatos();
        contatoview.exibirListaDeContatos(listaDeContatos);
    }
    
    
    
    
    public void buscarContatoPorId(int id) {
        Contato contato = contatoDao.buscarContatoPorId(id);
        if (contato != null) {
            contatoview.exibirContato(contato);
        } else {
            contatoview.contatoNaoEncontrado();
        }
    }
    
    
    
    public void buscarContatoPorNome(String nome) {
        List<Contato> contatos = contatoDao.buscarContatoPorNome(nome);
        if (!contatos.isEmpty()) {
            contatoview.exibirListaDeContatos(contatos);
        } else {
            contatoview.contatoNaoEncontrado();
        }
    }
    
    
    
    public void atualizarContato(int id, String nome, String email, String telefone) {
        Contato contato = new Contato(id, nome, email, telefone);
        boolean atualizado = contatoDao.atualizarContato(contato);
        if (atualizado) {
            contatoview.contatoAtualizadoComSucesso();
        } else {
            contatoview.contatoNaoEncontrado();
        }
    }
    
    
    
   
    public void excluirContato(int id) {
        boolean excluido = contatoDao.excluirContato(id);
        if (excluido) {
            contatoview.contatoExcluidoComSucesso();
        } else {
            contatoview.contatoNaoEncontrado();
        }
    }
    
	
}
