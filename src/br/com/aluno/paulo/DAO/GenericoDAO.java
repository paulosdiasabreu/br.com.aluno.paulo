package br.com.aluno.paulo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
//import br.com.aluno.paulo.entidade.*;

public class GenericoDAO<T> {
	
	@PersistenceContext
	private EntityManager em;
	
	private Class<T> classe;
	
	public GenericoDAO(Class<T> classe){
		this.classe = classe;
	}
	
	public String salvar(T entidade){
		
		try{
			em.merge(entidade);
			//merge realiza o comando de insert ou update
		}catch(Exception ex){
			return "Ocorreu o erro"+ex.getMessage();
		}
		
		return null;
	}
	
	public T consultar(Serializable id){
		T entidade = em.find(classe, id);
		
		return entidade;
	}
	
	public List<T> consultarTodos(){
		TypedQuery<T> query = em.createQuery("select x from "+ classe.getSimpleName() +" as x", classe);
		
		return query.getResultList();
	}
	
	public String excluir(Serializable id){
		try{
			
			T entidade = consultar(id);
			em.remove(entidade);
			
		}catch(Exception ex){
			return "Erro ao excluir: "+ex.getMessage();
		}
		
		return null;
	}
	
	

}
