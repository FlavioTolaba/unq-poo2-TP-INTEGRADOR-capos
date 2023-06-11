package tpIntegrador;

public class ParticipanteExperto extends Participante {
	
	public ParticipanteExperto(String nombre, long i) {
        super(nombre, i);
    }
	
	@Override
	
	public ClaseParticipante getNivelUsuario() {
		return ClaseParticipante.EXPERTO;
	}


}
