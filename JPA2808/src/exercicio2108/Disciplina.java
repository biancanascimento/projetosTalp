package exercicio2108;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import exercicio2108.enums.TipoAula;

//nome (texto)
//descricaoBreve (texto) coluna descricao_breve
//quantidadeDeHoras (numerico)
//quantidadeMaximaAlunos (numerico)
//tipoAula - Enum (LABORATORIO, SALA)


@Entity
@Table(name="disciplina")
public class Disciplina {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@Column(name="descricao_breve")
	private String descricaoBreve;
	
	@Column(name="qt_horas")
	private int qtHoras;
	
	@Column(name="qt_max_alunos")
	private int qtMaximaAlunos;
	
	@Enumerated(EnumType.STRING)
	private TipoAula tipoAula;

	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;
	
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

	public String getDescricaoBreve() {
		return descricaoBreve;
	}

	public void setDescricaoBreve(String descricaoBreve) {
		this.descricaoBreve = descricaoBreve;
	}

	public int getQtHoras() {
		return qtHoras;
	}

	public void setQtHoras(int qtHoras) {
		this.qtHoras = qtHoras;
	}

	public int getQtMaximaAlunos() {
		return qtMaximaAlunos;
	}

	public void setQtMaximaAlunos(int qtMaximaAlunos) {
		this.qtMaximaAlunos = qtMaximaAlunos;
	}

	public TipoAula getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(TipoAula tipoAula) {
		this.tipoAula = tipoAula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
