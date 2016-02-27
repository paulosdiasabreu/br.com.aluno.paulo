package br.com.aluno.paulo.DAO;

import java.util.List;

import javax.persistence.*;
import br.com.aluno.paulo.entidade.*;

public class AlunoDAO {
	
	private EntityManager em;
	
	public String salvarAluno(Aluno aluno){
		
		try{
			em.merge(aluno);
			//merge realiza o comando de insert ou update
		}catch(Exception ex){
			return "Ocorreu o erro"+ex.getMessage();
		}
		
		return null;
	}
	
	public Aluno consultarAluno(Integer matricula){
		Aluno a = em.find(Aluno.class, matricula);
		
		return a;
	}
	
	public List<Aluno> todosAlunos(){
		TypedQuery<Aluno> query = em.createQuery("select a from Aluno as a", Aluno.class);
		
		return query.getResultList();
	}
	
	public String excluirAluno(Integer matricula){
		try{
			
			Aluno aluno = consultarAluno(matricula);
			em.remove(aluno);
			
		}catch(Exception ex){
			return "Erro ao excluir: "+ex.getMessage();
		}
		
		return null;
	}
	
	

}
