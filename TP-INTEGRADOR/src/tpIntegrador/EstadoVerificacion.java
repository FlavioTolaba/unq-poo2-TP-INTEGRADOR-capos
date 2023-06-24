package tpIntegrador;

public abstract class EstadoVerificacion {

	public abstract TipoOpinion resultadoActual(Muestra muestra) ;
	public abstract boolean puedeOpinar(Opinion opinion) ;
	public abstract void actualizarEstado();
	public abstract boolean estaVerificada() ;
}
