package tpIntegrador;


import java.util.List;

public class ZonaDeCobertura implements ZonaDeCoberturaObservable {
	private Ubicacion epicentro;
	private int radio;
	private String nombre;
	private List<Muestra> muestrasReportadas;
	private List<ObservadorZonaDeCobertura> organizacionesSuscriptas;

	@Override
	public void añadirObservador(ObservadorZonaDeCobertura observador) {
		this.organizacionesSuscriptas.add(observador);
		
	}
	@Override
	public void eliminarObservador(ObservadorZonaDeCobertura observador) {
		this.organizacionesSuscriptas.remove(observador);
		
	}
	@Override
	public void notificarObservadoresNuevaMuestra(Muestra muestra) {
		this.organizacionesSuscriptas.forEach(organizacion -> organizacion.recibirNotificacionNuevaMuestra(muestra));
		
	}
	@Override
	public void notificarObservadoresValidacion(Muestra muestra) {
		this.organizacionesSuscriptas.forEach(organizacion -> organizacion.recibirNotificacionValidacion(muestra));
		
	} 
	
/*	public ArrayList<ZonaDeCobertura> zonasSolapadas(){
		
		return 
	}
*/
/*
	private ArrayList<Muestra> muestrasReportadas;

	public ArrayList<ZonaDeCobertura> zonasSolapadas(){
		
		return 
	}
*/

}



