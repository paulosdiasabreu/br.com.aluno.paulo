package br.com.aluno.paulo.entidade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Horario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idHorario;
	
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@NotNull(message="Informe o horario aula")
	private Date horarioAula;
	
	@NotNull(message="Informe o dia da semana")
	private String diaSemana;
	
	@ManyToMany
	@JoinTable(name="TurmaHorario",
		joinColumns = @JoinColumn(name="idHorario"),
		inverseJoinColumns=@JoinColumn(name="idTurma"))
	private List<Turma> turmas;
	
	
	
	
	//Set's e Get's

	public Integer getIdHorario() {
		return idHorario;
	}

	public Date getHorarioAula() {
		return horarioAula;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public void setHorarioAula(Date horarioAula) {
		this.horarioAula = horarioAula;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	
	

}
