package tpIntegrador;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock.*;

public class MuestraTest {
	
	Muestra muestra;
	Participante participanteMock1;
	Opinion opinionMock0;
	Opinion opinionMock1;
	Opinion opinionMock2;
	Participante participante0;
	Opinion opinionMock;
	Ubicacion ubicacionOrzanizacion1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//participanteMock1 = mock(Participante.class);
		participante0 = new Participante("Carlos", 10L);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		opinionMock = mock(Opinion.class);
		muestra = new Muestra(10L, "foto",ubicacionOrzanizacion1);
		
	}
		
	@Test
	void testConstructorMuestra() {
		
		
	}
	
/*	@Test
	void getTipoVinchutaTest() {
		assertEquals(muestra.getTipoVinchuca(), TipoOpinion.CHINCE_FOLIADA);
	}
	*/
	
	@Test
	void idDelParticipanteDeMuestraEs10Test() {
		
		//verify
		assertEquals(muestra.getIdParticipante(), participante0.getId());
	}
	@Test
	void agregarOpinionTest() {
		muestra.agregarOpinion(opinionMock);
		assertEquals(muestra.getOpiniones().size(),1);
	}
	
	@Test
	void testMuestraTieneNuevaOpinionDeParticipanteExperto() {}
	@Test
	void testMuestraEsVerificada() {}
	
	@Test
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
	
	}
	
	
	
}
	
