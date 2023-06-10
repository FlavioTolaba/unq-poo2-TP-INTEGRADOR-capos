package tpIntegrador;

public interface UObservable {

	public void añadirObservador(Observador observador); 
	public void eliminarObservador(Observador observador); 
	public void notificarObservadores(); 
}
