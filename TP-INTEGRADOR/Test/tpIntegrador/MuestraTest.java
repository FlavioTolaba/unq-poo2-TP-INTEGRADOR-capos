package tpIntegrador;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock.*;

public class MuestraTest {
	
	Muestra muestra;
	Participante participanteMock1;
	Opinion opinionMock0;
	Opinion opinionMock1;
	Opinion opinionMock2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		//participanteMock1 = mock(Participante.class);
		muestra = new Muestra(10L, "foto", null, new ArrayList<>(), TipoOpinion.CHINCE_FOLIADA);
		
		
	}
		
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void getTipoVinchutaTest() {
		assertEquals(muestra.getTipoVinchuca(), TipoOpinion.CHINCE_FOLIADA);
	}
	
	
	@Test
	void idDelParticipanteDeMuestraEs10Test() {
		
		//configuration
		when(participanteMock1.getId()).thenReturn(10L);
		
		//exercise
		muestra.getIdParticipante();
		
		//verify
		assertEquals(muestra.getIdParticipante(), participanteMock1.getId());
	}
	@Test
	void agregarOpinionTest() {
		Opinion opinion = mock(Opinion.class);
		muestra.agregarOpinion(opinion);
		//verify(muestra.getTipoVinchuca()).agregarOpinionA(opinion, muestra);
	}
	
}
	
