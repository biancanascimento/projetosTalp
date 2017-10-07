package br.ucb.condominio.dao;

import java.util.List;

import javax.persistence.Query;

import br.ucb.condominio.entidade.Predio;

public class PredioDAO extends AbstractCrudDAO<Predio> {
	public List<Predio> listarPorOrdemQtdeElevadores(){
		Query query = getEntityManager().createQuery("select p from Predio p order by p.qtdeElevadores desc");
		return query.getResultList();
	}
	
}
