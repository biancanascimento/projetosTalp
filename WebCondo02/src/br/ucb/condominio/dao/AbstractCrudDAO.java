package br.ucb.condominio.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.ucb.condominio.entity.EntityManagerSingleton;

public abstract class AbstractCrudDAO<T> {
	private EntityManager em;
	private Class classeGenerica;
	public AbstractCrudDAO(){
		em = EntityManagerSingleton.getInstance();
		classeGenerica = (Class)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	public EntityManager getEntityManager(){
		return em;
	}
	
	public void salvar(T objeto){
		em.getTransaction().begin();
		em.persist(objeto);
		em.getTransaction().commit();
	}
	public void atualizar(T objeto){
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
	}
	public void remover(Long id){
		T objeto = (T)em.find(classeGenerica, id);
		em.getTransaction().begin();
		em.remove(objeto);
		em.getTransaction().commit();
	}
	public T consultar(Long id){
		return (T)em.find(classeGenerica, id);
	}
	public List<T> listar(){
		Query query = em.createQuery("select "+classeGenerica+"from...x");
		return (List)query.getResultList();
	}
}
