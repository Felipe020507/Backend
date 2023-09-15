package view;

import java.util.List;

import model.Gestao;


public class Gestaoview {

	public void exibirListadeContato(List<Gestao> gestoes) {
		System.out.println("Lista de Contatos: ");	
		System.out.println("--------------------");
		
		for (Gestao gesto : gestoes) {
            System.out.println("Id: " + gesto.getId() + 
            				   " - nome: " + gesto.getNome() +
            				   "Email" + gesto.getEmail() +
            				   "Telefone" + gesto.getTelefone());
        }
        
        System.out.println("--------------------");
		}
	
	public void removerContato(boolean contatoremovido) {
		if (contatoremovido) {
        	System.out.println("Pais removido com sucesso!\n");
        } else {
        	System.out.println("Pais nao encontrado na lista.\n");
        }
	}
	
	
	
	}

