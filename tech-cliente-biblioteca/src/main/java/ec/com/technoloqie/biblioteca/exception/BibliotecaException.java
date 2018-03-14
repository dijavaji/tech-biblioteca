package ec.com.technoloqie.biblioteca.exception;

/**
 * Clase para el tratamiento de los errores que pueden ocurrir en la ejecucion del codigo
 * @author root
 *
 */
@SuppressWarnings("serial")
public class BibliotecaException extends RuntimeException{
	
	public BibliotecaException() {
        super();
    }
    
	public BibliotecaException(String msg, Throwable nested) {
        super(msg, nested);
    }
    
	public BibliotecaException(String message) {
        super(message);
    }
    
	public BibliotecaException(Throwable nested) {
        super(nested);
    }

}
