import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LivroDAO {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setDescricao("Java como programar");
		livro.setNumeroPaginas(10000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nome_da_unidade_persistencia");
		EntityManager manager = emf.createEntityManager();
		
		
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
		
	}

}
