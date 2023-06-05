package GUI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNorteReportes  extends JPanel{
	private JLabel titulo;

    public PanelNorteReportes(){

        titulo = new JLabel("Reportes");
        
        Font auxFont=titulo.getFont();

        titulo.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 60));
        add(titulo);

    }
}


