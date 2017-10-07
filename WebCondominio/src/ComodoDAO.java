import java.util.List;

import javax.persistence.Query;


public class ComodoDAO extends AbstractCrudDAO<Comodo>{
	public List<Comodo> listarComodosPorNumApto(int numeroApto){
		Query query = getEntityManager().createQuery("select c from Comodo c where c.apartamento.numero = :numeroApto ");
		query.setParameter("numeroApto", numeroApto);
		return query.getResultList();
	}
}
