package ec.com.technoloqie.biblioteca.servicio;

import java.util.Collection;

import ec.com.technoloqie.biblioteca.exception.BibliotecaException;
import ec.com.technoloqie.biblioteca.modelo.dto.EditorialDTO;

/**
 * Implementa los servicios de la entidad editorial
 * @author root
 *
 */
public interface IEditorialServicio {
	
	void crearEditorial(EditorialDTO editorial) throws BibliotecaException;
	EditorialDTO actualizarEditorial(EditorialDTO editorial) throws BibliotecaException;
	void eliminarEditorial(EditorialDTO editorial) throws BibliotecaException;
	//EditorialDTO buscarEditorialId(Integer codigo) throws BibliotecaException;
	Collection<EditorialDTO> buscarEditoriales() throws BibliotecaException;

}
