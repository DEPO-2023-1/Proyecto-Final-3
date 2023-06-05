package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelCentroUsuario extends JPanel implements ActionListener{

	private JButton consultarHab;
	private JButton ConsultarCheck;
	private static final String ConHabitacion = "ConHabitacion";
	private static final String CheckOut = "CheckOut";
	private InterfazLogin interfaz;

	public PanelCentroUsuario(InterfazLogin interfaz){
		this.interfaz = interfaz;

		consultarHab = new JButton("Consultar Habitacion");
		consultarHab.setBounds(720, 480, 175, 50);
		consultarHab.addActionListener(this);
		consultarHab.setActionCommand(ConHabitacion);

		ConsultarCheck = new JButton("CheckOut");
		ConsultarCheck.setBounds(420, 280, 175, 50);
		ConsultarCheck.addActionListener(this);
		ConsultarCheck.setActionCommand(CheckOut);

		add(consultarHab);
		add(ConsultarCheck);
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
		if (grito.equals(CheckOut)){
			String IDHabitacion = JOptionPane.showInputDialog("Ingrese el ID de su habitacion)");
			String checkOut = interfaz.checkOut(IDHabitacion);
			JOptionPane.showMessageDialog(interfaz,checkOut);
			String tipo = JOptionPane.showInputDialog("Escriba la forma de pago: PayPal, Payu o Sire (Escriba Exactamente)");
			String cuenta = JOptionPane.showInputDialog("ingrese su nombre");
			cuenta += ", ";
			cuenta += JOptionPane.showInputDialog("ingrese su numero de cuenta");
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a pagar"));
			cantidad *= 0.9;
			interfaz.pago(tipo, cuenta, cantidad);
			JOptionPane.showMessageDialog(interfaz, "Pago exitoso");
		}
	}

	
}