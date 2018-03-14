package ec.com.technoloqie.biblioteca.commons.factory;


/**
 * Factory para el proyecto de biblioteca
 * @author root
 *
 */
public class BibliotecaFactory {
	private static final BibliotecaFactory INSTANCIA = new BibliotecaFactory();
	//private static ApplicationContext context;
	
	public BibliotecaFactory(){
		try {
			//this.context = activateFactory();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
