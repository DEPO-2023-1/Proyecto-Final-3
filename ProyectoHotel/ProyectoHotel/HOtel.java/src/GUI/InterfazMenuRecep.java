package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class InterfazMenuRecep extends JFrame{
	
	private PanelBotonRecep boton;

    public InterfazMenuRecep(){

        boton = new PanelBotonRecep();
        
        setLayout(new BorderLayout());
        
        add(boton);
        
        setSize(new Dimension(1000,750));
		setResizable(false);
		setTitle("Calculadora :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        
        
    }

    public static void main(String args[]){
    	InterfazMenuRecep ventana = new InterfazMenuRecep();
    }
	
    
}
