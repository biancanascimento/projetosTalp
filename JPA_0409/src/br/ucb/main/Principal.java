package br.ucb.main;

import br.ucb.classes.Distribuidora;
import br.ucb.classes.Produto;
import br.ucb.classes.Vendedor;
import br.ucb.dao.DistribuidoraDAO;
import br.ucb.dao.ProdutoDAO;
import br.ucb.dao.VendedorDAO;
import br.ucb.enums.Categoria;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Atualizando a base de dados....");

		DistribuidoraDAO distribDao = new DistribuidoraDAO();
		VendedorDAO vendedorDao = new VendedorDAO();
		ProdutoDAO produtoDao = new ProdutoDAO();
		System.out.println("Base atualizada");

		Distribuidora distribXPTO = new Distribuidora();
		distribXPTO.setNomeFantasia("XPTO");
		distribXPTO.setDataInauguracao(21 / 10 / 2001);
		distribXPTO.setCategoria(Categoria.Casa);

		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Richard");
		vendedor.setIdade(33);
		// vendedor.setSalario(45454);
		vendedor.setDataAdmissao(24 / 8 / 2004);

		Produto produto = new Produto();
		produto.setDescricao("Lava tudo");
		produto.setCodigoBarras("010201000");
		// produto.setValor(5555);
		produto.setQtdeEstoque(85858);

		distribDao.salvar(distribXPTO);
		System.out.println("DistribXPTO salvo!!");

	}

}
