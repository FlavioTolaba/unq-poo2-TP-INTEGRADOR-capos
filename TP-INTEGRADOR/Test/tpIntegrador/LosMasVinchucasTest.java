package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LosMasVinchucasTest {
	
	private LosMasVinchucas sistema;
	private Participante participante1;
	private Ubicacion ubicacionOrzanizacion1;
	private Organizacion organizacion1;
	

	@BeforeEach
	void setUp() throws Exception {
		sistema = new LosMasVinchucas();
		participante1=new Participante("Ramon",3538L);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		organizacion1=new Organizacion(TipoOrganizacion.SALUD,22, this.ubicacionOrzanizacion1);
	}

	@Test
	void testSistemaNoTieneUsuariosYRegistraUno() {
		sistema.registrarParticipante(participante1);
		assertEquals(sistema.getParticpantes().size(),1);
	}

	@Test
	void testSeRegistraNuevaMuestraPorUnParticipante() {
		sistema.participanteCargaMuestra(participante1);
		assertEquals(sistema.getMuestras().size(),1);
		assertEquals(participante1.getCantidadDeMuestrasEnviadas(),1);
		assertEquals()
	}
	
	

	@Test
	void testSeRegistraNuevaMuestraPorUnParticipante() {
		sistema.participanteCargaMuestra(participante1);
		assertEquals(sistema.getMuestras().size(),1);
		assertEquals(participante1.getCantidadDeMuestrasEnviadas(),1);
		
	}
	
	
}
