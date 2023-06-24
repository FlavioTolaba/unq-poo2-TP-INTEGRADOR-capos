package tpIntegrador;

import static org.mockito.ArgumentMatchers.anyBoolean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstadoSinExperto extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual(Muestra muestra) {
		List<Opinion> listaOpinionesMuestra=muestra.getOpiniones();
		if(listaOpinionesMuestra != null && listaOpinionesMuestra.size() != 1) {
		muestra.getOpiniones().stream().map(opinion -> opinion.getTipoOpinion()).;
				
		
		
		}
	
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



}
