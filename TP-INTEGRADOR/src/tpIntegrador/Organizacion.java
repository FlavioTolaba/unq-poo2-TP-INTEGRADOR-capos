package tpIntegrador;

import java.util.ArrayList;

public class Organizacion implements FuncionalidadExterna,Observador{


	private TipoOrganizacion tipoOrganizacion;
	private int cantidadEmpleados;
	private Ubicacion ubicacion;
	private ArrayList<ZonaDeCobertura> zonasDeCobertura;

	public Organizacion(TipoOrganizacion salud, int cantidadEmpleados, Ubicacion ubicacion1) {
		this.tipoOrganizacion = salud;
		this.cantidadEmpleados= cantidadEmpleados;
		this.ubicacion = ubicacion1;
		this.zonasDeCobertura = new ArrayList<ZonaDeCobertura>();
	}

	public TipoOrganizacion getTipo() {
		return tipoOrganizacion;
	}

	public Integer cantidadDeZonasDeInteres() {
		return this.zonasDeCobertura.size();
	}

	public void agregarZonaDeInteres(ZonaDeCobertura zonaDeCobertura1) {
		this.zonasDeCobertura.add(zonaDeCobertura1);
	}

	@Override
	public void recibirNotificacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevoEvento() {
		// TODO Auto-generated method stub
		
	}

	/*public void update(Observable o, Object arg) {
		
	}
*/
}
