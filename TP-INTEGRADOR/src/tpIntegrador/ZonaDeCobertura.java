package tpIntegrador;


import java.util.ArrayList;
import java.util.List;

public class ZonaDeCobertura implements ObservadorMuestra{
	private Ubicacion epicentro;
	private int radio;
	private String nombre;
	private List<Muestra> muestrasReportadas;
	private List<ObservadorZonaDeCobertura> organizacionesSuscriptas;


	
	public ZonaDeCobertura(Ubicacion epicentro, int radio, String nombre) {
		this.epicentro = epicentro;
		this.radio = radio;
		this.nombre = nombre;
		this.muestrasReportadas = new ArrayList<Muestra>();
		this.organizacionesSuscriptas = new ArrayList<ObservadorZonaDeCobertura>();
	}

	public void añadirObservador(ObservadorZonaDeCobertura observador) {
		this.organizacionesSuscriptas.add(observador);
		
	}
	
	public void eliminarObservador(ObservadorZonaDeCobertura observador) {
		this.organizacionesSuscriptas.remove(observador);
		
	}
	
	public void notificarObservadoresNuevaMuestra(Muestra muestra) {
		this.organizacionesSuscriptas.forEach(organizacion -> organizacion.recibirNotificacionNuevaMuestra(muestra));
		
	}
	
	public void notificarObservadoresValidacion(Muestra muestra) {
		this.organizacionesSuscriptas.forEach(organizacion -> organizacion.recibirNotificacionValidacion(muestra));
		
	}

	@Override
	public void recibirNotificacionValidacion(Muestra muestra) {
		if(this.estaEnCoberturaMuestra(muestra)){
			this.notificarObservadoresValidacion(muestra);		
	}
	}
	@Override
	public void recibirNotificacionNuevaMuestra(Muestra muestra) {
		if(this.estaEnCoberturaMuestra(muestra)){
				this.notificarObservadoresNuevaMuestra(muestra);
				this.muestrasReportadas.add(muestra);
				muestra.añadirObservador(this);
		}	
	} 
	
	
	public boolean estaEnCoberturaMuestra(Muestra muestra) {
		return this.epicentro.distanciaEntreDosUbicaciones(epicentro, muestra.getUbicacion()) <= radio;
	}
	
	public boolean estaEnCoberturaZona(ZonaDeCobertura zona) {
		return this.epicentro.distanciaEntreDosUbicaciones(epicentro, zona.getUbicacion()) <= radio;
	}
	
	
	
	private Ubicacion getUbicacion() {
		return this.epicentro;
	}

	public ArrayList<ZonaDeCobertura> zonasSolapadas(List<ZonaDeCobertura> listaZonas){
		ArrayList<ZonaDeCobertura> zonasSolapadas = new ArrayList<ZonaDeCobertura>();
		for(ZonaDeCobertura zona : listaZonas) {
			if(this.estaEnCoberturaZona(zona)) {
				zonasSolapadas.add(zona);
			}
		}
		return zonasSolapadas;
	}
	
	public List<Muestra> obtenerMuestrasReportadas(){
		return this.muestrasReportadas;
	}
}






