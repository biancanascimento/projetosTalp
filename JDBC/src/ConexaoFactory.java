import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFactory {
	public static Connection getConnection() throws SQLException{
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/tap", "root", "");
		return conexao;
	}
}
