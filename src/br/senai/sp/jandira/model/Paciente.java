package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
	
	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	private LocalDate dataDeNascimento;
	private String rg;
	private String cpf;
	private String telefone;
	private Genero genero;
	private String tipoSanguineo;
	private Endereco endereco;
	
	//Métodos de acesso getters e setteres
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	public void setLocalDate(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public LocalDate getLocalDate() {
		return dataDeNascimento;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	}

