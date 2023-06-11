package tpIntegrador;

public class Opinion {
	
	private TipoOpinion tipoOpinion;
	private Participante participante;

	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,Participante participante) {
		this.tipoOpinion = tipoOpinion;
		this.participante = participante;
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

}
