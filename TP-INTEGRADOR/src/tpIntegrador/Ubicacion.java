package tpIntegrador;

import java.util.List;

public class Ubicacion {

	private double longitudX;
	private double latitudY;
	
	//creo que esta clase deberia tener un administrador que haga los calculos y que esta clase quede para usarse
	//como un atributo que sea una tupla, ya que hace calculos con la muestra que deberia hacerlos un calculador
	//pero ya no hay tiempo para ese tipo de refactors

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
	
	public List<Ubicacion> ubicacionesEnRango(double distancia,List<Ubicacion> listaUbicaciones) {
		 return listaUbicaciones.stream().
				 filter(ubicacion -> this.distanciaEntreDosUbicaciones(this,ubicacion) <=  distancia).toList();
	}

	//retorna las muestras de la lista provista que esten a menos distancia de la muestra dada.
	
	private List<Muestra> muestrasEnRangoDeMuestra(Muestra muestraX,double distancia,List<Muestra> listaMuestras) {
		return listaMuestras.stream().filter(muestra -> this.distanciaEntreDosUbicaciones(muestraX.getUbicacion(), muestra.getUbicacion()) <= distancia).toList();
	}
	
}
