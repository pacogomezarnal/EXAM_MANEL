package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VComprobacion extends JPanel {

	private JTextField txtId;
	private JTextField txtCog;
	private JTextField txtComp;
	/**
	 * Create the panel.
	 */
	public VComprobacion() {
		setBounds(0,0,500,500);
		setLayout(null);
		
		txtId = new JTextField();
		txtId.setText("");
		txtId.setBounds(10, 77, 109, 20);
		add(txtId);
		txtId.setColumns(10);
		
		txtCog = new JTextField();
		txtCog.setColumns(10);
		txtCog.setBounds(151, 77, 165, 20);
		add(txtCog);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 52, 109, 14);
		add(lblId);
		
		JLabel lblerCognom = new JLabel("1er Cognom");
		lblerCognom.setBounds(149, 52, 167, 14);
		add(lblerCognom);
		
		JButton btnComp = new JButton("COMPROVA");
		btnComp.setBounds(10, 151, 480, 23);
		add(btnComp);
		
		txtComp = new JTextField();
		txtComp.setEditable(false);
		txtComp.setBounds(10, 195, 480, 20);
		add(txtComp);
		txtComp.setColumns(10);
		

		JButton btnEnr = new JButton("<< Enrrere");
		btnEnr.setBounds(10, 444, 165, 23);
		add(btnEnr);
	}

}
