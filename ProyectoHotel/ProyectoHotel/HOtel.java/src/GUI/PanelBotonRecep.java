package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	
	
	public PanelBotonRecep() {
		
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
			
			String valor = JOptionPane.showInputDialog("hola");
			
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
