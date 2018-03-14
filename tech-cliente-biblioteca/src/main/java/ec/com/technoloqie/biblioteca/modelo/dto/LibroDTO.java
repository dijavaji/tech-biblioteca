package ec.com.technoloqie.biblioteca.modelo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="LIBRO")	
public class LibroDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="ID_LIBRO",nullable=false, unique=true)
	private Integer id;

}
