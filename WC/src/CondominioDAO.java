import java.util.List;

import javax.persistence.Query;


public class CondominioDAO extends AbstractCrudDAO<Condominio>{
	public List<Condominio> listarCondominiosOrdemAlfabetica(){
		Query query = getEntityManager().createQuery("select x from Condominio x order by x.nome");
		return query.getResultList();
	}
}
