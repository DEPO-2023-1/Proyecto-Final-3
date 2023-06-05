package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSurRegistro extends JPanel implements ActionListener{

    private JButton registro;
    private final static String REGISTER = "Registro";
    private InterfazRegistro interfaz;
  
    public PanelSurRegistro(InterfazRegistro interfaz){

        this.interfaz = interfaz;

        registro = new JButton("Registrarse", null);
        registro.addActionListener(this);
        registro.setActionCommand(REGISTER);

        add(registro);
    }
    


@Override
public void actionPerformed(ActionEvent e) {
    String grito = e.getActionCommand();

    if (grito.equals(REGISTER)){
        interfaz.registro();
    }
}
}
