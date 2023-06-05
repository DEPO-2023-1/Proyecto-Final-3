package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Clases.Grupo;


public class PanelCentroUsuario extends JPanel implements ActionListener{

	private JButton consultarHab;
<<<<<<< HEAD
	private JButton butCrearReserva;

	private static final String ConHabitacion = "ConHabitacion";
	private static final String CrearReserva = "Reservar Habitacion";
=======
	private JButton ConsultarCheck;
	private static final String ConHabitacion = "ConHabitacion";
	private static final String CheckOut = "CheckOut";
>>>>>>> e1d4a001b2824156017e02824bc3300e8bb38647
	private InterfazLogin interfaz;

	public PanelCentroUsuario(InterfazLogin interfaz){
		this.interfaz = interfaz;

		consultarHab = new JButton("Consultar Habitacion");
		consultarHab.setBounds(720, 480, 175, 50);
		consultarHab.addActionListener(this);
		consultarHab.setActionCommand(ConHabitacion);

<<<<<<< HEAD
		butCrearReserva = new JButton("Reservar habitacion");
		butCrearReserva.setBounds(120, 180, 175, 50);
		butCrearReserva.addActionListener(this);
		butCrearReserva.setActionCommand(CrearReserva);

		add(consultarHab);
		add(butCrearReserva);
=======
		ConsultarCheck = new JButton("CheckOut");
		ConsultarCheck.setBounds(420, 280, 175, 50);
		ConsultarCheck.addActionListener(this);
		ConsultarCheck.setActionCommand(CheckOut);

		add(consultarHab);
		add(ConsultarCheck);
>>>>>>> e1d4a001b2824156017e02824bc3300e8bb38647
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
<<<<<<< HEAD
		if (grito.equals(CrearReserva)) {
			
			int inicialAnio = Integer.parseInt(JOptionPane.showInputDialog("Año inicio de reserva"));
			int inicialMes = Integer.parseInt(JOptionPane.showInputDialog("Mes inicio de reserva"));
			int inicialDia = Integer.parseInt(JOptionPane.showInputDialog("Día inicio de reserva"));
			int finalAnio = Integer.parseInt(JOptionPane.showInputDialog("Año final de reserva"));
			int finalMes = Integer.parseInt(JOptionPane.showInputDialog("Mes final de reserva"));
			int finalDia = Integer.parseInt(JOptionPane.showInputDialog("Día final de reserva"));
			int canNinos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de niños"));
			int canAdultos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de adultos"));
			String[] disponible = interfaz.disponible(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, canNinos, canAdultos);
			String respuesta = disponible[0];
			String precio = disponible[1];
			if (respuesta.equals("no")){
				JOptionPane.showInputDialog("No hay reserva dispobile");
			}
			else {
				String aceptar = JOptionPane.showInputDialog("Su reserva costará "+precio+" ¿Desea aceptar? (escriba si o no)");
				if (aceptar.equals("si")) {
					
					Grupo grupo = interfaz.newGrupo(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, respuesta);
					boolean centinela = true;
			    	while(centinela) {
			    		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
			    		int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula"));
						int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
						String correo = JOptionPane.showInputDialog("Ingrese su correo, si no tiene precione enter");
			    		interfaz.agregarHuespedGrupo(grupo, nombre, cedula, edad, correo);
			    		
			    		String nuevo = JOptionPane.showInputDialog("¿Quiere agregar otro huesped? (escriba si o no)");
			    		if (nuevo.equals("no")) {
			    			centinela = false;
			    		}
			    	}
			    	interfaz.crearReserva(grupo, inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, respuesta);
			    	JOptionPane.showMessageDialog(interfaz,"Su reserva fue creada");
				}
				
			}

			
=======
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
>>>>>>> e1d4a001b2824156017e02824bc3300e8bb38647
		}
	}

	
}