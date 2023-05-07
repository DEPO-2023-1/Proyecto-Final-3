package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Clases.Grupo;

public class PanelBotonRecep extends JPanel implements ActionListener{
	
	private static final String CrearReserva = "CrearReserva";
	private static final String CancelarReserva = "CancelarReserva";
	private static final String Checkout = "Checkout";
	private static final String ConInventario = "ConInventario";
	private static final String ConHabitacion = "ConHabitacion";
	
	private JButton butCrearReserva;
	private JButton butCancelarReserva;
	private JButton butCheckout;
	private JButton butConInventario;
	private JButton butConHabitacion; 
	private InterfazLogin interfaz;
	
	
	public PanelBotonRecep(InterfazLogin interfaz) {
		
		this.interfaz = interfaz;
		
		setLayout(null);
		
		butCrearReserva = new JButton("Crear Reserva");
		butCrearReserva.setBounds(120, 180, 175, 50);
		butCrearReserva.addActionListener(this);
		butCrearReserva.setActionCommand(CrearReserva);
		
		butCancelarReserva = new JButton("Cancelar Reserva");
		butCancelarReserva.setBounds(720, 180, 175, 50);
		butCancelarReserva.addActionListener(this);
		butCancelarReserva.setActionCommand(CancelarReserva);
		
		butCheckout = new JButton("Checkout");
		butCheckout.setBounds(420, 325, 175, 50);
		butCheckout.addActionListener(this);
		butCheckout.setActionCommand(Checkout);
		
		butConInventario = new JButton("Consultar Inventario");
		butConInventario.setBounds(120, 480, 175, 50);
		butConInventario.addActionListener(this);
		butConInventario.setActionCommand(ConInventario);
		
		butConHabitacion = new JButton("Consultar Habitacion");
		butConHabitacion.setBounds(720, 480, 175, 50);
		butConHabitacion.addActionListener(this);
		butConHabitacion.setActionCommand(ConHabitacion);

		
		add(butCrearReserva);
		add(butCancelarReserva);
		add(butCheckout);
		add(butConInventario);
		add(butConHabitacion);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
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
				}
				
			}

			
		}
		if (grito.equals(CancelarReserva)) {
			JOptionPane.showInputDialog("hola");
			
			
			
		}
		if (grito.equals(Checkout)) {
			JOptionPane.showInputDialog("hola");
		}
		if (grito.equals(ConInventario)) {
			JOptionPane.showInputDialog("hola");
		}
		if (grito.equals(ConHabitacion)) {
			JOptionPane.showInputDialog("hola");
		}
		
	}
}
