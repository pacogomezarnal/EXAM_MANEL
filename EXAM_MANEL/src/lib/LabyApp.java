package lib;

import Modelo.ConexionDB;
import Vista.Principal;

public class LabyApp {

	public static void main(String[] args) {
		ConexionDB.getInstance();
		new Principal();
	}

}
