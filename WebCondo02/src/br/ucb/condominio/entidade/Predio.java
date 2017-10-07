package br.ucb.condominio.entidade;

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

	@Column(name = "nome_bloco")
	private String nomeBloco;

	private int qtdeAndares;
	private int qtdeElevadores;

	@OneToMany(mappedBy = "predio")
	private List<Apartamento> apartamentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}

	public String getNomeBloco() {
		return nomeBloco;
	}

	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}

	public int getQtdeAndares() {
		return qtdeAndares;
	}

	public void setQtdeAndares(int qtdeAndares) {
		this.qtdeAndares = qtdeAndares;
	}

	public int getQtdeElevadores() {
		return qtdeElevadores;
	}

	public void setQtdeElevadores(int qtdeElevadores) {
		this.qtdeElevadores = qtdeElevadores;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

}
