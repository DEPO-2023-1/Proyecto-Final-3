package GUI;

import javax.swing.JFrame;

import java.awt.*;

public class InterfazRegistro extends JFrame{

    PanelNorteRegistro panelNorta;
    PanelCentroRegistro panelCentro;
    PanelSurRegistro panelSur;
    InterfazLogin login;
    InterfazRegistro reg;

    public InterfazRegistro(InterfazLogin login){
        
        this.login=login;
        panelCentro = new PanelCentroRegistro();
        panelSur = new PanelSurRegistro(this);
        panelNorta = new PanelNorteRegistro();

        setLayout(new BorderLayout());
		add(panelCentro, BorderLayout.EAST);
		add(panelSur, BorderLayout.SOUTH);
		add(panelNorta, BorderLayout.NORTH);
			
        setSize(new Dimension(1000, 850));
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
    
}

public boolean registro(){
    boolean x = false;
    String usuario = panelCentro.getTxtNum1();
    String contra = panelCentro.getTxtNum2();

    login.registro(usuario, contra);
    
    return x;
}
}
