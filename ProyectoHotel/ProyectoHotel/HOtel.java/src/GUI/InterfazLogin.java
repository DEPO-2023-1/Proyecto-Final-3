package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Clases.App;
import Clases.Grupo;
import Clases.Hotel;


import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;
    private PanelCalendario PanelCalendario;
    private App app;
    private ArrayList<Integer> matriz;
    public static Hotel hotel;

    public InterfazLogin(App app){
    	this.app = app;
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
		setResizable(true);

        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        pack( );

        JOptionPane.showMessageDialog(null, "Usuario: admin, Contrasenia: admin \n Usuario: empleado, Contrasenia: empleado \n Usuario: recepcionista, Contrasenia: recepcionista", "importante", 1, null);

    }
    public boolean login(int tipo) {
    	String usuario = PanelCentro.getTxtNum1();
    	String contrasena = PanelCentro.getTxtNum2();
    	boolean ingreso = App.seleccionarUsuario(usuario, contrasena, tipo);

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
        return ingreso;
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
    public void cargarHabitacionesManual(String idHabitacion,String tipo,String ubicacion, int capacidadNino, int capaciodadAdulto,
    		Boolean balcon, Boolean cocina, Boolean vista, float PrecioI, int tamanio, Boolean aire, Boolean calefaccion, String tamCama, Boolean tv, Boolean cafetera,
			Boolean elemHipoalergenicos, Boolean plancha, Boolean secador, Boolean voltajeAC, Boolean usbA,
			Boolean usbC, Boolean desayuno){
		app.cargarHabitacionesManual(idHabitacion, tipo, ubicacion, capacidadNino, capaciodadAdulto,
				balcon, cocina, vista, PrecioI, tamanio, aire, calefaccion, tamCama, tv, cafetera,
				elemHipoalergenicos, plancha, secador, voltajeAC, usbA, usbC, desayuno);
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
    public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}


    public void dispose( )
    {
       
        try
        {
            app.salvarApp( );
            super.dispose( );
        }
        catch( Exception e )
        {
            setVisible( true );
            int respuesta = JOptionPane.showConfirmDialog( this, "Problemas salvando la información de la app:\n" + e.getMessage( ) + "\n¿Quiere cerrar el programa sin salvar?", "Error", JOptionPane.YES_NO_OPTION );
            if( respuesta == JOptionPane.YES_OPTION )
            {
                super.dispose( );
            }
        }
    }
    
    public static void main(String [] args)  {

        App app = null;

        try{
            app = new App("ProyectoHotel/ProyectoHotel/HOtel.java/data/app.txt");
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            System.exit( 1 );
        }
        InterfazLogin interfazLogin = new InterfazLogin(app);
        interfazLogin.setVisible(true);
    }
}
