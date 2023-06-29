package tpIntegrador;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Muestra implements MuestraObservable {

	private long idParticipante;
	private String foto;
	private LocalDate fechaCreacion;
	private List<Opinion> opiniones;
	private Ubicacion ubicacion;
	private TipoOpinion tipoVinchuca;
	private EstadoVerificacion estado;
	private List<ObservadorMuestra> observadores;

	
	public Muestra(long idParticipante, String foto,Ubicacion ubicacion) {
		this.idParticipante = idParticipante;
		this.foto = foto;
		this.ubicacion = ubicacion;
		this.fechaCreacion = LocalDate.now();
		this.opiniones = new ArrayList<Opinion>();
		this.observadores = new ArrayList<ObservadorMuestra>();
		this.estado = new EstadoSinExperto();
		
	}

	public LocalDate getDate() {
		return fechaCreacion;
	}
	
	public long getIdParticipante() {
		return idParticipante;
	}

	public List<Opinion> getOpiniones() {
		return opiniones;
	}

	public TipoOpinion getTipoVinchuca() {
		return tipoVinchuca;
	}

	public void setTipoVinchuca(TipoOpinion result) {
		this.tipoVinchuca = result;
	}

	public void agregarOpinion(Opinion opinion) {
		this.opiniones.add(opinion);
	}
	
	//se verifica si un participante puede opinar, verificando las opiniones anteriores
	public void recibirOpinion(Opinion opinion) {
		if(estado.puedeOpinar(opinion,this) && opinion.getIdParticipante() != this.idParticipante) {
			this.agregarOpinion(opinion);
			estado.actualizarEstado(opinion,this);
		}
	}	

	public TipoOpinion resultadoActual() {
		return estado.resultadoActual(this);
	}
	
	public boolean estaVerificada() {
		return estado.estaVerificada();
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
//agregarUML
	public int getCantidadExpertos() {
		return this.getOpiniones().stream().filter(opinion -> opinion.esOpinionExperto()).toList().size();
	}
//agregarUML
	public void cambiarEstado(EstadoVerificacion nuevoEstado) {
		this.setEstado(nuevoEstado);
		
	}

	private void setEstado(EstadoVerificacion nuevoEstado) {
		this.estado = nuevoEstado;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public List<ObservadorMuestra> getObservadores() {
		return this.observadores;
		
	}

		
}


