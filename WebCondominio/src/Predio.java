import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Predio {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Condominio condominio;
	
	@Column(name="nome_bloco")
	private String nomeBloco;
	
	private int qtAndares;
	private int qtElevadores;
	
	@OneToMany(mappedBy="predio")
	private List<Apartamento> apartamentos;
	
	public int getQtAndares() {
		return qtAndares;
	}
	public void setQtAndares(int qtAndares) {
		this.qtAndares = qtAndares;
	}
	public int getQtElevadores() {
		return qtElevadores;
	}
	public void setQtElevadores(int qtElevadores) {
		this.qtElevadores = qtElevadores;
	}
	public String getNomeBloco() {
		return nomeBloco;
	}
	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}
	public Condominio getCondominio() {
		return condominio;
	}
	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}
	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
}
