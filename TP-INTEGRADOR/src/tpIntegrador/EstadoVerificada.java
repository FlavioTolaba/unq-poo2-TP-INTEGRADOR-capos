package tpIntegrador;

public class EstadoVerificada extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual(Muestra muestra) {
		return muestra.getTipoVinchuca();
	}

	@Override
	public boolean puedeOpinar(Opinion opinion, Muestra muestra) {
		return false;
	}

	@Override
	public void actualizarEstado(Opinion opinion, Muestra muestra) {}

	@Override
	public boolean estaVerificada() {
		return true;
	}

	
}
