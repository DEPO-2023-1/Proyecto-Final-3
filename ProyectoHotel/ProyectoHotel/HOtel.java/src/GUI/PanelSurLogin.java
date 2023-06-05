package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSurLogin extends JPanel implements ActionListener{

    private static final String LOGIN = "login";
	private static final String USUARIO = "usuario";
    private final static String ADMIN = "admin";
	private final static String EMPLEADO = "empleado";
	private final static String RECEPCIONISTA= "recepcionista";
	private final static String REGISTRO = "registro";
	private JLabel labAdmin;
	private JLabel labEmpleado;
	private JLabel labRecepcionista;
	private JLabel labUsuario;
	private JRadioButton butUsuario;
	private JRadioButton butAdmin;
	private JRadioButton butEmpleado;
	private JRadioButton butRecepcionista;
	private JButton butLogin;
	private JButton butRegistro;
	private InterfazLogin interfaz;
	private int tipo;

    public PanelSurLogin(InterfazLogin interfaz){
    	tipo = 1;
    	
    	this.interfaz = interfaz;
    	
    	labAdmin = new JLabel("        Administrador:");
		labRecepcionista = new JLabel("          Resepcionista:");
		labEmpleado = new JLabel("        Empleado:");
		labUsuario = new JLabel("        Usuario");
		
		
		butAdmin = new JRadioButton();
		butAdmin.addActionListener(this);
		butAdmin.setActionCommand(ADMIN);	
		
		butRecepcionista = new JRadioButton();
		butRecepcionista.addActionListener(this);
		butRecepcionista.setActionCommand(RECEPCIONISTA);	

		butEmpleado = new JRadioButton();
		butEmpleado.addActionListener(this);
		butEmpleado.setActionCommand(EMPLEADO);
		
		butUsuario = new JRadioButton();
		butUsuario.addActionListener(this);
		butUsuario.setActionCommand(USUARIO);	
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(butAdmin);
		grupo.add(butRecepcionista);
		grupo.add(butEmpleado);
		grupo.add(butUsuario);
        
		butLogin = new JButton("Login");
		butLogin.addActionListener(this);
		butLogin.setActionCommand(LOGIN);

		butRegistro = new JButton("Registrate");
		butRegistro.addActionListener(this);
		butRegistro.setActionCommand(REGISTRO);




        add(labAdmin);
        add(butAdmin);
        add(labRecepcionista);
        add(butRecepcionista);
		add(labEmpleado);
        add(butEmpleado);
		add(labUsuario);
		add(butUsuario);
        add(butLogin);
		add(butRegistro);

		
		
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if (grito.equals(ADMIN)) {
			tipo = 1;
		}
		
		if (grito.equals(RECEPCIONISTA)) {
			tipo = 2;
		}
		
		if (grito.equals(EMPLEADO)) {
			tipo = 3;
		}

		if (grito.equals(USUARIO)){
			tipo = 4;
		}
		
		if (grito.equals(LOGIN)) {
			
			boolean x = interfaz.login(tipo);
			
			if (x == false){
			JOptionPane.showInternalMessageDialog(null, "Usuario y/o contraseña incorrectas", "error", 1, null);
			
			}

		}
		
		if (grito.equals(REGISTRO)){
			interfaz.menuRegistro();
		}

	}
    
}
