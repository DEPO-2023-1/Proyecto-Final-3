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

    private static final String login = "login";
    private final static String Admin = "admin";
	private final static String Empleado = "empleado";
	private final static String Resepcionista= "recepcionista";
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
		labEmpleado = new JLabel("        Empleado:");
		labResepcionista = new JLabel("          Resepcionista:");
		
		butAdmin = new JRadioButton();
		butAdmin.addActionListener(this);
		butAdmin.setActionCommand(Admin);	
		butAdmin.setForeground(Color.WHITE);
		
		butEmpleado = new JRadioButton();
		butEmpleado.addActionListener(this);
		butEmpleado.setActionCommand(Empleado);	
		butEmpleado.setForeground(Color.WHITE);
		
		butResepcionista = new JRadioButton();
		butResepcionista.addActionListener(this);
		butResepcionista.setActionCommand(Resepcionista);	
		butResepcionista.setForeground(Color.WHITE);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(butAdmin);
		grupo.add(butEmpleado);
		grupo.add(butResepcionista);
        
		butLogin = new JButton("Login");
		butLogin.addActionListener(this);
		butLogin.setActionCommand(login);

        add(labAdmin);
        add(butAdmin);
        add(labEmpleado);
        add(butEmpleado);
        add(labResepcionista);
        add(butResepcionista);
        add(butLogin);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if (grito.equals(Admin)) {
			tipo = 1;
		}
		
		if (grito.equals(Empleado)) {
			tipo = 3;
		}
		
		if (grito.equals(Resepcionista)) {
			tipo = 2;
		}
		
		if (grito.equals(login)) {
			
			interfaz.login(tipo);
			
		}
		
	}
    
}
