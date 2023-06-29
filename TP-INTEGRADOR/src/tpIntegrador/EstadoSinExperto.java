package tpIntegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EstadoSinExperto extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual(Muestra muestra) {
		if(! muestra.getOpiniones().isEmpty()) {
		Map<TipoOpinion, Long>listaTipos=muestra.getOpiniones().stream().collect(Collectors.groupingBy(opinion -> opinion.getTipoOpinion(),Collectors.counting()));
		
		List<Entry<TipoOpinion, Long>> lista = new ArrayList<Entry<TipoOpinion, Long>>(listaTipos.entrySet());
		lista.sort(Entry.comparingByValue());
		return lista.get(0).getKey();
	//	return TipoOpinion.NINGUNA;
		}
		else {return TipoOpinion.NINGUNA;}
	}
		
	@Override
	public boolean puedeOpinar(Opinion opinion,Muestra muestra) {
		if(muestra.getCantidadExpertos() < 1 ) {
			return true;
		}
		else { return false;}
	}

	
	@Override
	public boolean estaVerificada() {
		return false;
	}

	@Override
	public void actualizarEstado(Opinion opinion, Muestra muestra) {
		if( muestra.getCantidadExpertos() == 1) {
			muestra.cambiarEstado(new EstadoConExperto());
		}
	}




}
