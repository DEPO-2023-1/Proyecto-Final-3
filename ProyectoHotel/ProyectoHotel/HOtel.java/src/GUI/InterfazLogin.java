package GUI;

import javax.swing.JFrame;

import Clases.App;
import Clases.Hotel;

import java.awt.*;


public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;
    private App app;

    public InterfazLogin(){
    	
        app = new App();
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin(this);


        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelCentro, BorderLayout.CENTER);
		add(PanelSur, BorderLayout.SOUTH);
			
        setSize(new Dimension(1000, 650));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

    }
    public void login(int tipo) {
    	String usuario = PanelCentro.getTxtNum1();
    	String contrasena = PanelCentro.getTxtNum2();
    	boolean ingreso = App.seleccionarUsuario(usuario, contrasena, tipo);

    	if (ingreso) {
            if (tipo == 1){
                InterfazMenuAdmin admin = new InterfazMenuAdmin();
            }
            if (tipo == 2){
                InterfazMenuAdmin recep = new InterfazMenuAdmin();
            }
            if (tipo == 3){
                InterfazMenuAdmin admin = new InterfazMenuAdmin();
            }
    		
            
    	
    	}
    	else {    
    		InterfazMenuEmpleado recep = new InterfazMenuEmpleado();
            System.out.println(contrasena);
    	}
    }
    
    public static void main(String [] args) {
        InterfazLogin ip = new InterfazLogin();
    }
}
