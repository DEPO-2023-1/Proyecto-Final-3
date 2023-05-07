package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;

    public InterfazLogin(){
        
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin();

        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelCentro, BorderLayout.CENTER);
		add(PanelSur, BorderLayout.SOUTH);
			
        setSize(new Dimension(1000, 650));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


    }
    public static void main(String [] args) {
        InterfazLogin ip = new InterfazLogin();
}
}
