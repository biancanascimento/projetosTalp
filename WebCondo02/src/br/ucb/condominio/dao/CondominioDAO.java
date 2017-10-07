package br.ucb.condominio.dao;

import java.util.List;

import javax.persistence.Query;

import br.ucb.condominio.entidade.Condominio;

public class CondominioDAO extends AbstractCrudDAO<Condominio>{
	public List<Condominio> listarCondominioOrdemAlfabetica(){
		Query query = getEntityManager().createQuery("select x from condominio x order by x.nome");
		return query.getResultList();
	}
}
