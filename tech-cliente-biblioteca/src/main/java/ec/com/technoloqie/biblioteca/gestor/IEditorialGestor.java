package ec.com.technoloqie.biblioteca.gestor;

import java.util.Collection;

import ec.com.technoloqie.biblioteca.exception.BibliotecaException;
import ec.com.technoloqie.biblioteca.modelo.dto.EditorialDTO;

/**
 * Interfaz para la gesti&oacute;n (CRUD) del Editorial 
 * @author root
 *
 */
public interface IEditorialGestor {
	
	/**
	 * Utilizado para guardar en la tabla datos Editorial
	 * @param editorial
	 * @throws BibliotecaException
	 */
	void crearEditorial(EditorialDTO editorial) throws BibliotecaException;
	
	/**
	 * Utilizado para actualizar un registro en la tabla datos Editorial
	 * @param editorial
	 * @return
	 * @throws BibliotecaException
	 */
	EditorialDTO actualizarEditorial(EditorialDTO editorial) throws BibliotecaException;
	
	/**
	 * Utilizado para eliminar en la tabla datos Editorial
	 * @param editorial
	 * @throws BibliotecaException
	 */
	void eliminarEditorial(EditorialDTO editorial) throws BibliotecaException;
	//EditorialDTO buscarEditorialId(Integer codigo) throws BibliotecaException;
	/**
	 * Utilizado para buscar en la tabla datos Editorial
	 * @return
	 * @throws BibliotecaException
	 */
	Collection<EditorialDTO> buscarEditoriales() throws BibliotecaException;

}
