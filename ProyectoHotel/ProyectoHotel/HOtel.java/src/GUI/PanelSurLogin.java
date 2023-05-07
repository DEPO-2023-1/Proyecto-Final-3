package GUI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSurLogin extends JPanel implements ActionListener{

    private static final String LOGIN = "login";
    private final static String ADMIN = "admin";
	private final static String EMPLEADO = "empleado";
	private final static String RESEPCIONISTA= "recepcionista";
	private JLabel labAdmin;
	private JLabel labEmpleado;
	private JLabel labResepcionista;
	private JRadioButton butAdmin;
	private JRadioButton butEmpleado;
	private JRadioButton butResepcionista;
	private JButton butLogin;
	private InterfazLogin interfaz;
	private int tipo;

    public PanelSurLogin(InterfazLogin interfaz){
    	tipo = 1;
    	
    	this.interfaz = interfaz;
    	
    	labAdmin = new JLabel("        Administrador:");
		labResepcionista = new JLabel("          Resepcionista:");
		labEmpleado = new JLabel("        Empleado:");
		
		
		butAdmin = new JRadioButton();
		butAdmin.addActionListener(this);
		butAdmin.setActionCommand(ADMIN);	
		
		butResepcionista = new JRadioButton();
		butResepcionista.addActionListener(this);
		butResepcionista.setActionCommand(RESEPCIONISTA);	

		butEmpleado = new JRadioButton();
		butEmpleado.addActionListener(this);
		butEmpleado.setActionCommand(EMPLEADO);	
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(butAdmin);
		grupo.add(butResepcionista);
		grupo.add(butEmpleado);
        
		butLogin = new JButton("Login");
		butLogin.addActionListener(this);
		butLogin.setActionCommand(LOGIN);

        add(labAdmin);
        add(butAdmin);
        add(labResepcionista);
        add(butResepcionista);
		add(labEmpleado);
        add(butEmpleado);
        add(butLogin);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if (grito.equals(ADMIN)) {
			tipo = 1;
		}
		
		if (grito.equals(RESEPCIONISTA)) {
			tipo = 2;
		}
		
		if (grito.equals(EMPLEADO)) {
			tipo = 3;
		}
		
		if (grito.equals(LOGIN)) {
			
			interfaz.login(tipo);
			
		}
		
	}
    
}
