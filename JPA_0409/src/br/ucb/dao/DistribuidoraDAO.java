package br.ucb.dao;

import java.util.List;

import javax.persistence.Query;

import br.ucb.classes.Distribuidora;
import br.ucb.enums.Categoria;

public class DistribuidoraDAO extends AbstractCrudDAO<Distribuidora> {
	public List<Distribuidora> listarDistribuidora(){
		Query query = getEntityManager().createQuery("select p from Professor p where p.especializacao = :especProfessor");
		query.setParameter("distrib",Categoria.ProdutosAlimenticios);
		return query.getResultList();
	}

}
