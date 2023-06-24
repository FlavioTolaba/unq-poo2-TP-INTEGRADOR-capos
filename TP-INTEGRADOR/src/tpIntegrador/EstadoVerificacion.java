package tpIntegrador;

public abstract class EstadoVerificacion {

	public abstract TipoOpinion resultadoActual() ;
	public abstract boolean puedeOpinar(Participante participante) ;
	public abstract void actualizarEstado();
	public abstract boolean estaVerificada() ;
}
