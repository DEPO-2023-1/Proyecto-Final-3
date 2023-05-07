package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;

    public InterfazLogin(){
        setSize(new Dimension(1000, 750));
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin();

        JPanel panelCentral = new JPanel(new BorderLayout());
		panelCentral.add(PanelNorte, BorderLayout.NORTH);
		panelCentral.add(PanelCentro, BorderLayout.CENTER);
		panelCentral.add(PanelSur, BorderLayout.SOUTH);
		
		setContentPane(panelCentral);

        setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String [] args) {
        Interfaz ip = new Interfaz();
}
}
