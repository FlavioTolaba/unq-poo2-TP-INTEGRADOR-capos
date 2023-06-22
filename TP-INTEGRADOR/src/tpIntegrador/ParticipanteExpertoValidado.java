package tpIntegrador;

public class ParticipanteExpertoValidado extends Participante{

	public ParticipanteExpertoValidado(String nombre, long id) {
		super(nombre, id);
		this.setClaseParticipante(ClaseParticipante.EXPERTO);
	}

	@Override
	public void actualizarClaseParticipante() {
		
		this.setClaseParticipante(ClaseParticipante.EXPERTO);
			
	}

}
