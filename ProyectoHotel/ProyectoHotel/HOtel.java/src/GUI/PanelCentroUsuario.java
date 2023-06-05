package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelCentroUsuario extends JPanel implements ActionListener{

	private JButton consultarHab;
	private static final String ConHabitacion = "ConHabitacion";
	private InterfazLogin interfaz;

	public PanelCentroUsuario(InterfazLogin interfaz){
		this.interfaz = interfaz;

		consultarHab = new JButton("Consultar Habitacion");
		consultarHab.setBounds(720, 480, 175, 50);
		consultarHab.addActionListener(this);
		consultarHab.setActionCommand(ConHabitacion);

		add(consultarHab);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if (grito.equals(ConHabitacion)) {
			String IDHabitacion = JOptionPane.showInputDialog("Ingrese el ID de la habitación");
			String opcion = JOptionPane.showInputDialog("Escriba <1> si quiere consultar una reserva en un día en espesifico \n"
					+ "o <2> si quiere consultar el toda la información de la habitacion\n");
			if (opcion.equals("1")) {
				int inicialAnio = Integer.parseInt(JOptionPane.showInputDialog("Año inicio de reserva"));
				int inicialMes = Integer.parseInt(JOptionPane.showInputDialog("Mes inicio de reserva"));
				int inicialDia = Integer.parseInt(JOptionPane.showInputDialog("Día inicio de reserva"));
				String respuesta = interfaz.consultarHabitacion(1,IDHabitacion, inicialAnio, inicialMes, inicialDia);
				JOptionPane.showMessageDialog(interfaz,respuesta);
			}
			else if (opcion.equals("2")) {
				String respuesta = interfaz.consultarHabitacion(2,IDHabitacion, 0,0,0);
				JOptionPane.showMessageDialog(interfaz,respuesta);
			}
			
			
		}
	}

	
}