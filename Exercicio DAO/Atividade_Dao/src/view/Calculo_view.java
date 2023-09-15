package view;

import java.util.List;
import model.Calculo;


public class Calculo_view {
	public void exibir(List<Calculo>listacalculo) {
		System.out.println("====================");
		System.out.println("        Menu         ");
	
	
	for(Calculo participantes : listacalculo) {
		
		System.out.println("Numero Participantes: "+ participantes.getNumeroparticipantes());
		
	}
}
}
