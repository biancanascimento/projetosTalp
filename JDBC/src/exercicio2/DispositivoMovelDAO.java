package exercicio2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DispositivoMovelDAO {
	public void salvar(DispositivoMovel dispositivo){
		String sql = "insert into dispositivo_movel (modelo, marca, imei, plataforma) values (?, ?, ?, ?)";
		try {
			PreparedStatement ps = ConexaoFactory.getConnection().prepareStatement(sql);
			ps.setString(1, dispositivo.getModelo());
			ps.setString(2, dispositivo.getMarca());
			ps.setString(3, dispositivo.getImei());
			ps.setInt(4, dispositivo.getPlataforma().getCodigo());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void atualizar(DispositivoMovel dispositivo){
		String sql = "update dispositivo_movel set modelo=?, marca=?, imei=?, plataforma=? where id=?";
		try {
			PreparedStatement ps = ConexaoFactory.getConnection().prepareStatement(sql);
			ps.setString(1, dispositivo.getModelo());
			ps.setString(2, dispositivo.getMarca());
			ps.setString(3, dispositivo.getImei());
			ps.setInt(4, dispositivo.getPlataforma().getCodigo());
			ps.setLong(5, dispositivo.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void remover(Long id){
		String sql = "delete from dispositivo_movel where id=?";
		try {
			PreparedStatement ps = ConexaoFactory.getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public DispositivoMovel consultar(Long id){
		DispositivoMovel dispositivo = null;
		String sql = "select * from dispositivo_movel where id=?";
		try {
			PreparedStatement ps = ConexaoFactory.getConnection().prepareStatement(sql);
			ps.setLong(1,  id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dispositivo = new DispositivoMovel();
				dispositivo.setId(id);
				dispositivo.setMarca(rs.getString("marca"));
				dispositivo.setModelo(rs.getString("modelo"));
				dispositivo.setImei(rs.getString("imei"));
				dispositivo.setPlataforma(EnumDispositivoMovelPlataforma.getDispositivoPorCodigo(rs.getInt("plataforma")));;
				return dispositivo;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dispositivo;
	}
	public List<DispositivoMovel> listar(){
		List<DispositivoMovel> dispositivos = new ArrayList<>();

		String sql = "select * from dispositivo_movel";
		try {
			PreparedStatement ps = ConexaoFactory.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			DispositivoMovel dispositivo;
			while(rs.next()){
				dispositivo = new DispositivoMovel();
				dispositivo.setId(rs.getLong("id"));
				dispositivo.setMarca(rs.getString("marca"));
				dispositivo.setModelo(rs.getString("modelo"));
				dispositivo.setImei(rs.getString("imei"));
				dispositivo.setPlataforma(EnumDispositivoMovelPlataforma.getDispositivoPorCodigo(rs.getInt("plataforma")));;
				dispositivos.add(dispositivo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dispositivos;
	}
}
