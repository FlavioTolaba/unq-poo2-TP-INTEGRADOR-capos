package tpIntegrador;

public class ParticipanteSinEstudio extends Participante{
	
	

	public ParticipanteSinEstudio(String nombre, long id) {
		super(nombre, id);
	}

	@Override
	public boolean esExperto() {
		this.actualizarClaseParticipante();
		if(this.getClaseParticipante() == ClaseParticipante.EXPERTO) {
			return true;
		}
		else {return false;}
	}
	
	 public void actualizarClaseParticipante() {
	    	if( this.getCantidadDeMuestrasEnviadas()>=10 && this.getCantidadDeOpinionesEnviadas()>=20) {
	    		this.setTipoParticipante(ClaseParticipante.EXPERTO);
	    	}
	    		
	 }


}