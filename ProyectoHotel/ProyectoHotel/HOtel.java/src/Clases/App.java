package Clases;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;




public class App {

    private static final String LOG_FILE = "./data/error.log";
	public static Hotel hotel;
	
	//public static Frame frame;
	private String archivoApp;
	
	public App(String nombreArchivoApp) throws FileNotFoundException, IOException, ClassNotFoundException {

		this.archivoApp = nombreArchivoApp;
		File archivo = new File( nombreArchivoApp );
        if( archivo.exists( ) ){
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream( archivoApp ) );
            hotel = ( Hotel )ois.readObject( );
            ois.close( );
		}
		else{
			hotel = new Hotel();
		}


		
	}

    public static boolean seleccionarUsuario(String login, String contraseña, int usuario){
    	boolean respuesta = hotel.seleccionarUsuario(login, contraseña, usuario);
    	return respuesta;
    }
    
    public String[] disponible(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, int canNinos, int canAdultos) {
    	String[] respuesta = hotel.reservaDisponible(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, canNinos, canAdultos);
    	return respuesta;
    }
    
    public Grupo newGrupo(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
   	 Grupo grupo = hotel.newGrupo(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
   	 return grupo;
    }
    
    public void agregarHuespedGrupo(Grupo grupo, String nombre, int cedula, int edad, String correo){
    	hotel.agregarHuespedGrupo(grupo, nombre, cedula, edad, correo);
    }
    
    public void crearReserva(Grupo grupo, int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	hotel.crearReserva(grupo, inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    public void cancelarReserva(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	hotel.cancelarReserva(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    public String checkOut(String IDHabitacion) {
    	String respuesta = hotel.checkOut(IDHabitacion);
    	return respuesta;
    }
    
    public String consultarInventario(int opcion, String producto) {
    	String respuesta = hotel.consultarInventario(opcion, producto);
    	return respuesta;
    }
    public String consultarHabitacion(int opcion, String IDHabitacion, int inicialAnio, int inicialMes, int inicialDia) {
    	String respuesta = hotel.consultarHabitacion(opcion, IDHabitacion, inicialAnio, inicialMes, inicialDia);
    	return respuesta;
    }

    
    public ArrayList<Integer> listaFechas(){
    	return hotel.listaFechas();
    }
    

	public String[] agregarConsumo(String habitacion, String servicio, int tipo){
		String [] resultado = hotel.agregarConsumo(habitacion, servicio, tipo);
		return resultado;
	}
	
	public void cargarHotel(String habitaciones, String inventario, String servicio, String restaurante, String temporada){
		try {
			hotel.cargarHotel(habitaciones, inventario, servicio, restaurante, temporada);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void cargarHabitacionesManual(String idHabitacion,String tipo,String ubicacion, int capacidadNino, int capaciodadAdulto,
    		Boolean balcon, Boolean cocina, Boolean vista, float PrecioI, int tamanio, Boolean aire, Boolean calefaccion, String tamCama, Boolean tv, Boolean cafetera,
			Boolean elemHipoalergenicos, Boolean plancha, Boolean secador, Boolean voltajeAC, Boolean usbA,
			Boolean usbC, Boolean desayuno){
		hotel.cargarHabitacionesManual(idHabitacion, tipo, ubicacion, capacidadNino, capaciodadAdulto,
				balcon, cocina, vista, PrecioI, tamanio, aire, calefaccion, tamCama, tv, cafetera,
				elemHipoalergenicos, plancha, secador, voltajeAC, usbA, usbC, desayuno);
	}
    public void cargarServiciosManual(String tipo, String nombre, float precio, String horaInicio, String horaFinal){
		hotel.cargarServiciosManual(tipo, nombre, precio, horaInicio, horaFinal);
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
    

	public static void serializarObjeto(Hotel hotel) {
        try (FileOutputStream fos = new FileOutputStream("hotel.bin");
                ObjectOutputStream salida = new ObjectOutputStream(fos);) {
            salida.writeObject(hotel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static Hotel deserializarObjeto(Class<Hotel> claseObjetivo) {
        Hotel objeto = null;
        try (FileInputStream fis = new FileInputStream("hotel.bin");
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (Hotel) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }

	public void salvarApp( ) throws PersistenciaException 
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( archivoApp ) );
            oos.writeObject( hotel );
            oos.close( );
        }
        catch( IOException e )
        {
            registrarError( e );
            throw new PersistenciaException( "Error al salvar: " + e.getMessage( ) );
        }
    }

	public void registrarError( Exception excepcion )
    {
        try
        {
            FileWriter out = new FileWriter( LOG_FILE, true );
            PrintWriter log = new PrintWriter( out );
            log.println( "---------------------------------------" );
            log.println( "App.java :" );
            log.println( "---------------------------------------" );
            excepcion.printStackTrace( log );
            log.close( );
            out.close( );
        }
        catch( IOException e )
        {
            excepcion.printStackTrace( );
            e.printStackTrace( );
        }
    }
	
}
