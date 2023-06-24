package tpIntegrador;

import java.time.LocalDate;

public class Opinion {
	
	private TipoOpinion tipoOpinion; 
	private Participante participante;
	private LocalDate fechaEmision;
	
	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,Participante participante) {
		this.tipoOpinion = tipoOpinion;
		this.participante = participante;
		this.fechaEmision=LocalDate.now();
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}

	public long getIdParticipante() {
		return participante.getId();
	}
	
	public boolean esOpinionDeExperto() {
		return participante.esExperto();
	}

	public LocalDate getFechaOpinion() {
		return fechaEmision;
	}
	
	
}
