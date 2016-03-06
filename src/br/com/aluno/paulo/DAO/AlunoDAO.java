package br.com.aluno.paulo.DAO;

//import java.util.List;
import br.com.aluno.paulo.entidade.*;
//import javax.persistence.*;
import javax.ejb.*;

@Stateless
public class AlunoDAO extends GenericoDAO<Aluno>{
	
	public AlunoDAO(){
		super(Aluno.class);
	}
	
	

}
