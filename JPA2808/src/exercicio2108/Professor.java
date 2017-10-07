package exercicio2108;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import exercicio2108.enums.EspecializacaoProfessor;

@Entity
@Table(name="professor")
public class Professor {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private EspecializacaoProfessor especializacao;
	
	private String matricula;

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

	public EspecializacaoProfessor getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(EspecializacaoProfessor especializacao) {
		this.especializacao = especializacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
