package tpIntegrador;

public class Opinion {
	
	private TipoOpinion tipoOpinion;
	private long idParticipante;

	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,long id) {
		this.tipoOpinion = tipoOpinion;
		this.idParticipante = id;
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}

/*	public Participante getParticipante() {
		return participante;
	}
*/
	public void setIdParticipante(long id) {
		this.idParticipante = id;
	}

}
