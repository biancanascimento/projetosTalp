package br.ucb.condominio.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.ucb.condominio.enuns.TipoComodo;

@Entity
public class Comodo {
	@Id
	@GeneratedValue

	private Long Id;

	@ManyToOne
	private Apartamento apartamento;

	@Enumerated(EnumType.STRING)
	private TipoComodo tipoComodo;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
