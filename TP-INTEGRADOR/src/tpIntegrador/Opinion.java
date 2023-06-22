package tpIntegrador;

import java.time.LocalDate;

public class Opinion {
	
	private TipoOpinion tipoOpinion;
	private boolean opnionExperto; 
	private Participante participante;
	private LocalDate fechaEmision;
//ss	
	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,Participante participante) {
		this.tipoOpinion = tipoOpinion;
		this.participante = participante;
		this.fechaEmision=LocalDate.now();
		this.opnionExperto = participante.esExperto();
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}

	public long getIdParticipante() {
		return participante.getId();
	}

}
