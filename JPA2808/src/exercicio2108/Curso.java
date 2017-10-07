package exercicio2108;

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

import exercicio2108.enums.AreaCurso;
import exercicio2108.enums.ModalidadeCurso;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@Column(name="codigo_curso")
	private int codigoCurso;
	
	@Enumerated(EnumType.STRING)
	private ModalidadeCurso modalidade;
	
	@Enumerated(EnumType.STRING)
	private AreaCurso area;
	
	@Column(name="quantidade_semestres")
	private int quantidadeSemestres;
	
	@OneToMany(mappedBy="curso", cascade=CascadeType.ALL)
	private List<Disciplina> disciplinas;

	
	public int getQuantidadeSemestres() {
		return quantidadeSemestres;
	}

	public void setQuantidadeSemestres(int quantidadeSemestres) {
		this.quantidadeSemestres = quantidadeSemestres;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public ModalidadeCurso getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeCurso modalidade) {
		this.modalidade = modalidade;
	}

	public AreaCurso getArea() {
		return area;
	}

	public void setArea(AreaCurso area) {
		this.area = area;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
