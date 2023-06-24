package tpIntegrador;


import java.util.List;

public class ZonaDeCobertura implements ObservadorMuestra{
	private Ubicacion epicentro;
	private int radio;
	private String nombre;
	private List<Muestra> muestrasReportadas;
	private List<ObservadorZonaDeCobertura> organizacionesSuscriptas;

	
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
		if(this.estaEnCobertura(muestra)){
			this.notificarObservadoresValidacion(muestra);		
	}
	}
	@Override
	public void recibirNotificacionNuevaMuestra(Muestra muestra) {
		if(this.estaEnCobertura(muestra)){
				this.notificarObservadoresNuevaMuestra(muestra);
				this.muestrasReportadas.add(muestra);
				muestra.añadirObservador(this);
		}	
	} 
	
	
	//implementar msj
	public boolean estaEnCobertura(Muestra muestra) {
		return true;
	}
	
	
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





