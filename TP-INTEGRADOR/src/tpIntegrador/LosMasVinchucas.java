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
		//ver constructor
		this.muestras.add(muestra);
		participante.enviarMuestra(muestra);
		//this.zonasDeCobertura notificar nueva muestra
	}
	//participanteCargaMuestra
	//registrarParticipante

	public void registrarParticipante(Participante participante) {
		this.participantes.add(participante);
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
	
	//getOrganizacion pide organizacionesSuscriptas a Zonas
	
	public void participanteCargaNuevaOpinion(Participante participante2, Muestra muestra2, TipoOpinion tipo) {
		
		participante2.enviarOpinion(tipo, muestra2);
		
	}
	
	
	
	// public void actualizarClaseParticipantes;

		
}
