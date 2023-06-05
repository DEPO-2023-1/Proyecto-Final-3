package GUI;

import javax.swing.JFrame;


import java.awt.*;

public class InterfazUsuario extends JFrame {

    private InterfazLogin interfaz;
    private PanelNorteUser panelNorte;
    private PanelCentroUsuario panelCentro;

    public InterfazUsuario(InterfazLogin interfaz){

        this.interfaz=interfaz;
        panelNorte = new PanelNorteUser();
        panelCentro = new PanelCentroUsuario(interfaz);
        //PanelSur = new PanelSurAdmin(interfaz);

        setLayout(new BorderLayout());
		add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
		//add(PanelSur, BorderLayout.CENTER);

        setSize(new Dimension(1000, 850));
        setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
