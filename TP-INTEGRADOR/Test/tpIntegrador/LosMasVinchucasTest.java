package tpIntegrador;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LosMasVinchucasTest {
	
	private LosMasVinchucas sistema;
	private ParticipanteSinEstudio participante1;
	private Ubicacion ubicacionOrzanizacion1;
	private Ubicacion ubicacion1;
	private Ubicacion ubicacion2;
	private Organizacion organizacion1;
	private ParticipanteConEstudio participante2;
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	private ZonaDeCobertura zona1;
	private Organizacion organizacionMock;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new LosMasVinchucas();
		participante1=new ParticipanteSinEstudio("Ramon",3538L);
		participante2=mock(ParticipanteConEstudio.class);	
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		ubicacion1= new Ubicacion(5, 7);
		ubicacion2= new Ubicacion(8, 9);
		organizacion1=new Organizacion(TipoOrganizacion.SALUD,22, this.ubicacionOrzanizacion1);
		organizacionMock= mock(Organizacion.class);
		muestra1 = new Muestra(100L, "foto", ubicacion2);
		muestra2 = new Muestra(100L, "foto", ubicacion2);
		zona1= new ZonaDeCobertura(ubicacion1,35,"Quilmes");
	}

	@Test
	void testSistemaNoTieneUsuariosYRegistraUno() {
		sistema.registrarParticipante(participante1);
		assertEquals(sistema.getParticpantes().size(),1);
	}

	
//se verifica que la muestra este en la lista de muestras de sistema y que el participante la agregue a su historial de enviadas
//ademas se verifica que la zona de cobertura reciba la notificacion y ya que la organizacion esta suscripta, que tambien le llegue la notifiacion
	@Test
	void testSeRegistraNuevaMuestraPorUnParticipante() {
		sistema.registrarNuevaZonaDeCobertura(zona1);
		zona1.añadirObservador(organizacionMock);
		sistema.participanteCargaMuestra(participante1, muestra1);
		verify(organizacionMock, times(1)).recibirNotificacionNuevaMuestra(muestra1);
		assertEquals(zona1.obtenerMuestrasReportadas().get(0),muestra1);
		assertEquals(sistema.getMuestras().size(),1);
		assertEquals(participante1.getCantidadDeMuestrasEnviadas(),1);
	}

	@Test
	void testParticipanteEnviaNuevaOpinionAMuestra2() {
		sistema.participanteCargaNuevaOpinion(participante1, muestra2, TipoOpinion.PHTIA_CHINCE);
		sistema.actualizarClaseParticipantes();
		assertTrue(participante1.getOpinionesEnviadas().containsAll(muestra2.getOpiniones())); 
		
	}
	
}
