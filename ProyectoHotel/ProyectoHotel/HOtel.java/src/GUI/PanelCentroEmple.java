package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCentroEmple extends JPanel implements ActionListener{
	
	private static final String archivos = "CARGAR INFO ARCHIVOS";
	private static final String manual = "CARGAR INFO MANUAL";
	private static final String actualizar = "ACTUALIZARINFO";
	private static final String salir = "SALIR";

	
	private JButton agregarConsumo;
	private JButton pagoConsumo;
	private JButton facturar;
	private JButton salirr;
	
	public PanelCentroEmple() {
		
		setLayout(null);
		
		agregarConsumo = new JButton("AGREGAR CONSUMO");
		agregarConsumo.setBounds(150, 180, 160, 50);
		agregarConsumo.addActionListener(this);
		agregarConsumo.setActionCommand(archivos);
		
		pagoConsumo = new JButton("PAGO CONSUMO");
		pagoConsumo.setBounds(750, 180, 160, 50);
		pagoConsumo.addActionListener(this);
		pagoConsumo.setActionCommand(manual);
		
		facturar = new JButton("FACTURAR");
		facturar.setBounds(450, 325, 160, 50);
		facturar.addActionListener(this);
		facturar.setActionCommand(actualizar);
		
		salirr = new JButton("SALIR");
		salirr.setBounds(150, 480, 160, 50);
		salirr.addActionListener(this);
		salirr.setActionCommand(salir);

		
		add(agregarConsumo);
		add(pagoConsumo);
		add(facturar);
		add(salirr);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		
		
		
	}
}