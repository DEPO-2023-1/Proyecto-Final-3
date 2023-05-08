package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazMenuAdmin extends JFrame{

    private PanelNorteAdmin PanelNorte;
    private PanelSurAdmin PanelSur;

    public InterfazMenuAdmin(){

        PanelNorte = new PanelNorteAdmin();
        PanelSur = new PanelSurAdmin();

        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelSur, BorderLayout.CENTER);

        setSize(new Dimension(1000, 850));
        setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}


