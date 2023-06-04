package GUI;

import javax.swing.JFrame;

import java.awt.*;

public class InterfazRegistro extends JFrame{

    PanelCentroRegistro panelCentro;
    PanelSurRegistro panelSur;
    InterfazLogin login;

    public InterfazRegistro(InterfazLogin login){
        
        this.login=login;
        panelCentro = new PanelCentroRegistro();
        panelSur = new PanelSurRegistro();

        setLayout(new BorderLayout());
		add(panelCentro, BorderLayout.EAST);
		add(panelSur, BorderLayout.SOUTH);
		//add(PanelCalendario, BorderLayout.WEST);
			
        setSize(new Dimension(1000, 850));
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
    
}
}