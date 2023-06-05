package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSurAdmin extends JPanel implements ActionListener{
	
	private static final String archivos = "CARGAR INFO ARCHIVOS";
	private static final String manual = "CARGAR INFO MANUAL";
	private static final String actualizar = "ACTUALIZARINFO";
	private static final String salir = "SALIR";
	private static final String reportes = "REPORTES";
	private InterfazLogin interfaz;

	
	private JButton archivosButton;
	private JButton manualButton;
	private JButton actualizarButton;
	private JButton salirButton;
	private JButton reportesButton;
	
	
	public PanelSurAdmin(InterfazLogin interfaz) {
		this.interfaz=interfaz;
		
		setLayout(null);
		
		archivosButton = new JButton("CARGAR INFO ARCHIVOS");
		archivosButton.setBounds(100, 100, 300, 100);
		archivosButton.addActionListener(this);
		archivosButton.setActionCommand(archivos);
		
		manualButton = new JButton("CARGAR ARCHIVOS MANUAL");
		manualButton.setBounds(100, 250, 300, 100);
		manualButton.addActionListener(this);
		manualButton.setActionCommand(manual);
		
		actualizarButton = new JButton("ACTUALIZAR INFO");
		actualizarButton.setBounds(600, 100, 300, 100);
		actualizarButton.addActionListener(this);
		actualizarButton.setActionCommand(actualizar);
		
		salirButton = new JButton("SALIR");
		salirButton.setBounds(600, 250, 300, 100);
		salirButton.addActionListener(this);
		salirButton.setActionCommand(salir);

		reportesButton = new JButton("REPORTES");
		archivosButton.setBounds(100, 400, 300, 100);
		archivosButton.addActionListener(this);
		archivosButton.setActionCommand(reportes);
		
		add(archivosButton);
		add(manualButton);
		add(actualizarButton);
		add(salirButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if (grito.equals(archivos)) {
			
			String habitaciones = "ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Habitaciones.txt";
			String inventario = "ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Inventario.txt";
    		String Servicio = "ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Servicios.txt";
    		String restaurante = "ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Restaurante.txt";
    		String temporada = "ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Temporada.txt";
			interfaz.cargarHotel(habitaciones, inventario, Servicio, restaurante, temporada);
			JOptionPane.showMessageDialog(interfaz,"Se cargaron los archivos con exito");
		}
		if (grito.equals(manual)) {
			
			FrameCargaManual cargaManual = new FrameCargaManual(interfaz);
		}
		if (grito.equals(actualizar)) {
			JOptionPane.showMessageDialog(interfaz,"Esta opción no está disponible, lo sentimos");
			
		}
		if (grito.equals(salir)) {
			System.exit(0);
		}
		if (grito.equals(reportes)) {
			InterfazReportes reportes = new InterfazReportes(interfaz);
		}
		
	}
}