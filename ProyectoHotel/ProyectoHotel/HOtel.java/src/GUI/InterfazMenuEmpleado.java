package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazMenuEmpleado extends JFrame{

    JLabel lbmenu;

    public void ejecutar(){

        lbmenu = new JLabel();

        ///////Botones////////
        JButton botonOp1 = new JButton("Agregar consumo a una habitacion", null);
        botonOp1.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // ACA SE PONE LA INTERFAZ PARA ANADIR CONSUMO
            }
            
        });
        JButton botonOp2 = new JButton("Pagar consumo a una habitacion", null);
        botonOp2.addActionListener (new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // ACA SE PONE LA INTERFAZ PARA ANADIR CONSUMO
            }
            
        });

        JButton botonOp3 = new JButton("Facturar", null);
        botonOp3.addActionListener (new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // ACA SE PONE LA INTERFAZ PARA ANADIR CONSUMO
            }
            
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2, 5, 5));
        panelBotones.add(botonOp1);
        panelBotones.add(botonOp2);
        panelBotones.add(botonOp3);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(lbmenu, BorderLayout.NORTH);
        mainPanel.add(panelBotones, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("Menu Empleados");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
public static void main (String[] args){
    InterfazMenuEmpleado menu = new InterfazMenuEmpleado();
    menu.ejecutar();
}
}
