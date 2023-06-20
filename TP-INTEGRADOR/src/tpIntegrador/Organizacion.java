package tpIntegrador;

import java.util.ArrayList;

public class Organizacion implements FuncionalidadExterna,ObservadorZonaDeCobertura{


	private TipoOrganizacion tipoOrganizacion;
	private int cantidadEmpleados;
	private Ubicacion ubicacion;

	public Organizacion(TipoOrganizacion salud, int cantidadEmpleados, Ubicacion ubicacion1) {
		this.tipoOrganizacion = salud;
		this.cantidadEmpleados= cantidadEmpleados;
		this.ubicacion = ubicacion1;
	}

	public TipoOrganizacion getTipo() {
		return tipoOrganizacion;
	}

	@Override
	public void recibirNotificacionValidacion(Muestra muestra) {
		this.nuevoEventoPorValidacion();
	}

	@Override
	public void recibirNotificacionNuevaMuestra(Muestra muestra) {
		this.recibirNotificacionNuevaMuestra(muestra);
		
	}

	@Override
	public void nuevoEventoPorValidacion() {}

	@Override
	public void nuevoEventoPorNuevaMuestra() {}

}
