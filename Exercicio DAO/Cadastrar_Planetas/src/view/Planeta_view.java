package view;

import java.util.List;
import model.Planeta;

public class Planeta_view {
	
	public void mostrarPlanetas(List<Planeta>planetas) {
		System.out.println("Lista de Planetas: ");
		
		for(Planeta planeta: planetas) {
			System.out.println(planeta.getNome());
		}
	}

}
