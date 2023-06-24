package tpIntegrador;

import java.time.LocalDate;

public class Opinion {
	
	private TipoOpinion tipoOpinion;
	private Participante participante;
	private LocalDate fechaOpinion;
	

	public TipoOpinion getTipoOpinion() {
		return this.tipoOpinion;
	}

	public Opinion(TipoOpinion tipoOpinion,Participante participante) {
		this.tipoOpinion = tipoOpinion;
		this.participante = participante;
		this.fechaOpinion = LocalDate.now();
	}

	public void setTipoOpinion(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}


	public LocalDate getFechaOpinion() {
		
		return fechaOpinion;
	}

}
