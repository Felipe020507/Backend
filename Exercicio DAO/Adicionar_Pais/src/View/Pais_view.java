package View;

import java.util.List;

import Model.Pais;

public class Pais_view {

	public void exibirListapais(List<Pais>paises) {
		System.out.println("======== Países ==========");
		System.out.println("==========================");
		
		for(Pais pais: paises) {
			System.out.println("País: " + pais.getNome() + "\nCapital: " + pais.getCapital());
		}
		
	}
}
