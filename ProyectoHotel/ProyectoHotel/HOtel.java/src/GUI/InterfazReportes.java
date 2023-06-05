package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class InterfazReportes extends JFrame{
	private PanelNorteReportes PanelNorte;
    private PanelSurReportes PanelSur;
    private InterfazLogin interfaz;
    
    public InterfazReportes(InterfazLogin interfaz) {
    	this.interfaz=interfaz;
        PanelNorte = new PanelNorteReportes();
        PanelSur = new PanelSurReportes(interfaz);

        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelSur, BorderLayout.CENTER);

        setSize(new Dimension(1000, 850));
        setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    

}



