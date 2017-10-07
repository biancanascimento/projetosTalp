package exercicio2;

import java.util.List;

public class Principal {
	public static void main(String[] args) {
		DispositivoMovelDAO dao = new DispositivoMovelDAO();

		DispositivoMovel d1 = new DispositivoMovel();
		d1.setModelo("Galaxy Win");
		d1.setMarca("Samsung");
		d1.setImei("1231459987654");
		d1.setPlataforma(EnumDispositivoMovelPlataforma.ANDROID);

		DispositivoMovel d2 = new DispositivoMovel();
		d2.setModelo("iPhone 3GS");
		d2.setMarca("Apple");
		d2.setImei("1231455987654");
		d2.setPlataforma(EnumDispositivoMovelPlataforma.IOS);

		DispositivoMovel d3 = new DispositivoMovel();
		d3.setModelo("Lumia");
		d3.setMarca("Microsoft");
		d3.setImei("1531455987654");
		d3.setPlataforma(EnumDispositivoMovelPlataforma.WINDOWS);

		// INSERT
		dao.salvar(d1);
		dao.salvar(d2);
		dao.salvar(d3);

		System.out.println("Dispositivos salvos com sucesso!");

		// UPDATE
		// DispositivoMovel iphone = dao.consultar(new Long(2));
		// iphone.setModelo("iPhone 4");
		// dao.atualizar(iphone);
		//
		// System.out.println("Dispositivo atualizado com sucesso!");

		List<DispositivoMovel> dispositivos = dao.listar();
		for (DispositivoMovel dispositivoMovel : dispositivos) {
			System.out.println(dispositivoMovel.getMarca());
			System.out.println(dispositivoMovel.getModelo());
			System.out.println(dispositivoMovel.getImei());
			System.out.println(dispositivoMovel.getPlataforma().name());
		}

		dao.remover(new Long(2));

		dispositivos = dao.listar();
		for (DispositivoMovel dispositivoMovel : dispositivos) {
			System.out.println(dispositivoMovel.getMarca());
			System.out.println(dispositivoMovel.getModelo());
			System.out.println(dispositivoMovel.getImei());
			System.out.println(dispositivoMovel.getPlataforma().name());
		}

	}
}
