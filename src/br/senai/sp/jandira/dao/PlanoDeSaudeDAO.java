package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO { // Simular o banco de dados

	private PlanoDeSaude planoDeSaude;
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>(); // repositório de planos
	
	
	//Construtor
	public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
		this.planos.add(planoDeSaude);
	}
	
	public PlanoDeSaudeDAO() {
		
	}
	
	public static void gravar(PlanoDeSaude planoDeSaude) {
		planos.add(planoDeSaude);
		
	}
	
	public static ArrayList<PlanoDeSaude> listarTodos(){
		return planos;
	}
	
}
