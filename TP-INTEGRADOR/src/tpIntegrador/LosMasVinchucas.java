package tpIntegrador;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class LosMasVinchucas  {
	private List<Participante> participantes;
	private List<Muestra> muestras;
	private List<Organizacion> organizaciones;
	private List <ZonaDeCobertura> zonas;
	
	public LosMasVinchucas() {
		this.participantes = new ArrayList<Participante>();
		this.muestras = new ArrayList<Muestra>();
		this.organizaciones = new ArrayList<Organizacion>();
		this.zonas = new ArrayList<ZonaDeCobertura>();
	}
	
	public void participanteCargaMuestra(Participante participante, Muestra muestra){
		this.muestras.add(muestra);
		participante.enviarMuestra(muestra);
		this.notificarNuevaMuestraAZonas(muestra);
	}
	public void registrarNuevaZonaDeCobertura(ZonaDeCobertura zona) {
		this.zonas.add(zona);
	}
	
	private void notificarNuevaMuestraAZonas(Muestra muestra) {
		this.zonas.forEach(zona -> zona.recibirNotificacionNuevaMuestra(muestra));
		
	}

	public void registrarParticipante(Participante participante) {
		this.participantes.add(participante);
	}

	public List<Participante> getParticpantes() {
		return this.participantes;
	}
	
	public List<Muestra> getMuestras() {
		return muestras;
	}

	
	
	public void participanteCargaNuevaOpinion(Participante participante2, Muestra muestra2, TipoOpinion tipo) {
		Opinion opinion1=new Opinion(tipo,participante2);
		participante2.enviarOpinion(opinion1);
		muestra2.recibirOpinion(opinion1);
	}
	
	public void actualizarClaseParticipantes() {
		this.participantes.forEach(participante -> participante.actualizarClaseParticipante());
	}

		
}
