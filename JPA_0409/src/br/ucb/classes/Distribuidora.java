package br.ucb.classes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.ucb.enums.Categoria;

@Entity
@Table(name = "distribuidora")
public class Distribuidora {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome_fantasia")
	private String nomeFantasia;

	@Column(name = "data")
	private Integer dataInauguracao;

	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	@OneToMany(mappedBy="distribuidora", cascade=CascadeType.ALL)
	private List<Vendedor> vendedores;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Integer getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(Integer dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
