package tpIntegrador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

<<<<<<< HEAD
public class Organizacion implements FuncionalidadExterna,Observador{
=======
public class Organizacion implements FuncionalidadExterna, Observer{
>>>>>>> main

	private TipoOrganizacion tipoOrganizacion;
	private int cantidadEmpleados;
	private Ubicacion ubicacion;
	private ArrayList<ZonaDeCobertura> zonasDeCobertura;

	public Organizacion(TipoOrganizacion salud, int i, Ubicacion ubicacion1) {
		this.tipoOrganizacion = salud;
		this.cantidadEmpleados= i;
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
<<<<<<< HEAD
	public void recibirNotificacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevoEvento() {
		// TODO Auto-generated method stub
		
	}



=======
	public void update(Observable o, Object arg) {
		
	}

>>>>>>> main
}
