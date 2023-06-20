package tpIntegrador;

public interface ZonaDeCoberturaObservable {

	public void añadirObservador(ObservadorZonaDeCobertura observador); 
	public void eliminarObservador(ObservadorZonaDeCobertura observador); 
	public void notificarObservadoresNuevaMuestra(Muestra muestra); 
	public void notificarObservadoresValidacion(Muestra muestra);
}
