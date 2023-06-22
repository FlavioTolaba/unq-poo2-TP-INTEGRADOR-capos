package tpIntegrador;

public class ParticipanteBasico extends Participante{

	
	public ParticipanteBasico(String nombre, long id) {
		super(nombre, id);
	}

	@Override
	public void actualizarTipo() {
	
		if(!this.esExperto()) {
			
			this.setTipoParticipante(ClaseParticipante.BASICO);
	} else {
			this.setTipoParticipante(ClaseParticipante.EXPERTO);
	}
}


}