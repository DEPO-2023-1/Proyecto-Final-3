package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Clases.App;
import Clases.Grupo;
import Clases.Hotel;

import java.awt.*;
import java.util.ArrayList;


public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;
    private PanelCalendario PanelCalendario;
    private App app;
    private ArrayList<Integer> matriz;

    public InterfazLogin(){
    	
        app = new App();
        matriz = app.listaFechas();
        PanelCalendario = new PanelCalendario(matriz);
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin(this);


        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelCentro, BorderLayout.EAST);
		add(PanelSur, BorderLayout.SOUTH);
		add(PanelCalendario, BorderLayout.WEST);
			
        setSize(new Dimension(1000, 850));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

        JOptionPane.showMessageDialog(null, "Usuario: admin, Contrasenia: admin \n Usuario: empleado, Contrasenia: empleado \n Usuario: recepcionista, Contrasenia: recepcionista", "importante", 1, null);

    }
    public void login(int tipo) {
    	String usuario = PanelCentro.getTxtNum1();
    	String contrasena = PanelCentro.getTxtNum2();
        boolean ingreso = true;
    	//boolean ingreso = App.seleccionarUsuario(usuario, contrasena, tipo);

    	if (ingreso) {
            if (tipo == 1){
                InterfazMenuAdmin admin = new InterfazMenuAdmin(this);
            }
            if (tipo == 2){
                InterfazMenuRecep recep = new InterfazMenuRecep(this);
            }
            if (tipo == 3){
                InterfazMenuEmpleado admin = new InterfazMenuEmpleado(this);
            }
    		
            
    	
    	}
    }
    
    public String[] disponible(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, int canNinos, int canAdultos) {
    	String[] respuesta = app.disponible(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, canNinos, canAdultos);
    	return respuesta;
    }
    
    public Grupo newGrupo(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	 Grupo grupo = app.newGrupo(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    	 return grupo;
    }
    
    public void agregarHuespedGrupo(Grupo grupo, String nombre, int cedula, int edad, String correo){
    	app.agregarHuespedGrupo(grupo, nombre, cedula, edad, correo);
    }
    
    public void crearReserva(Grupo grupo, int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	app.crearReserva(grupo, inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    public void cancelarReserva(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	app.cancelarReserva(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    public String checkOut(String IDHabitacion) {
    	String respuesta = app.checkOut(IDHabitacion);
    	return respuesta;
    }
    public void cargarHotel(String habitaciones, String inventario, String servicio, String restaurante, String temporada){
        app.cargarHotel(habitaciones, inventario, servicio, restaurante, temporada);
    }
    public void cargarHabitacionesManual(String idHabitacion,String tipo,String ubicacion, int capacidadNino, int capaciodadAdulto, Boolean balcon, Boolean cocina, Boolean vista, float PrecioI){
        app.cargarHabitacionesManual(idHabitacion, tipo, ubicacion, capacidadNino, capaciodadAdulto, balcon, cocina, vista, PrecioI);
    }
    public void cargarServiciosManual(String tipo, String nombre, float precio, String horaInicio, String horaFinal){
        app.cargarServiciosManual(tipo, nombre, precio, horaInicio, horaFinal);
    }
    
    public String consultarInventario(int opcion, String producto) {
    	String respuesta = app.consultarInventario(opcion, producto);
    	return respuesta;
    }
    
    public String consultarHabitacion(int opcion, String IDHabitacion, int inicialAnio, int inicialMes, int inicialDia) {
    	String respuesta = app.consultarHabitacion(opcion, IDHabitacion, inicialAnio, inicialMes, inicialDia);
    	return respuesta;
    }

    public String[] agregarConsumo(String habitacion, String servicio, int tipo){
        String [] resultado = app.agregarConsumo(habitacion, servicio, tipo);
        return resultado;
    }
    
    
    
    
    public static void main(String [] args) {
        InterfazLogin ip = new InterfazLogin();
    }
}
