package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private String operadora;
	private String tipoDoPlano;
	
	// Métodos de acesso
	public void setOperadora(String operadora) {
		// Atributo = variável /mesmo nome
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}
	
	public String getTipoDoPlano() {
		return this.tipoDoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano;
	}
	
}
