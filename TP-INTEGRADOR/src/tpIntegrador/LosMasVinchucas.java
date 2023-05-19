package tpIntegrador;

import java.util.List;

public class LosMasVinchucas implements Obeserver{
	private List<Participante> participantes;
	private List<Muestra> muestras;
	private List<Organizacion> organizaciones;
	
public void participanteCargaMuestra(Participante participante){
		//filtrar participante de la lista de participantes de la app
		Muestra muestra=new Muestra();
		participante.cargarMuestra();
		this.participantes.add(participante);
		}

		public void crearParticipante(String id,Rango rango,boolean estudios){
		Participante participante=new Participante(id,rango,estudios);
		this.participantes.add(participante);
		}
}
