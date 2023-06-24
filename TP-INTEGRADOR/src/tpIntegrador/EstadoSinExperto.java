package tpIntegrador;

import java.util.ArrayList;

public class EstadoSinExperto extends EstadoVerificacion {

	@Override
	public TipoOpinion resultadoActual() {
		//implementar
		return null;
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
	public void actualizarEstado(Muestra muestra, ArrayList<Opinion> opiniones) {
		if(opiniones.tiene) {
			
		}
		
	}

}
