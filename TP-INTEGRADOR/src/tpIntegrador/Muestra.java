package tpIntegrador;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Muestra {

	private Long idParticipante;
	private String foto;
	private LocalDate date;
	private List<Opinion> opiniones;
	private Ubicacion ubicacion;
	private Optional<Opinion> tipoVinchuca;
	
	public Muestra(long idParticipante, String foto,Ubicacion ubicacion, Opinion opinion) {
		this.idParticipante = idParticipante;
		this.foto = foto;
		this.ubicacion = ubicacion;
		this.date = LocalDate.now();
		this.opiniones = new ArrayList<Opinion>();

		
	}

	public long getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(long idParticipante) {
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
	

	public Optional<Opinion> getTipoVinchuca() {
		return tipoVinchuca;
	}

	public void setTipoVinchuca(Optional<Opinion> result) {
		this.tipoVinchuca = result;
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
			this.setTipoVinchuca(result);;
		}}

	public void recibirOpinion(Opinion opinion) {
		// TODO Auto-generated method stub
		
	}
	}

		//this.setResultadoActual(resultadoActual);
	//}
	//debo crear al parcipante Experto
//	public boolean verificada(Tipo) {
	//	return muestra.
//	}


