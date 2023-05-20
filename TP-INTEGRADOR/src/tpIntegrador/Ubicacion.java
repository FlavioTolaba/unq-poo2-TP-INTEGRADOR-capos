package tpIntegrador;

import java.util.List;

public class Ubicacion {
	private double longitudX;
	private double latitudY;
	
	
	public Ubicacion(double longitudX, double latitudY) {
		this.longitudX = longitudX;
		this.latitudY = latitudY;
	}


	public double getLongitudX() {
		return this.longitudX;
	}


	public double getLatitudY() {
		return this.latitudY;
	}
	
	public double distanciaEntreDosUbicaciones(Ubicacion ubicacion1,Ubicacion ubicacion2) {
		double x1=ubicacion1.getLongitudX();
		double x2=ubicacion2.getLongitudX();
		double y1=ubicacion1.getLatitudY();
		double y2=ubicacion2.getLatitudY();
		double resultado=(Math.pow(x2-x1,2)) + (Math.pow(y2 - y1,2));
		double resultadoFinal=Math.sqrt(resultado);
		return resultadoFinal;
	}
	
	public List<Ubicacion> ubicacionesEnRango(double distancia,List<Ubicacion> listaUbicaciones,Ubicacion ubicacion2) {
		 return listaUbicaciones.stream()
				 .filter(
						 ubicacion -> this.distanciaEntreDosUbicaciones(ubicacion, ubicacion2) <=  distancia).toList();
	}


}
