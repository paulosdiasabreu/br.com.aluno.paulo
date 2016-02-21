package br.com.aluno.paulo.entidade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idTurma;
	
	@NotNull(message="Informe o nome da turma")
	private String nomeTurma;
	
	@NotNull(message="Informe o curso")
	private Curso curso;
	
	@ManyToMany(mappedBy="turmas")
	private List<Aluno> alunos;
	
	@ManyToMany(mappedBy="turmas")
	private List<Horario> horarios;

	
	//Get's e Set's
	
	public Short getIdTurma() {
		return idTurma;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setIdTurma(Short idTurma) {
		this.idTurma = idTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
	

	
}
