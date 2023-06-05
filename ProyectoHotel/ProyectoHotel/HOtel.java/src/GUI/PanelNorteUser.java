package GUI;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNorteUser extends JPanel {
    private JLabel titulo;

    public PanelNorteUser (){
        titulo = new JLabel ("Menu usuarios");

        Font auxFont=titulo.getFont();

        titulo.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 60));
        add(titulo);
    }
    
}
