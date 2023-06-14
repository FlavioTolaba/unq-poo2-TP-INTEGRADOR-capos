package tpIntegrador;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class LosMasVinchucas implements UObservable {
	private List<Participante> participantes;
	private List<Muestra> muestras;
	private List<Organizacion> organizaciones;
	private List<Observador> observadores = new ArrayList<Observador>();
	
	@Override
	public void añadirObservador(Observador observador) {
		this.observadores.add(observador);
		
	}
	@Override
	public void eliminarObservador(Observador observador) {
		this.observadores.remove(observador);		
	}
	@Override
	public void notificarObservadores(Muestra muestra) {
	observadores.forEach(observador -> observador.recibirNotificacion(muestra));
	}

	public LosMasVinchucas() {
		this.participantes = new ArrayList<Participante>();
		this.muestras = new ArrayList<Muestra>();
		this.organizaciones = new ArrayList<Organizacion>();
		this.observadores = new ArrayList<Observador>();
	}
	
	public void participanteCargaMuestra(String foto,Participante participante,Ubicacion ubicacion,TipoOpinion opinionNueva){
		Opinion opinion=new Opinion(opinionNueva,participante);
		Muestra muestra=new Muestra(participante.getId(),foto,ubicacion,opinion);
		this.muestras.add(muestra);
		participante.enviarMuestra(muestra);
		this.notificarObservadores(muestra);
		
		}

	public void registrarParticipante(Participante participante) {
		this.participantes.add(participante);
	}


	public List<Observador> getObservadores() {
		return this.observadores;
	}
	public List<Participante> getParticpantes() {
		return this.participantes;
	}
	
	public List<Muestra> getMuestras() {
		return muestras;
	}
	public void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}

		
}
