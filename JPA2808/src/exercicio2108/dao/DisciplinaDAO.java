package exercicio2108.dao;

import java.util.List;

import javax.persistence.Query;

import exercicio2108.Disciplina;
import exercicio2108.enums.TipoAula;

public class DisciplinaDAO extends AbstractCrudDAO<Disciplina>{
	public List<Disciplina> listarDisciplinasLaboratorio(){
//		Query query = getEntityManager()
//				.createNativeQuery("select * from disciplina d where d.tipoAula = ? order by d.nome");
//		query.setParameter(1, TipoAula.LABORATORIO.name());
		
		Query query = getEntityManager()
				.createQuery("select x from  Disciplina x where x.tipoAula = ? order by x.nome");
		query.setParameter(1, TipoAula.LABORATORIO);
		return query.getResultList();
	}
	
}
