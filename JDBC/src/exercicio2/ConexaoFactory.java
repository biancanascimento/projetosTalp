package exercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tap", "root", "");
		return conn;
	}
}
