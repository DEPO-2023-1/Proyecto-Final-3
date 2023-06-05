package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelCentroUsuario extends JPanel implements ActionListener{

	private JButton consultarHab;
	private static final String ConHabitacion = "ConHabitacion";
	private InterfazLogin interfaz;

	public PanelCentroUsuario(){
		this.interfaz = interfaz;

		consultarHab = new JButton("Consultar Habitacion");
		consultarHab.setBounds(720, 480, 175, 50);
		consultarHab.addActionListener(this);
		consultarHab.setActionCommand(ConHabitacion);

		add(consultarHab);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}

	
}