package tpIntegrador;

public class ParticipanteExperto extends Participante {
	

	public ParticipanteExperto(String nombre, long id) {
		super(nombre, id);
	}

	@Override
	public void actualizarClaseParticipante() {
		
		if(this.esExperto()) {
			this.setTipoParticipante(ClaseParticipante.EXPERTO);
		} else {
			this.setTipoParticipante(ClaseParticipante.BASICO);
		}
		
	}
}
