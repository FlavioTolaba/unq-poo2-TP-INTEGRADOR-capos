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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eliminarObservador(Observador observador) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notificarObservadores() {
		// TODO Auto-generated method stub
		
	}

/*	public void participanteCargaMuestra(Participante participante){
		//filtrar participante de la lista de participantes de la app
		Muestra muestra=new Muestra();
		participante.enviarMuestra();
		this.notificarObservadores();
		
		}

	public void crearParticipante(String id, Rango rango, boolean estudios) {
		Participante participante = new Participante(id, rango, estudios);
		this.participantes.add(participante);
	}

	@Override
	public void añadirObservador(Observador observador) {
		this.observadores.add(observador);
	}

	@Override
	public void eliminarObservador(Observador observador) {
		this.observadores.remove(observador);

	}

	@Override
		public void notificarObservadores() {
			this.observadores.forEach(observador -> observador.recibirNotificacion());		
		}
*/
	public List<Observador> getObservadores() {
		return this.observadores;
	}
	
}
