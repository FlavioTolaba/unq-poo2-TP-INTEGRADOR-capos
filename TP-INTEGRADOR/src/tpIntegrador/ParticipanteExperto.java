package tpIntegrador;

public class ParticipanteExperto extends TipoParticipante {
	

	@Override
	public void actualizarTipo(Participante participante) {
		
		if(this.esExperto(participante)) {
			participante.setTipoParticipante(new ParticipanteExperto());
		}
		
	}
}
