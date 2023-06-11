package tpIntegrador;

import java.util.List;
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
		// TODO Auto-generated method stub
		
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
	public void participanteCargaMuestra(Participante participante){
		//filtrar participante de la lista de participantes de la app
		Muestra muestra=new Muestra();
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
		return this.muestras;
	}
	
}
