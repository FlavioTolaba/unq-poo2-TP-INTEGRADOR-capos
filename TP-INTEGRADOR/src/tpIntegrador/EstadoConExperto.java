package tpIntegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EstadoConExperto extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual(Muestra muestra) {
			Map<TipoOpinion, Long>listaTipos=muestra.getOpiniones().stream().collect(Collectors.groupingBy(opinion -> opinion.getTipoOpinion(),Collectors.counting()));
			
			List<Entry<TipoOpinion, Long>> lista = new ArrayList<Entry<TipoOpinion, Long>>(listaTipos.entrySet());
			lista.sort(Entry.comparingByValue());
			return lista.get(0).getKey();
			}
	

	@Override
	public boolean puedeOpinar(Opinion opinion, Muestra muestra) {
		if(opinion.esOpinionExperto()) {return true;}else {return false;}
	}

	@Override
	public void actualizarEstado(Opinion opinion,Muestra muestra) {
		if(this.tieneOpinionMismoTipo(opinion, muestra) && muestra.getCantidadExpertos() == 2){
			muestra.cambiarEstado(new EstadoVerificada());
			muestra.setTipoVinchuca(opinion.getTipoOpinion());
			muestra.notificarObservadoresValidacion();
		}
	}

	public boolean tieneOpinionMismoTipo(Opinion opinion, Muestra muestra) {
		return muestra.getOpiniones().stream().map(opinionS -> opinionS.getTipoOpinion()).toList().contains(opinion.getTipoOpinion());
	}
	
	@Override
	public boolean estaVerificada() {
		return false;
	}

}
