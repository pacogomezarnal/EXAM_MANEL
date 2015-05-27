package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Cadete;
import Modelo.ModCad;
/**
 * 
 * @author Manel Andreu
 *
 */
public class VUsuario extends JPanel {
	/**
	 * Classe que serà la vista de usuari.
	 */
	private JTextField txtNom;
	private JTextField txtId;
	private JTextField txtCog;
	private JTextField txtEd;
	private JTextField txtNac;
	private ModCad modc;
	private ArrayList<Cadete> cadete;
	private Cadete cad;

	/**
	 * Constructor de la classe.
	 */
	public VUsuario(ModCad mc) {
		modc = mc;
		cadete = modc.getCadetes();
		setVisible(true);
		setBounds(0,0,500,500);
		setLayout(null);
		
		JLabel imatge = new JLabel("");
		imatge.setBounds(10, 52, 130, 130);
		add(imatge);
		imatge.setIcon(new ImageIcon(VUsuario.class.getResource("/Imatges/img.jpg"))); //Li posem un ImageIcon com a imatge amb el mètod setIcon. Utilitzarem com a ruta el nostre propi codi, on tenim la imatge guardada.
		
		this.txtNom = new JTextField();
		this.txtNom.setEditable(false);
		this.txtNom.setBounds(206, 78, 165, 20);
		add(this.txtNom);
		this.txtNom.setColumns(10);
		
		this.txtId = new JTextField();
		this.txtId.setEditable(false);
		this.txtId.setText("");
		this.txtId.setBounds(381, 78, 109, 20);
		add(this.txtId);
		this.txtId.setColumns(10);
		
		this.txtCog = new JTextField();
		this.txtCog.setEditable(false);
		this.txtCog.setBounds(206, 162, 165, 20);
		add(this.txtCog);
		this.txtCog.setColumns(10);
		
		this.txtEd = new JTextField();
		this.txtEd.setEditable(false);
		this.txtEd.setBounds(206, 247, 165, 20);
		add(this.txtEd);
		this.txtEd.setColumns(10);
		
		this.txtNac = new JTextField();
		this.txtNac.setEditable(false);
		this.txtNac.setBounds(206, 331, 165, 20);
		add(this.txtNac);
		this.txtNac.setColumns(10);
		
		/**
		 * Creem el botó de següent.
		 */
		JButton btnSeg = new JButton("Seg\u00FCent >>");
		btnSeg.setBounds(331, 444, 159, 23);
		add(btnSeg);
		btnSeg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Principal.getPrincipal().showEquipo();
			}
		});
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(206, 53, 130, 14);
		add(lblNom);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(381, 53, 109, 14);
		add(lblId);
		
		JLabel lblCognoms = new JLabel("Cognoms");
		lblCognoms.setBounds(206, 137, 130, 14);
		add(lblCognoms);
		
		JLabel lblEdat = new JLabel("Edat");
		lblEdat.setBounds(206, 222, 130, 14);
		add(lblEdat);
		
		JLabel lblNacionalitat = new JLabel("Nacionalitat");
		lblNacionalitat.setBounds(206, 306, 130, 14);
		add(lblNacionalitat);
		
		setText(22);
	}
	/**
	 * Mètod que replena els JTextField segons el id del cadete que li donem.
	 * @param id int
	 */
	public void setText(int id){
		for(int i = 0; i<cadete.size();i++){
			if(cadete.get(i).getId()==id){
				this.cad = cadete.get(i);
				this.txtId.setText(cad.getId()+"");
				this.txtNom.setText(cad.getNombre());
				this.txtCog.setText(cad.getApellidos());
				this.txtEd.setText(cad.getEdad()+"");
				this.txtNac.setText(cad.getNacionalidad());
			}
		}
		
	}

}
