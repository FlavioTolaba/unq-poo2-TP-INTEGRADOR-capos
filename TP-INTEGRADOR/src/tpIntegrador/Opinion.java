package tpIntegrador;

public class Opinion {
	
	private TipoOpinion tipoOpinion;
	private Participante participante;

	public TipoOpinion getTipoOpinion() {
		// TODO Auto-generated method stub
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion) {
		super();
		this.tipoOpinion = tipoOpinion;
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
