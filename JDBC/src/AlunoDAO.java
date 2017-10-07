import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

	public void salvar(Aluno aluno) throws SQLException {
		String sql = "insert into aluno (nome, matricula) values (?, ?)";
		PreparedStatement preparedStmt = ConexaoFactory.getConnection().prepareStatement(sql);
		preparedStmt.setString(1, aluno.getNome());
		preparedStmt.setString(2, aluno.getMatricula());
		preparedStmt.execute();
	}

	public List<Aluno> listarAlunos() throws SQLException {
		String selectSql = "select * from aluno";
		PreparedStatement preparedStmtSelect = ConexaoFactory.getConnection().prepareStatement(selectSql);
		ResultSet resultSet = preparedStmtSelect.executeQuery();

		List<Aluno> alunos = new ArrayList<>();
		while (resultSet.next()) {
			Long id = resultSet.getLong("id");
			String nome = resultSet.getString("nome");
			String matricula = resultSet.getString("matricula");
			alunos.add(new Aluno(id, nome, matricula));
		}
		return alunos;
	}
}
