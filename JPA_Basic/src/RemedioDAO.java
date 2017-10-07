import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings(value="unchecked")
public class RemedioDAO {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit-provider");
		EntityManager manager = factory.createEntityManager();
		
		//-------------cria
		Remedio r = new Remedio();
		r.setDescricao("Rivotril");
		r.setDataValidade(new Date());
		r.setTarja(Tarja.PRETA);
		
//		salvar(manager, r);
		
		//------------------atualiza
//		r.setId(Long.valueOf(6));
//		r.setDescricao("Rivotril alterado");
		
//		atualizar(manager, r);
		
		
		//remover
//		remover(manager, Long.valueOf(5));
		
		
		//--------------consulta
//		Remedio xRivotril = consultar(manager, Long.valueOf(1));
//		System.out.println(xRivotril.getDescricao());
		
		
		//--------------listar
		System.out.println("Lista de remedios:");
		List<Remedio> remedios = listar(manager);
		for (Remedio remedio : remedios) {
			System.out.println(remedio.getDescricao());
		}
		
	}

	private static List<Remedio> listar(EntityManager manager) {
		List<Remedio> remedios = new ArrayList<>();
		String sql = "from Remedio";
		remedios = manager.createQuery(sql).getResultList();
		return remedios;
	}

//	private static Remedio consultar(EntityManager manager, Long id) {
//		Remedio r = null;
//		r = manager.find(Remedio.class, id);
//		return r;
//	}

//	private static void atualizar(EntityManager manager, Remedio r) {
//		manager.getTransaction().begin();
//		manager.merge(r);
//		System.out.println("id atualizado: "+r.getId());
//		manager.getTransaction().commit();
//	}
	
//	private static void remover(EntityManager manager, Long id) {
//		Remedio r = null;
//		manager.getTransaction().begin();
//		r = manager.find(Remedio.class, id);
//		manager.remove(r);
//		manager.getTransaction().commit();
//	}

//	private static void salvar(EntityManager manager, Remedio r) {
	//	manager.getTransaction().begin();
	//	manager.persist(r);
	//	manager.getTransaction().commit();
//	}

	}
