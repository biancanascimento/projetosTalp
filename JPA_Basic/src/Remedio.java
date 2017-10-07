import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Remedio {
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private Tarja tarja;
	
	@Temporal(TemporalType.DATE)
	private Date dataValidade;
	
	
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
	public Tarja getTarja() {
		return tarja;
	}
	public void setTarja(Tarja tarja) {
		this.tarja = tarja;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
