package exercicio2;

public class DispositivoMovel {

	private Long id;
	private String modelo;
	private String marca;
	private String imei;
	private EnumDispositivoMovelPlataforma plataforma;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public EnumDispositivoMovelPlataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(EnumDispositivoMovelPlataforma plataforma) {
		this.plataforma = plataforma;
	}
}
