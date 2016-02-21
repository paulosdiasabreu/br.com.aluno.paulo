package br.com.aluno.paulo.entidade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idCurso;
	
	
	@NotNull(message="Informe o nome do curso")
	private String nomeCurso;
	
	@OneToMany(mappedBy = "curso")
	private List<Turma> turma;
	
	
	//Get's e Set's

	public Short getIdCurso() {
		return idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setIdCurso(Short idCurso) {
		this.idCurso = idCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}
	
	
}
