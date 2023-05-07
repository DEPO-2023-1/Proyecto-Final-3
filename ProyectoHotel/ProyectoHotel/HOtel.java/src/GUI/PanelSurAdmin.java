package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSurAdmin extends JPanel implements ActionListener{
	
	private static final String archivos = "CARGAR INFO ARCHIVOS";
	private static final String manual = "CARGAR INFO MANUAL";
	private static final String actualizar = "ACTUALIZARINFO";
	private static final String salir = "SALIR";

	
	private JButton archivosButton;
	private JButton manualButton;
	private JButton actualizarButton;
	private JButton salirButton;
	
	
	public PanelSurAdmin() {
		
		setLayout(null);
		
		archivosButton = new JButton("CARGAR INFO ARCHIVOS");
		archivosButton.setBounds(100, 180, 300, 100);
		archivosButton.addActionListener(this);
		archivosButton.setActionCommand(archivos);
		
		manualButton = new JButton("CARGAR ARCHIVOS MANUAL");
		manualButton.setBounds(100, 380, 300, 100);
		manualButton.addActionListener(this);
		manualButton.setActionCommand(manual);
		
		actualizarButton = new JButton("ACTUALIZAR INFO");
		actualizarButton.setBounds(600, 180, 300, 100);
		actualizarButton.addActionListener(this);
		actualizarButton.setActionCommand(actualizar);
		
		salirButton = new JButton("SALIR");
		salirButton.setBounds(600, 380, 300, 100);
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