package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;  
import javax.swing.SwingUtilities;

import org.knowm.xchart.BoxChart;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.theme.Theme;
import org.knowm.xchart.style.theme.XChartTheme;  

public class Reportes {
	private static final String CategoryStyler = null;
	private Hotel hotel;
	
	//int ancho = 60;
	//Theme este = new XChartTheme();
	//BoxChart ejemplo = new BoxChart(ancho, ancho, este);
	
	public Reportes(Hotel hotel) {
		this.hotel=hotel;
	}
	
	public void reporteCantidad(){
		HashMap mapa = hotel.getMapaCantidad();
		Set llaves = mapa.keySet();
		Iterator<String> itr = llaves.iterator();
		int[] xData = new int[mapa.size()];
		int[] yData = new int[mapa.size()];
		int contador = 0;
		String mensaje = "Producto, donde ";
			while (itr.hasNext()) {
				int numero = contador +1;
				String key =itr.next();
				int valor = (int) mapa.get(key);
				int[] lista = {valor};
				xData[contador] = numero;
				yData[contador] = valor;
				mensaje = mensaje + numero + " es " + key + ", "; 
				contador+=1;
		}
		
			 CategoryChart chart = new CategoryChartBuilder()
		                .width(800)
		                .height(600)
		                .title("Reporte cantidad consumos")
		                .xAxisTitle(mensaje)
		                .yAxisTitle("Cantidad consumida")
		                .build();

		        // Customize the chart's style
		        chart.getStyler().setLegendVisible(false);
		        chart.getStyler().setXAxisLabelRotation(45);

		        // Add data to the chart
		        chart.addSeries("Cantidad de consumos por producto", xData, yData);

		        // Display the chart
		        new SwingWrapper<>(chart).displayChart();
		    
		
	}
	
	public void reporteValorTotal(){
		HashMap mapaCant = hotel.getMapaCantidad();
		HashMap mapaPrec = hotel.getMapaPrecios();
		ArrayList<Inventario> inventarios = hotel.getInventarios();
		double[] listaPrecios = new double[mapaCant.size()];
		Set llaves = mapaCant.keySet();
		Iterator<String> itr = llaves.iterator();
		int[] xData = new int[mapaCant.size()];
		int[] yData = new int[mapaCant.size()];
		int contador = 0;
		String mensaje = "Producto, donde ";
		
			while (itr.hasNext()) {
				int numero = contador +1;
				String key =itr.next();
				int cantidad = (int) mapaCant.get(key);
				int precio = (int) mapaPrec.get(key);
				int valor = cantidad*precio;
				float[] lista = {valor};
				xData[contador] = numero;
				yData[contador] = valor;
				mensaje = mensaje + numero + " es " + key + ", "; 
				contador+=1;
		}
		
			 CategoryChart chart = new CategoryChartBuilder()
		                .width(800)
		                .height(600)
		                .title("Reporte cantidad consumos")
		                .xAxisTitle(mensaje)
		                .yAxisTitle("Cantidad consumida")
		                .build();

		        // Customize the chart's style
		        chart.getStyler().setLegendVisible(false);
		        chart.getStyler().setXAxisLabelRotation(45);

		        // Add data to the chart
		        chart.addSeries("Valor recibido por cad producto consumido", xData, yData);

		        // Display the chart
		        new SwingWrapper<>(chart).displayChart();
	}
	public void precioPorNoche() {
		int[] xData = {1,2,3};
		int[] yData = {50000, 70000, 100000};
		String mensaje = "Tipo de habitación donde 1 es Habitación Estándar, 2 es Suite y 3 es DobleSuite";
		 CategoryChart chart = new CategoryChartBuilder()
	                .width(800)
	                .height(600)
	                .title("Precio por tipo de Habitación")
	                .xAxisTitle(mensaje)
	                .yAxisTitle("Precio")
	                .build();

	        // Customize the chart's style
	        chart.getStyler().setLegendVisible(false);
	        chart.getStyler().setXAxisLabelRotation(45);

	        // Add data to the chart
	        chart.addSeries("Series", xData, yData);

	        // Display the chart
	        new SwingWrapper<>(chart).displayChart();
	}
	
		    
}
