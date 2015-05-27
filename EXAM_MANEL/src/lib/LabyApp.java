package lib;

import Modelo.ConexionDB;
import Vista.Principal;
/**
 * Aquest és el codi font del programa anomenat LabyApp.jar, programa programat amb Java Swing, seguint un model de MVC, i és
 * entregat com a examen de final de primer curs de DAM el 27/05/2015 per Manel Andreu.
 * 
 * @author Manel Andreu
 *
 */
public class LabyApp {
/**
 * Classe que te el main i que per tant, serà la que ho executarà tot.
 * @param args String[]
 */
	public static void main(String[] args) {
		ConexionDB.getInstance();
		new Principal();
	}

}
