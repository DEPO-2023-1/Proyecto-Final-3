package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSurAdmin extends JPanel implements ActionListener{
    private static final String archivos = "CARGAR INFO ARCHIVOS";
	private static final String manual = "CARGAR INFO MANUAL";
	private static final String actualizar = "ACTUALIZAR INFO ";
	private static final String salir = "SALIR";
	
	private JButton archivosButton;
	private JButton manualButton;
	private JButton actualizarButton;
	private JButton salirButton;
	
	public PanelSurAdmin() {
		setLayout(null);
		
		archivosButton = new JButton("CARGAR INFO ARCHIVOS");
		archivosButton.setBounds(100, 100, 200, 50);
		archivosButton.addActionListener(this);
		archivosButton.setActionCommand(archivos);
		
		manualButton = new JButton("CARGAR INFO MANUAL");
		manualButton.setBounds(100, 200, 200, 50);
		manualButton.addActionListener(this);
		manualButton.setActionCommand(manual);
		
		actualizarButton = new JButton("ACTUALIZAR INFO");
		actualizarButton.setBounds(100, 300, 200, 50);
		actualizarButton.addActionListener(this);
		actualizarButton.setActionCommand(actualizar);
		
		salirButton = new JButton("SALIR");
		salirButton.setBounds(100, 400, 200, 50);
		salirButton.addActionListener(this);
		salirButton.setActionCommand(salir);
		
		
		add(archivosButton);
		add(manualButton);
		add(actualizarButton);
		add(salirButton);
	}

    public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
    
}
}
