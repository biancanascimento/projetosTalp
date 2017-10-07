import java.util.List;

import javax.persistence.Query;


public class PredioDAO extends AbstractCrudDAO<Predio>{
	public List<Predio> listarPorOrdemQtElevadores(){
		Query query = getEntityManager().createQuery("select p from Predio p order by p.qtElevadores desc"); 
		return query.getResultList();
	}
	
	public List<String> listarBlocosDoCondominio(Condominio condominio){
		Query query = getEntityManager().createQuery("select p.nomeBloco from Predio p where p.condominio = :condominioBuscado");
		query.setParameter("condominioBuscado", condominio);
		return query.getResultList();
	}
	public List<String> listarBlocosPorNomeDoCondominio(String nomeCondominio){
		Query query = getEntityManager().createQuery("select p.nomeBloco from Predio p where p.condominio.nome = :nomeDoCondominio");
		query.setParameter("nomeDoCondominio", nomeCondominio);
		return query.getResultList();
	}
}
