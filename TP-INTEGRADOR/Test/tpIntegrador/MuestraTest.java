package tpIntegrador;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
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
		opinionMock0 = mock(Opinion.class);
		opinionMock1 = mock(Opinion.class);
		opinionMock2 = mock(Opinion.class);
		muestra = new Muestra(1, "foto", null, new ArrayList<>());
		
		
	}
		
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	

	@Test
	void idDelParticipanteDeMuestraEs10() {
		
		//configuration
		when(participanteMock1.getId()).thenReturn(5);
		
		//exercise
		muestra.getIdParticipante();
		
		
	}
	//test para verificar que tiene 3 opiniones iguales
	@Test
	void resultadoActualImagenPocoClara() {
		//configuration test double
		when(opinionMock0.getTipoOpinion()).thenReturn(TipoOpinion.POCO_CLARA);
		when(opinionMock1.getTipoOpinion()).thenReturn(TipoOpinion.POCO_CLARA);
		when(opinionMock2.getTipoOpinion()).thenReturn(TipoOpinion.POCO_CLARA);
		
		muestra.agregarOpinion(opinionMock0);
		muestra.agregarOpinion(opinionMock1);
		muestra.agregarOpinion(opinionMock2);
		
		//exercise
		muestra.resultadoActual(muestra);
		
		//verify
		
		assertEquals(muestra.getResultadoActual(), TipoOpinion.POCO_CLARA);
		
	}
	
}
	
