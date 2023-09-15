package controller;

import model.Planeta;
import view.Planeta_view;
import java.util.List;
import dao.Planeta_dao;


public class Planeta_controller {
	
	 private Planeta_dao planetaDAO = new Planeta_dao();
	 private Planeta_view planetaView = new Planeta_view();
	
	 public void cadastraPlaneta(String nome) {
		 Planeta planeta = new Planeta(nome);
		 planetaDAO.adiciona(planeta);
	 }
	 
	 public void mostrarPlanetas() {
	        List<Planeta> planetas = planetaDAO.lista();
	        planetaView.mostrarPlanetas(planetas);
	    }	 
		 
		 
	 }
	   

