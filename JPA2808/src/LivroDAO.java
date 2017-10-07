import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LivroDAO {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setDescricao("Java como Programar PARA SER REMOVIDO");
		livro.setNumeroPaginas(10000);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nome_da_unidade_persistencia");
		EntityManager manager = emf.createEntityManager();

		///-------------CRIACAO
		salvar(livro, manager);
		
		//-------------CONSULTA
//		Livro x = consultar(Long.valueOf(1), manager);
//		System.out.println("O livro "+x.getDescricao()+" foi encontrado!");
//		
		//-------------ATUALIZACAO
//		x.setDescricao("Java Como Programar em 24hs");
//		atualizar(x, manager);
//		System.out.println("O livro "+x.getDescricao()+" foi atualizado!");
		
		//-------------EXCLUSAO
//		Livro aSerRemovido = consultar(Long.valueOf(2), manager);
//		remover(aSerRemovido, manager);
//		System.out.println("Livro removido");
		
	}
	private static Livro consultar(Long id, EntityManager manager){
		Livro livro = null;
		livro = manager.find(Livro.class, id);
		
		return livro;
	}
	
	private static void atualizar(Livro livro, EntityManager manager) {
		manager.getTransaction().begin();
		manager.merge(livro);
		manager.getTransaction().commit();
	}
	
	private static void remover(Livro livro, EntityManager manager) {
		manager.getTransaction().begin();
		manager.remove(livro);
		manager.getTransaction().commit();
	}

	private static void salvar(Livro livro, EntityManager manager) {
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
	}
}
