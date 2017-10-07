import java.sql.SQLException;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		try {

			AlunoDAO alunoDAO = new AlunoDAO();

			/*
			 * Aluno alunaMaria = new Aluno(); alunaMaria.setNome("Maria");
			 * alunaMaria.setMatricula("UC00000001");
			 * 
			 * String sql = "insert into aluno (nome,matricula) values (" +
			 * "'"+alunaMaria.getNome()+"', " +
			 * "'"+alunaMaria.getMatricula()+"')";
			 * 
			 * Statement stat = conexao.createStatement(); stat.execute(sql);
			 */

			Aluno alunaRaquel = new Aluno();
			alunaRaquel.setNome("Raquel");
			alunaRaquel.setMatricula("UC00000002");

			alunoDAO.salvar(alunaRaquel);

			List<Aluno> alunos = alunoDAO.listarAlunos();

			System.out.println("Lista de alunos cadastrados:");
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Matricula: " + aluno.getMatricula());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
