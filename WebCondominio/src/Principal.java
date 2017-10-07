import java.util.Arrays;


public class Principal {
	public static void main(String[] args) {
		CondominioDAO condDAO = new CondominioDAO();
		PredioDAO predioDAO = new PredioDAO();
		ApartamentoDAO apDAO = new ApartamentoDAO();
		ComodoDAO comodoDAO = new ComodoDAO();
		
		Condominio condominio = new Condominio();
		condominio.setCnpj("2131321");
		condominio.setNome("Octogonal AOS 4");
		//condominio.setPredios();
		
		
		condDAO.salvar(condominio);
		
		Condominio c = condDAO.consultar(1L);
		
		Predio predio = new Predio();
		predio.setCondominio(condominio);
		predio.setNomeBloco("D");
		predio.setQtAndares(6);
		predio.setQtElevadores(3);
		predio.setCondominio(c);
		
		Predio predio2 = new Predio();
		predio2.setCondominio(condominio);
		predio2.setNomeBloco("D");
		predio2.setQtAndares(6);
		predio2.setQtElevadores(3);
		predio2.setCondominio(c);

		Predio predio3 = new Predio();
		predio3.setCondominio(condominio);
		predio3.setNomeBloco("D");
		predio3.setQtAndares(6);
		predio3.setQtElevadores(3);
		predio3.setCondominio(c);
		
		predioDAO.salvar(predio);
		predioDAO.salvar(predio2);
		predioDAO.salvar(predio3);
		
		c.setPredios(Arrays.asList(predio ,predio2, predio3));
		condDAO.atualizar(c);// deu erro pq n teve Cascade
			
	}
}
