package dao;

import java.util.ArrayList;
import java.util.List;
import model.Planeta;

public class Planeta_dao {

	private List<Planeta> planetas = new ArrayList<>();
	
	public void adiciona(Planeta planeta) {
		planetas.add(planeta);
	}
	
	public List<Planeta> lista() {
	    return new ArrayList<>(planetas);
	}
}
