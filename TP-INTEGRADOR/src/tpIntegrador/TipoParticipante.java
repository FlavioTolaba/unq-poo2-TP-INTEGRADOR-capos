package tpIntegrador;

public abstract class TipoParticipante {
	
	public boolean esExperto(Participante participante) {

		return participante.getCantidadDeMuestrasEnviadas()>=10 && participante.getCantidadDeOpinionesEnviadas()>=20;

	}
	
	public abstract void actualizarTipo(Participante participante);

	

}
