package tpIntegrador;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CriterioFiltroTipoDeInsecto implements CriterioFiltro {
	
	
	private TipoOpinion tipoOpinion;
	
	
	public CriterioFiltroTipoDeInsecto(TipoOpinion tipoOpinion) {
		this.tipoOpinion = tipoOpinion;
	}
	
	public TipoOpinion getTipoABuscar() {
		return tipoOpinion;
	}


	@Override
	public List<Muestra> realizarBusqueda(List<Muestra> muestras) {
		// TODO Auto-generated method stub
		List<Muestra> resultadoBusqueda = muestras.stream()
					.filter(m -> m.getTipoVinchuca().equals(this.getTipoABuscar()))
					.collect(Collectors.toList());
		
		return resultadoBusqueda;
	}

}
