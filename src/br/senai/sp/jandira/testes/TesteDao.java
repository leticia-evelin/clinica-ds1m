package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

	public static void main(String[] args) {
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		PlanoDeSaude plano5 = new PlanoDeSaude();
		
		System.out.println(PlanoDeSaude.getContador());
		
		System.out.println(plano1.getCodigo());
		System.out.println(plano5.getCodigo());
		
		PlanoDeSaudeDAO.gravar(plano1);
		PlanoDeSaudeDAO.gravar(plano2);
		PlanoDeSaudeDAO.gravar(plano3);
		PlanoDeSaudeDAO.gravar(plano4);
		
		
		for(PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Operadora: " + p.getOperadora());
			System.out.println("-----------------------");
			
		}
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//	     
//		for(PlanoDeSaude plano : dao.listarTodos()){
//		System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
//		
//		System.out.println("-------------------------");
//		for(PlanoDeSaude plano : dao.listarTodos()){
//			System.out.println(plano.getOperadora());
		//}
		
		
		
		
	}
	
}
