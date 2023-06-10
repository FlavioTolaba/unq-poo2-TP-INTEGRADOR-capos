package tpIntegrador;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Muestra {

	private int idParticipante;
	private String foto;
	private LocalDate date;
	private List<Opinion> opiniones= new ArrayList<>();
	private TipoOpinion resultadoActual;
	
	public Muestra(int idParticipante, String foto, LocalDate date, List<Opinion> opiniones) {
		super();
		this.idParticipante = idParticipante;
		this.foto = foto;
		this.date = date;
		this.opiniones = opiniones;
	}

	public int getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Opinion> getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(List<Opinion> opiniones) {
		this.opiniones = opiniones;
	}
	

	public TipoOpinion getResultadoActual() {
		return resultadoActual;
	}

	public void setResultadoActual(TipoOpinion resultadoActual) {
		this.resultadoActual = resultadoActual;
	}

	public void agregarOpinion(Opinion opinion) {
		this.getOpiniones().add(opinion);
	}
	
	public boolean tieneUnaOpinionDeParticipante(Participante participante) {
		return this.getOpiniones().stream().anyMatch(p -> p.getParticipante().equals(participante));
	}
	
	
	//metodos
	public void resultadoActual(Muestra muestra) {
		//recorrer lista hasta encontrar 3 opiniones que coincidan primero. puede ser con un findFirst u otro metodo.
		//this.getOpiniones().stream().forEach(opinion -> opinion.getTipoOpinion());
		Optional<Opinion> result = muestra.getOpiniones().stream()
				.filter(e -> Collections.frequency(opiniones, e.getTipoOpinion()) >= 3).findFirst();
		
		if (result.isPresent()) {
			this.setResultadoActual(result.get().getTipoOpinion());
		}}}

		//this.setResultadoActual(resultadoActual);
	//}
	//debo crear al parcipante Experto
//	public boolean verificada(Tipo) {
	//	return muestra.
//	}


