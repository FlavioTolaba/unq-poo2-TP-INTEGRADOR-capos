package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class OrganizacionTest {
	
	private Organizacion organizacion;
	private ZonaDeCobertura zonaDeCobertura1;
	private Ubicacion ubicacion1;
	
	@BeforeEach
	void setUp() throws Exception {
	zonaDeCobertura1 = mock(ZonaDeCobertura.class);
	ubicacion1 = mock(Ubicacion.class);
	organizacion=new Organizacion(TipoOrganizacion.SALUD,40,ubicacion1);
	}
	
	
	@Test
	//probando getter con enum de tipo de organizacion
	void testPidoAUnaOrganizacionQueMeDigaDeQueTipoEs() {
		assertEquals(organizacion.getTipo(),TipoOrganizacion.SALUD);
	}
	
	//se testea suscribirse y desuscribirse a una Zona
	@Test
	void testAgregoUnaNuevaZonaDeCoberturaALaOrganizacion() {
		organizacion.registrarseEnZonaDeCobertura(zonaDeCobertura1);
		verify(zonaDeCobertura1,times(1)).añadirObservador(organizacion);
		organizacion.darDeBajaZonaDeCobertura(zonaDeCobertura1);
		verify(zonaDeCobertura1,times(1)).eliminarObservador(organizacion);
	}
	
	
}