package br.com.aluno.paulo.testes;

import javax.persistence.*;

import br.com.aluno.paulo.entidade.Aluno;

public class Main {
	
	public static void main (String[] args){
		
		try{
			
			EntityManager em = Persistence.createEntityManagerFactory("br.com.aluno").createEntityManager();
			
			em.getTransaction().begin();
			
				Aluno aluno = new Aluno();
				
				aluno.setNome("Paulo");
				aluno.setCPF("098.348.886-00");
				aluno.setEmail("paulo@aluno.com.br");
				
				//em.persist(arg0);
				em.merge(aluno);
			
			em.getTransaction().commit();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
