package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazMenuEmpleado extends JFrame{

    private PanelNorteEmple panelNorte;
    private PanelCentroEmple panelCentro;
    private PanelSurLogin panelSur;
    

    public InterfazMenuEmpleado(){

        panelNorte = new PanelNorteEmple();
        panelCentro = new PanelCentroEmple();
        panelSur = new PanelSurLogin();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(panelNorte, BorderLayout.NORTH);
        mainPanel.add(panelCentro, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("Menu Empleados");
        setSize(1000, 750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
public static void main (String[] args){
    InterfazMenuEmpleado menu = new InterfazMenuEmpleado();
}
}
