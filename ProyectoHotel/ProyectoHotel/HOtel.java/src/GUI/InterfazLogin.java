package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;

    public InterfazLogin(){
        setSize(new Dimension(1000, 650));
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin();

        add(PanelNorte, BorderLayout.NORTH);
		add(PanelCentro, BorderLayout.CENTER);
		add(PanelSur, BorderLayout.SOUTH);
	

        setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String [] args) {
        InterfazLogin ip = new InterfazLogin();
}
}
