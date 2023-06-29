package tpIntegrador;

public class ParticipanteConEstudio extends Participante{

	public ParticipanteConEstudio(String nombre, long id) {
		super(nombre, id);
		this.setClaseParticipante(ClaseParticipante.EXPERTO);
	}

	@Override
	public void actualizarClaseParticipante() {}
	
	@Override
	public boolean esExperto() {
		return true;
	}
	

}
