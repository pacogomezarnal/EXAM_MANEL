package Vista;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Cadete;
import Modelo.ModCad;

public class VEquipo extends JPanel {
	private JTextField txtNom;
	private JTextField txtId;
	private JTextField txtCog1;
	private JTextField txtEd;
	private JTextField txtNac;
	private JComboBox cbequip;
	private ArrayList<Cadete> equip;
	private ModCad modc;
	private JTextField txtCog2;

	/**
	 * Create the panel.
	 */
	public VEquipo(ModCad mc) {
		modc = mc;
		equip = modc.getEquips();
		
		setBounds(0, 0, 500, 500);
		setLayout(null);

		 cbequip = new JComboBox();
		cbequip.setBounds(10, 78, 149, 20);
		add(cbequip);
		cbequip.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setText(equip.get(cbequip.getSelectedIndex()));
			}
		});

		txtNom = new JTextField();
		txtNom.setEditable(false);
		txtNom.setBounds(206, 78, 165, 20);
		add(txtNom);
		txtNom.setColumns(10);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("");
		txtId.setBounds(381, 78, 109, 20);
		add(txtId);
		txtId.setColumns(10);

		txtCog1 = new JTextField();
		txtCog1.setEditable(false);
		txtCog1.setBounds(206, 162, 165, 20);
		add(txtCog1);
		txtCog1.setColumns(10);

		txtEd = new JTextField();
		txtEd.setEditable(false);
		txtEd.setBounds(206, 299, 165, 20);
		add(txtEd);
		txtEd.setColumns(10);

		txtNac = new JTextField();
		txtNac.setEditable(false);
		txtNac.setBounds(206, 367, 165, 20);
		add(txtNac);
		txtNac.setColumns(10);

		JButton btnSeg = new JButton("Seg\u00FCent >>");
		btnSeg.setBounds(331, 444, 159, 23);
		add(btnSeg);

		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(206, 53, 130, 14);
		add(lblNom);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(381, 53, 109, 14);
		add(lblId);

		JLabel lblCog1 = new JLabel("Cognom 1");
		lblCog1.setBounds(206, 137, 130, 14);
		add(lblCog1);

		JLabel lblEdat = new JLabel("Edat");
		lblEdat.setBounds(206, 274, 130, 14);
		add(lblEdat);

		JLabel lblNacionalitat = new JLabel("Nacionalitat");
		lblNacionalitat.setBounds(206, 342, 130, 14);
		add(lblNacionalitat);

		JLabel lblEquip = new JLabel("Equip");
		lblEquip.setBounds(10, 53, 149, 14);
		add(lblEquip);

		JButton btnEnr = new JButton("<< Enrrere");
		btnEnr.setBounds(10, 444, 165, 23);
		add(btnEnr);
		
		txtCog2 = new JTextField();
		txtCog2.setEditable(false);
		txtCog2.setBounds(206, 231, 165, 20);
		add(txtCog2);
		txtCog2.setColumns(10);
		
		JLabel lblCognom = new JLabel("Cognom 2");
		lblCognom.setBounds(206, 206, 165, 14);
		add(lblCognom);
		
		replenaComboBox();
	}

	public void replenaComboBox(){
		for(int i=0;i<equip.size();i++){
			cbequip.addItem(equip.get(i).getNombre());
		}
	}
	public void setText(Cadete cad) {
		String cognoms = cad.getApellidos();
		String cog1 = cognoms.substring(0, cognoms.lastIndexOf(" "));
		String cog2 = cognoms.substring(cognoms.lastIndexOf(" "), cognoms.length());
		this.txtId.setText(cad.getId() + "");
		this.txtNom.setText(cad.getNombre());
		this.txtCog1.setText(cog1);
		this.txtCog2.setText(cog2);
		this.txtEd.setText(cad.getEdad() + "");
		this.txtNac.setText(cad.getNacionalidad());

	}
}
