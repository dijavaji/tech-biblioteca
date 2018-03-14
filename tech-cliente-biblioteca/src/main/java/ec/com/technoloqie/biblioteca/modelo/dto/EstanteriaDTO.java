package ec.com.technoloqie.biblioteca.modelo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="ESTANTERIA")
public class EstanteriaDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="ID_ESTANTERIA",nullable=false, unique=true)
	private Integer id;

	@Column(name="COMPARTIMENTO")
	private Integer compartimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompartimento() {
		return compartimento;
	}

	public void setCompartimento(Integer compartimento) {
		this.compartimento = compartimento;
	}

}
