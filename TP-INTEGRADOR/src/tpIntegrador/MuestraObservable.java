package tpIntegrador;

public interface MuestraObservable {
	
	public void añadirObservador(ObservadorMuestra observador); 
	public void eliminarObservador(ObservadorMuestra observador); 
	public void notificarObservadoresNuevaMuestra(); 
	public void notificarObservadoresValidacion();
}
