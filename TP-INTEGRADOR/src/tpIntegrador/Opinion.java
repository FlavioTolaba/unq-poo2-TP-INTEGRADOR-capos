package tpIntegrador;

import java.time.LocalDate;

public class Opinion {
	
	private TipoOpinion tipoOpinion; 
	private Participante participante;
	private LocalDate fechaEmision;
	private boolean esOpinionExperto;
	
	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,Participante participante) {
		this.tipoOpinion = tipoOpinion;
		this.participante = participante;
		this.esOpinionExperto =participante.esExperto();
		this.fechaEmision=LocalDate.now();
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}

	public long getIdParticipante() {
		return participante.getId();
	}
	
	public boolean getOpinonExperto() {
		return this.esOpinionExperto;
	}

	public LocalDate getFechaOpinion() {
		return fechaEmision;
	}
	
	public boolean esOpinionExperto() {
		return this.esOpinionExperto;
}
}
