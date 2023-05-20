0package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UObservableTest {
	private Organizacion organizacion1;
	private Organizacion organizacion2;
	private LosMasVinchucas sistema;
	
	@BeforeEach
	void setUp() throws Exception {
		organizacion1 = mock(Organizacion.class);
		organizacion2 = mock(Organizacion.class);
		sistema = new LosMasVinchucas();
	}

	@Test
	void testAgregarUnObservadorAListaDeObservadores() {
		assertEquals(sistema.getObservadores().size(),0);
		sistema.añadirObservador(organizacion1);
		assertEquals(sistema.getObservadores().size(),1);
	}

	@Test
	void testNotificarObservadoresCuandoHayUnCambio(){
		
	}
}
