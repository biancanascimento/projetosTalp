import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comodo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Apartamento apartamento;
	
	@Enumerated(EnumType.STRING)
	private TipoComodo tipoComodo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public TipoComodo getTipoComodo() {
		return tipoComodo;
	}

	public void setTipoComodo(TipoComodo tipoComodo) {
		this.tipoComodo = tipoComodo;
	}
}
