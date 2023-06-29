package tpIntegrador;

public abstract class EstadoVerificacion {

	public abstract TipoOpinion resultadoActual(Muestra muestra) ;
	public abstract boolean puedeOpinar(Opinion opinion,Muestra muestra) ;
	public abstract void actualizarEstado(Opinion opinion, Muestra muestra);
	public abstract boolean estaVerificada() ;
}
