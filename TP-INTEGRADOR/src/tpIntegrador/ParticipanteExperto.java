package tpIntegrador;

public class ParticipanteExperto extends Participante {
	
	public ParticipanteExperto(String nombre) {
        super( nombre);
    }
	
	@Override
	
	public ClaseParticipante getNivelUsuario() {
		return ClaseParticipante.EXPERTO;
	}


}
