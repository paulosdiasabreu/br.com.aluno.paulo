package br.com.aluno.paulo.entidade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Boleto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoBoleto;
	
	@NotNull(message="Informe o Valor")
	private Double valor;
	
	@Temporal(value=TemporalType.DATE)
	@NotNull(message="Informe a data de vencimento")
	private Date vencimento;
	
	
	private Double valorPago;
	
	@Temporal(value=TemporalType.DATE)
	private Date dataPagamento;
	
	@ManyToOne
	@JoinColumn(name="matricula")
	@NotNull(message="Informe a matricula do aluno")
	private Aluno aluno;

	
	
	
	//Set's e Get's
	public Integer getCodigoBoleto() {
		return codigoBoleto;
	}

	public Double getValor() {
		return valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setCodigoBoleto(Integer codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
