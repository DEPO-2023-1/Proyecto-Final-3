package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazMenuAdmin extends JFrame{

    private PanelNorteAdmin PanelNorte;
    private PanelSurAdmin PanelSur;

    public InterfazMenuAdmin(){
        setSize(new Dimension(1000, 650));
        PanelNorte = new PanelNorteAdmin();
        PanelSur = new PanelSurAdmin();

		add(PanelNorte, BorderLayout.NORTH);
		add(PanelSur, BorderLayout.SOUTH);


        setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String [] args) {
        InterfazMenuAdmin ip = new InterfazMenuAdmin();
}
}


