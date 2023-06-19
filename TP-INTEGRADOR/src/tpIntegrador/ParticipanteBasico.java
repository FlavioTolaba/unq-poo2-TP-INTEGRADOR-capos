package tpIntegrador;

public class ParticipanteBasico extends TipoParticipante{

	
	@Override
	public void actualizarTipo(Participante participante) {
	
		if(!this.esExperto(participante)) {
			
			participante.setTipoParticipante(new ParticipanteBasico());
		
	}
}


}