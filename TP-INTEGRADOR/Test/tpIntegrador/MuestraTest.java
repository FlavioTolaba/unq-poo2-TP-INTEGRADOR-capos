package tpIntegrador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class MuestraTest {
	
	Muestra muestra;
	ParticipanteConEstudio participanteMock1;
	Opinion opinionMock0;
	Opinion opinionMock1;
	Opinion opinionMock2;
	ParticipanteSinEstudio participante0;
	ParticipanteConEstudio participante1;
	ParticipanteConEstudio participante2;
	ParticipanteSinEstudio participante3;
	Opinion opinionMock;
	Ubicacion ubicacionOrzanizacion1;
	ArrayList<Muestra> listaTest;
	Muestra muestra1;
	Opinion opinion1;
	Opinion opinion2;
	Opinion opinion3;
	Opinion opinion4;
	ObservadorMuestra observadorMock;
	ObservadorMuestra observadorMock1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//participanteMock1 = mock(Participante.class);
		participante0 = new ParticipanteSinEstudio("Carlos", 10L);
		participante1 = new ParticipanteConEstudio("Ramon", 12L);
		participante2 = new ParticipanteConEstudio("Adalberto", 14L);
		participante3 = new ParticipanteSinEstudio("Ricardo", 16L);
		observadorMock=mock(ObservadorMuestra.class);
		observadorMock1=mock(ObservadorMuestra.class);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		opinionMock = mock(Opinion.class);
		muestra = new Muestra(10L, "foto",ubicacionOrzanizacion1);
		listaTest = new ArrayList<Muestra>();
		muestra1=new Muestra(16L, "foto", new Ubicacion(1,2));
		opinion1= new Opinion(TipoOpinion.CHINCE_FOLIADA, participante0);
		opinion2= new Opinion(TipoOpinion.VINCHUCA, participante1);
		opinion3= new Opinion(TipoOpinion.VINCHUCA, participante2);
		opinion4= new Opinion(TipoOpinion.PHTIA_CHINCE, participante3);
	}
		
	@Test
	void testConstructorMuestra() {
		listaTest.add(muestra1);
		assertEquals(listaTest.size(),1);
		assertEquals(listaTest.get(0),muestra1);
	}
	
	@Test
	void getTipoVinchutaTest() {
		muestra1.setTipoVinchuca(TipoOpinion.CHINCE_FOLIADA);
		assertEquals(muestra1.getTipoVinchuca(), TipoOpinion.CHINCE_FOLIADA);
	}
	
	
	@Test
	void idDelParticipanteDeMuestraEs10Test() {
		assertEquals(muestra.getIdParticipante(), participante0.getId());
	}
	@Test
	void agregarOpinionTest() {
		muestra.agregarOpinion(opinionMock);
		assertEquals(muestra.getOpiniones().size(),1);
	}
	
	@Test
	void testMuestraTieneNuevaOpinionDeParticipanteSinEstudio() {
		muestra1.recibirOpinion(opinion1);
		assertEquals(muestra1.getOpiniones().get(0),opinion1);
		assertFalse(muestra1.estaVerificada());
		assertEquals(muestra1.resultadoActual(),opinion1.getTipoOpinion());
		
	}
	@Test
	void testMuestraEsVerificadaPorDosExpertosConEstudio() {
	muestra1.recibirOpinion(opinion2);
	muestra1.recibirOpinion(opinion3);	
	muestra1.recibirOpinion(opinion1);	
	assertTrue(muestra1.estaVerificada());
	assertEquals(muestra1.resultadoActual(),TipoOpinion.VINCHUCA);
	}
	
	//agrega observadores y elimina y prueba notificaciones
	@Test
	void testMuestraAñadeYEliminaObservadores() {
	muestra1.añadirObservador(observadorMock);
	muestra1.añadirObservador(observadorMock1);
	muestra1.recibirOpinion(opinion2);
	muestra1.recibirOpinion(opinion3);	
	muestra1.recibirOpinion(opinion1);	
	assertTrue(muestra1.estaVerificada());
	verify(observadorMock,times(1)).recibirNotificacionValidacion(muestra1);
	muestra1.eliminarObservador(observadorMock1);
	assertEquals(muestra1.getObservadores().size(),1);
	assertEquals(muestra1.resultadoActual(),TipoOpinion.VINCHUCA);

	}
	
	//test getters y setters
	
	
	/*@Test
	void testConstructorMuestraRamon() {
		Opinion opinion1 = new Opinion(TipoOpinion.CHINCE_FOLIADA , participante0);
		Opinion opinion2 = new Opinion(TipoOpinion.NINGUNA , participante0);
		Opinion opinion3 = new Opinion(TipoOpinion.POCO_CLARA , participante0);
		Opinion opinion4 = new Opinion(TipoOpinion.CHINCE_FOLIADA , participante0);
		Opinion opinion5 = new Opinion(TipoOpinion.CHINCE_FOLIADA , participante0);
		muestra.recibirOpinion(opinion1);
		muestra.recibirOpinion(opinion2);
		muestra.recibirOpinion(opinion3);
		muestra.recibirOpinion(opinion4);
		muestra.recibirOpinion(opinion5);
		Map<TipoOpinion, Long>listaTipos=muestra.getOpiniones().stream().collect(Collectors.groupingBy(opinion -> opinion.getTipoOpinion(),Collectors.counting()));

		listaTipos.values();
	
		assertEquals(true,true);
	*/
	}
	
	
	
	
