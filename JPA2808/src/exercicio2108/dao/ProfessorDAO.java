package exercicio2108.dao;

import java.util.List;

import javax.persistence.Query;

import exercicio2108.Professor;
import exercicio2108.enums.EspecializacaoProfessor;

public class ProfessorDAO extends AbstractCrudDAO<Professor>{
	public List<Professor> listarPosGraduados(){
		Query query = getEntityManager().createQuery("select p from Professor p where p.especializacao = :especProfessor");
		query.setParameter("especProfessor", EspecializacaoProfessor.POS);
		return query.getResultList();
	}
}
