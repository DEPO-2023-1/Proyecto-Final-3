package GUI;

import javax.swing.*;
import java.awt.*;

public class InterfazMenuEmpleado extends JFrame{

    private PanelNorteEmple panelNorte;
    private PanelCentroEmple panelCentro;

    

    public InterfazMenuEmpleado(){

        panelNorte = new PanelNorteEmple();
        panelCentro = new PanelCentroEmple();


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(panelNorte, BorderLayout.NORTH);
        mainPanel.add(panelCentro, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("Menu Empleados");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }
public static void main (String[] args){
    InterfazMenuEmpleado menu = new InterfazMenuEmpleado();
}
}
