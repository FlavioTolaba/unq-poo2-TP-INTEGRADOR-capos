package tpIntegrador;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Muestra implements MuestraObservable {

	private long idParticipante;
	private String foto;
	private LocalDate fechaCreacion;
	private List<Opinion> opiniones;
	private Ubicacion ubicacion;
	private TipoOpinion tipoVinchuca;
	private List<ObservadorMuestra> observadores;
	
	public Muestra(long idParticipante, String foto,Ubicacion ubicacion) {
		this.idParticipante = idParticipante;
		this.foto = foto;
		this.ubicacion = ubicacion;
		this.fechaCreacion = LocalDate.now();
		this.opiniones = new ArrayList<Opinion>();
		this.observadores = new ArrayList<ObservadorMuestra>();
		
		
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
	

	public TipoOpinion getTipoVinchuca() {
		return tipoVinchuca;
	}

	public void setTipoVinchuca(TipoOpinion result) {
		this.tipoVinchuca = result;
	}

	public void agregarOpinion(Opinion opinion) {
		this.getOpiniones().add(opinion);
	}
	
	public void verificar() {
		
	}

	public void resultadoActual() {}
	
	public void recibirOpinion(Opinion opinion) {
		
		if(! this.getOpiniones().contains(opinion) && this.puedeOpinar(opinion)) {
		
			this.agregarOpinion(opinion);
		
		}
	}
	//se verifica si un participante puede opinar, verificando las opiniones anteriores
	private boolean puedeOpinar(Opinion opinion) {
		if()
	}

	@Override
	public void añadirObservador(ObservadorMuestra observador) {
		this.observadores.add(observador);
		
	}

	@Override
	public void eliminarObservador(ObservadorMuestra observador) {
		this.observadores.remove(observador);
		
	}

	@Override
	public void notificarObservadoresNuevaMuestra() {
		this.observadores.forEach(observador -> observador.recibirNotificacionNuevaMuestra(this));
	}

	@Override
	public void notificarObservadoresValidacion() {
		this.observadores.forEach(observador -> observador.recibirNotificacionValidacion(this));
	}

		
}


