package tpIntegrador;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LosMasVinchucasTest {
	
	private LosMasVinchucas sistema;
	private Participante participante1;
	private Ubicacion ubicacionOrzanizacion1;
	private Organizacion organizacion1;
	private Participante participante2;
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new LosMasVinchucas();
		participante1=new Participante("Ramon",3538L);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		organizacion1=new Organizacion(TipoOrganizacion.SALUD,22, this.ubicacionOrzanizacion1);
		participante2=mock(Participante.class);	
		muestra2 = new Muestra(100L, "foto", ubicacionOrzanizacion1);
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

	@Test
	void testParticipanteEnviaNuevaOpinionAMuestra2() {
		
		sistema.participanteCargaNuevaOpinion(participante2, muestra2, TipoOpinion.PHTIA_CHINCE);
		assertTrue(participante2.getOpinionesEnviadas().contains(muestra2.getOpiniones().get(0))); 
		
	}
	
}
