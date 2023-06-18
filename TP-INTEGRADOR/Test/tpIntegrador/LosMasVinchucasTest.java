package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LosMasVinchucasTest {
	
	private VinchucaSistema sistema;
	private Participante participante1;
	private Ubicacion ubicacionOrzanizacion1;
	private Organizacion organizacion1;
	private Participante participante2;
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new VinchucaSistema();
		participante1=new Participante("Ramon",3538L);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		organizacion1=new Organizacion(TipoOrganizacion.SALUD,22, this.ubicacionOrzanizacion1);
		participante2=mock(Participante.class);	
	}

	@Test
	void testSistemaNoTieneUsuariosYRegistraUno() {
		sistema.registrarParticipante(participante1);
		assertEquals(sistema.getParticpantes().size(),1);
	}
/*
	@Test
	void testSeRegistraNuevaMuestraPorUnParticipante() {
		sistema.participanteCargaMuestra(participante2);
		assertEquals(sistema.getMuestras().size(),1);
		assertEquals(participante1.getCantidadDeMuestrasEnviadas(),1);
		assertEquals()
	}
	
	*/

	@Test
	void testSeRegistraNuevaMuestraPorUnParticipante() {
		sistema.participanteCargaMuestra("", participante1, ubicacionOrzanizacion1,TipoOpinion.CHINCE_FOLIADA);
		assertEquals(sistema.getMuestras().size(),1);
		assertEquals(participante1.getCantidadDeMuestrasEnviadas(),1);
	}

	
}
