package br.com.aluno.paulo.entidade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matricula;
	
	@NotNull(message="Informe o nome")
	private String nome;
	
	@NotNull(message="Informe o CPF")
	private String CPF;
	
	
	private String email;
	
	@OneToMany(mappedBy = "aluno")
	private List<Boleto> boletos;
	
	
	@ManyToMany
	@JoinTable(name="AlunoTurma",
		joinColumns = @JoinColumn(name="matricula"),
		inverseJoinColumns=@JoinColumn(name="idTurma"))
	private List<Turma> turmas;
	
	
	//Get's e Set's

	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getEmail() {
		return email;
	}

	public List<Boleto> getBoleto() {
		return boletos;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBoleto(List<Boleto> boletos) {
		this.boletos = boletos;
	}

	
	
	
	

}
