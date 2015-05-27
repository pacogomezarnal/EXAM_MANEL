package Vista;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Cadete;
import Modelo.ModCad;

public class Principal extends JFrame {

	private JPanel contentPane;
	private ModCad mc;
	private VUsuario vu;
	private VEquipo ve;
	private VComprobacion vc;
	private static Principal p;

/**
 * Clase JFrame
 */
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		setVisible(true);
		creaPanels();
		p = this;
	}
	
	public void creaPanels(){
		mc = new ModCad();
		vu = new VUsuario(mc);
		ve = new VEquipo(mc);
		vc = new VComprobacion();
		contentPane.add(vu, "Usuario");
		contentPane.add(ve, "Equipo");
		contentPane.add(vc,"Comprobacion");
		
	}
	
	public void showUsuario(){
		CardLayout cl = (CardLayout) contentPane.getLayout();
		cl.show(contentPane, "Usuario");
}
	public void showEquipo(Cadete c){
		CardLayout cl = (CardLayout) contentPane.getLayout();
		ve.setText(c);
		cl.show(contentPane, "Equipo");
}
	public void showComp(){
		CardLayout cl = (CardLayout) contentPane.getLayout();
		cl.show(contentPane, "Comprobacion");
}
	
public static Principal getPrincipal(){
	return p;
}
	
	public ModCad getMC(){
	
		return mc;
	}

}
