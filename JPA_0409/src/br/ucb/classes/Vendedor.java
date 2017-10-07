package br.ucb.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="vendedor")
public class Vendedor {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Integer idade;
	
	private Double salario;
	
	@Column(name="data")
	private Integer dataAdmissao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Integer dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
}
