package tpIntegrador;

public class ParticipanteExperto extends Participante {
	
	public ParticipanteExperto(String nombre) {
        super( nombre, id);
    }
	 @Override

	    public ClaseParticipante getNivelUsuario() {
	        return ClaseParticipante.EXPERTO;
	    }
}
