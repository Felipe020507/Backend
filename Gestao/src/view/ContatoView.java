package view;

import java.util.List;

import model.Contato;


public class ContatoView {

		public void exibirListaDeContatos(List<Contato> contatos) {
	        System.out.println("==== Lista de Contatos ====");
	        System.out.println("--------------------");
	        for (Contato contato : contatos) {
	            System.out.println("ID: " + contato.getId() +
	                               ", Nome: " + contato.getNome() +
	                               ", Email: " + contato.getEmail() +
	                               ", Telefone: " + contato.getTelefone());
	        }
	        System.out.println("--------------------");
	    }
	
		
		public void exibirContato(Contato contato) {
	        System.out.println("==== Detalhes do Contato ====");
	        System.out.println("ID: " + contato.getId());
	        System.out.println("Nome: " + contato.getNome());
	        System.out.println("Email: " + contato.getEmail());
	        System.out.println("Telefone: " + contato.getTelefone());
	        System.out.println("--------------------");
	    }
		  
		 
		 public void contatoNaoEncontrado() {
		        System.out.println("Contato não encontrado.");
		    }
		 
		 
		    public void contatoAtualizadoComSucesso() {
		        System.out.println("Contato atualizado com sucesso.");
		    }

		    public void contatoExcluidoComSucesso() {
		        System.out.println("Contato excluído com sucesso.");
		    }

		    public void exibirMensagem(String mensagem) {
		        System.out.println(mensagem);
		    }

	
	
	
	}

