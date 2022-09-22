package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um plano de saúde
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed"); 
		plano1.setTipoDoPlano("Prata"); 
		
		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Bradesco");
		plano2.setTipoDoPlano("Ouro");
		
		PlanoDeSaude plano3 = new PlanoDeSaude("Amil");
		
		
		// Criar um endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elton Silva");
		endereco.setNumero("905");
		endereco.setCidade("Jandira");
		endereco.setBairro("Centro");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setTipo("");
		endereco.setComplemento("Instituição de ensino");
		endereco.setPontoDeReferencia("Em frente a prefeitura");
		endereco.setCep("06600-025");
		
		// Criar um paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Patrícia dos Santos");
		paciente.setEmail("pat@uol.com.br");
		paciente.setCpf("123.456.789-00");
		paciente.setRg("123.456-99");
		paciente.setTelefone("(11)98745-6523");
		paciente.setTipoSanguineo("O+");
		paciente.setGenero(Genero.FEMININO);
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(plano1);
		
		// Criar uma especialidade médica
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínica Geral");
		
		// Criar um médico
		Medico medico1 = new Medico();
		medico1.setNome("Marcos Pereira");
		medico1.setCrm("4562-9");
		medico1.setSexo("Masculino");
		medico1.setDataDeNascimento(LocalDate.of(1990, 6, 8)); //08/06/1990
		
		// Criar a lista de especialidades do Dr. Marcos (vetor 
		Especialidade[] especialidadesMedico1 = {especialidade1, especialidade3};
		
		medico1.setEspecialidades(especialidadesMedico1);
		
		// Criar outro médico
		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setCrm("3214-5");
		medico2.setSexo("Feminino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 11, 27)); //27/11/1984
		
		Especialidade[] especialidadeMedico2 = {especialidade2};
		
		medico2.setEspecialidades(especialidadeMedico2);
		
		
		// Criar uma agenda
		// A paciente Patrícia ligou na clínica para agendar uma consulta 
		// com um clínico geral para 22/09/2022 ás 14h20
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 20));
		agenda1.setObservacoes("Nada a observar");
		agenda1.setCompareceu(false);
		
		// Imprimir dados do agendamento
		// Nome do paciente:
		// Nome do médico:
		// Especialidade:
		// Dia e hora da consulta:
		// Plano de saúde:
		
		System.out.println("Nome do paciente:" + agenda1.getPaciente().getNome());
		System.out.println("Nome do médico:" + agenda1.getMedico().getNome());
		System.out.println("Especialidade:" + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e hora:" + agenda1.getDataDaConsulta() + " - " + agenda1.getHoraDaConsulta());
		System.out.println("Plano de saúde:" + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());
	}
	
		
}
