package GUI;


import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSurLogin extends JPanel{
    private ButtonGroup tipo;

    public PanelSurLogin(){

        tipo = new ButtonGroup();
		String administrador="Administrador";
		String empleado="Empleado";
		String recepcionista="Recepcionista";
		JRadioButton adminButton = new JRadioButton(administrador);
		JRadioButton employButton = new JRadioButton(empleado);
		JRadioButton recepButton = new JRadioButton(recepcionista);
		

        tipo.add(adminButton);
        tipo.add(employButton);
        tipo.add(recepButton);

        add(adminButton);
        add(employButton);
        add(recepButton);
    }
    
}
