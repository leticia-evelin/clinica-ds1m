package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;

public class TesteDaoAbc {

	public static void main(String[] args) {
	 
		TesteDao.main(args);
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		System.out.println(PlanoDeSaudeDAO.listarTodos().size());

	}

}
