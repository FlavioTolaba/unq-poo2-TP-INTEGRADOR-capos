package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UbicacionManagerTest {
	private Ubicacion ubicacion1;
	private Ubicacion ubicacion2;
	private Ubicacion ubicacion3;
	private UbicacionManager manager;
	private ArrayList<Ubicacion> listaUbicaciones;
	
	@BeforeEach
	void setUp() throws Exception {
		ubicacion1=new Ubicacion(3,3);
		ubicacion2=new Ubicacion(6,9);
		ubicacion3=new Ubicacion(16,22);
		manager=new UbicacionManager();
		listaUbicaciones=new ArrayList<Ubicacion>();
		listaUbicaciones.add(ubicacion3);
		listaUbicaciones.add(ubicacion2);
		listaUbicaciones.add(ubicacion1);
	}

	@Test
	//el resultado aplicando teorema de pitagoras de la distancia entre dos puntos (3,3),(6,9), 3.87
	void testCalculaDistanciaEntreDosUbicaciones() {
		double resultado=manager.distanciaEntreDosUbicaciones(ubicacion1, ubicacion2);
		assertEquals(resultado,6.708203932499369);
	}
	
	@Test
	//por convencion decimos que los enteros de nuestro programa son KMS en caso de querer metros hay que hacer la conversion
	void testListaDeUbicacionesAXKilometros() {
		ArrayList<Ubicacion>resultado=manager.ubicacionesEnRango(8,listaUbicaciones,ubicacion1);
		assertEquals(resultado.get(0),ubicacion2);
	}
}
