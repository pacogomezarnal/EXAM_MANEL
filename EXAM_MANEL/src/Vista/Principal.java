package Vista;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.IngresoLaby;
import Modelo.ModCad;
/**
 * 
 * @author Manel Andreu
 *
 */
public class Principal extends JFrame {

	/**
	 * Clase JFrame, tamb� fa la funci� de controlador.
	 */

	private JPanel contentPane; // El CardLayout principal.
	private ModCad mc; // Model Cadete.
	private IngresoLaby il; // Ingreso Laby.
	private VUsuario vu; // La vista del JPanel Usuari.
	private VEquipo ve; // La vista del JPanel Equip.
	private VComprobacion vc; // La vista del JPanel Comprobaci�.
	private static Principal p; // La variable que vaig a utilitzar per a poder
								// accedir a la clase principal.

	/**
	 * Constructor de la clase principal, la seua funci� �s crear el JFrame,
	 * utilitzar el m�tod creaPanels() i inicialitzar la variable "p" a s�
	 * mateix.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 572); // Utilitzem unes mesures que sabem que
										// s'acoplaran a la mesura dels panells.
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0)); // Posem el CardLayout.
		setVisible(true);
		creaPanels();
		p = this;
	}

	/**
	 * M�tod que crea els panells que anem a utilitzar i els agrega al
	 * contentPane. La seua feina es crear els models de Model Cadet, Ingres
	 * Laby, i crear els panells de les vistes, a m�s de afegir-los al
	 * contentPane amb el seu identificador.
	 */
	public void creaPanels() {
		il = new IngresoLaby();
		mc = new ModCad();
		vu = new VUsuario(mc); //Li donem el model de Cadet, ja que el necesita.
		ve = new VEquipo(mc); //Li donem el model de Cadet, ja que el necesita.
		vc = new VComprobacion(il); //Li donem el model de Ingreso Laby, ja que el necesita.
		contentPane.add(vu, "Usuario");
		contentPane.add(ve, "Equipo");
		contentPane.add(vc, "Comprobacion");

	}

	/**
	 * M�tod que s'utilitza per a mostrar el panell de la vista Usuari.
	 */
	public void showUsuario() {
		CardLayout cl = (CardLayout) contentPane.getLayout();
		cl.show(contentPane, "Usuario");
	}

	/**
	 * M�tod que s'utilitza per a mostrar el panell de la vista Equip.
	 */
	public void showEquipo() {
		CardLayout cl = (CardLayout) contentPane.getLayout();
		cl.show(contentPane, "Equipo");
	}

	/**
	 * M�tod que s'utilitza per a mostrar el panell de la vista Comprobaci�.
	 */
	public void showComp() {
		CardLayout cl = (CardLayout) contentPane.getLayout();
		cl.show(contentPane, "Comprobacion");
	}

	/**
	 * M�tod que s'utilitza per a agafar el panell principal.
	 * 
	 * @return Principal
	 */
	public static Principal getPrincipal() {
		return p;
	}

}
