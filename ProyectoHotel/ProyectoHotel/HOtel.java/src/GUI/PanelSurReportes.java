package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSurReportes extends JPanel implements ActionListener{
	private static final String CantidadPorProducto = "CantidadPorProducto";
	private static final String VentaPorProducto = "VentaPorProducto";
	private static final String PrecioPorNochePorHabitacion = "PrecioPorNochePorHabitacion";
	
	private JButton butCantidadPorProducto;
	private JButton butVentaPorProducto;
	private JButton butPrecioPorNochePorHabitacion;
	private InterfazLogin interfaz;
	
	public PanelSurReportes(InterfazLogin interfaz ) {
		this.interfaz = interfaz;
		
		setLayout(null);
		
		butCantidadPorProducto = new JButton("Grafica cantidad consumida por producto");
		butCantidadPorProducto.setBounds(120, 180, 175, 50);
		butCantidadPorProducto.addActionListener(this);
		butCantidadPorProducto.setActionCommand(CantidadPorProducto);
		
		butVentaPorProducto = new JButton("Grafica venta neta por producto");
		butVentaPorProducto.setBounds(720, 180, 175, 50);
		butVentaPorProducto.addActionListener(this);
		butVentaPorProducto.setActionCommand(VentaPorProducto);
		
		butPrecioPorNochePorHabitacion = new JButton("Grafica precio por noche por habitación");
		butPrecioPorNochePorHabitacion.setBounds(420, 325, 175, 50);
		butPrecioPorNochePorHabitacion.addActionListener(this);
		butPrecioPorNochePorHabitacion.setActionCommand(PrecioPorNochePorHabitacion);
		
		
		add(butCantidadPorProducto);
		add(butVentaPorProducto);
		add(butPrecioPorNochePorHabitacion);
	}
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		if (grito.equals(CantidadPorProducto)) {
			
			interfaz.reporteCantidad();
		}
		if (grito.equals(VentaPorProducto)) {
			interfaz.reportePrecios();
			
		}
		if (grito.equals(PrecioPorNochePorHabitacion)) {
			interfaz.reporteNoche();
		}
		
		
	}
	
}
	
