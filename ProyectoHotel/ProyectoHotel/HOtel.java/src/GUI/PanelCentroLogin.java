package GUI;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;


public class PanelCentroLogin extends JPanel{

    private JLabel lbNum1;
	private JLabel lbNum2;
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	
	
	public PanelCentroLogin() {

		
		
		lbNum1 = new JLabel("Usuario: ");
		lbNum1.setPreferredSize(new Dimension(100, 50));
		
		txtNum1 = new JTextField();
		txtNum1 .setPreferredSize(new Dimension(100, 5));

		lbNum2 = new JLabel("Contraseña");
		lbNum2.setPreferredSize(new Dimension(100, 50));
		
		txtNum2 = new JTextField();
		txtNum2 .setPreferredSize(new Dimension(100, 200));

		setLayout(new FlowLayout());

		//setLayout(new GridLayout(2,2));
		
//		GridLayout gl = new GridLayout();
//		setLayout(gl);
		
		add(lbNum1);
		add(txtNum1);
		add(lbNum2);
		add(txtNum2);

		
	}

}
