package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCrearReserva extends JPanel implements ActionListener{

	private JLabel lbInicialAnio;
	private JLabel lbinIcialMes;
	private JLabel lbInicialDia;
	private JLabel lbFinalAnio;
	private JLabel lbFinalMes;
	private JLabel lbFinalDia;
	
	private JTextField txtInicialAnio;
	private JTextField txtInicialMes;
	private JTextField txInicialDia;
	private JTextField txFinalAnio;
	private JTextField txFinalDia;
	private JTextField txFinalMes;
	
	
	//int inicialAnio = frame.getIniclaAnio();
    //int inicialMes = frame.getInicialMes();
    //int inicialDia = frame.getInicialDia();
    //int finalAnio = frame.getfinalAnio();
    //int finalMes = frame.finalMes();
    //int finalDia = frame.getFinalDia();
	public FrameCrearReserva() {
		
		lbInicialAnio = new JLabel("Usuario: ");
		lbInicialAnio.setPreferredSize(new Dimension(400, 100));
		
		txtInicialAnio = new JTextField();
		txtInicialAnio .setPreferredSize(new Dimension(400, 50));

		lbinIcialMes = new JLabel("Contraseña");
		lbinIcialMes.setPreferredSize(new Dimension(400, 100));
		
		txtInicialMes = new JTextField();
		txtInicialMes .setPreferredSize(new Dimension(400, 50));
		
		lbInicialDia = new JLabel("Contraseña");
		lbInicialDia.setPreferredSize(new Dimension(400, 100));
		
		txInicialDia = new JTextField();
		txInicialDia .setPreferredSize(new Dimension(400, 50));
		
		lbFinalAnio = new JLabel("Usuario: ");
		lbFinalAnio.setPreferredSize(new Dimension(400, 100));
		
		txFinalAnio = new JTextField();
		txFinalAnio .setPreferredSize(new Dimension(400, 50));

		lbFinalMes = new JLabel("Contraseña");
		lbFinalMes.setPreferredSize(new Dimension(400, 100));
		
		txFinalDia = new JTextField();
		txFinalDia .setPreferredSize(new Dimension(400, 50));
		
		lbFinalDia = new JLabel("Contraseña");
		lbFinalDia.setPreferredSize(new Dimension(400, 100));
		
		txFinalMes = new JTextField();
		txFinalMes .setPreferredSize(new Dimension(400, 50));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
