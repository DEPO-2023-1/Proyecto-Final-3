package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSurAdmin extends JPanel implements ActionListener{
	
	private static final String archivos = "CARGAR INFO ARCHIVOS";
	private static final String manual = "CARGAR INFO MANUAL";
	private static final String actualizar = "ACTUALIZARINFO";
	private static final String salir = "sALIR";

	
	private JButton archivosButton;
	private JButton manualButton;
	private JButton actualizarButton;
	private JButton salirButton;
	
	
	public PanelSurAdmin() {
		
		setLayout(null);
		
		archivosButton = new JButton("CARGAR INFO ARCHIVOS");
		archivosButton.setBounds(150, 180, 150, 50);
		archivosButton.addActionListener(this);
		archivosButton.setActionCommand(archivos);
		
		manualButton = new JButton("CARGAR ARCHIVOS MANUAL");
		manualButton.setBounds(750, 180, 150, 50);
		manualButton.addActionListener(this);
		manualButton.setActionCommand(manual);
		
		actualizarButton = new JButton("ACTUALIZAR INFO");
		actualizarButton.setBounds(450, 325, 150, 50);
		actualizarButton.addActionListener(this);
		actualizarButton.setActionCommand(actualizar);
		
		salirButton = new JButton("SALIR");
		salirButton.setBounds(150, 480, 150, 50);
		salirButton.addActionListener(this);
		salirButton.setActionCommand(salir);

		
		add(archivosButton);
		add(manualButton);
		add(actualizarButton);
		add(salirButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		
		
	}
}