package tpIntegrador;

import static org.mockito.ArgumentMatchers.anyBoolean;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EstadoSinExperto extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual(Muestra muestra) {

		Map<TipoOpinion, Long>listaTipos=muestra.getOpiniones().stream().collect(Collectors.groupingBy(opinion -> opinion.getTipoOpinion(),Collectors.counting()));
		
		List<Entry<TipoOpinion, Long>> lista = new ArrayList<Entry<TipoOpinion, Long>>(listaTipos.entrySet());
		lista.sort(Entry.comparingByValue());
		return lista.get(0).getKey();
	}
		
	@Override
	public boolean puedeOpinar(Participante participante) {
		return true;
	}

	
	@Override
	public boolean estaVerificada() {
		return false;
	}

	@Override
	public void actualizarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedeOpinar(Opinion opinion) {
		// TODO Auto-generated method stub
		return false;
	}



}
