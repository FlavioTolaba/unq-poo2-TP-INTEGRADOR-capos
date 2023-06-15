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
	Participante participante0;
	Opinion opinionMock;
	Ubicacion ubicacionOrzanizacion1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//participanteMock1 = mock(Participante.class);
		participante0 = new Participante("Carlos", 10L);
		ubicacionOrzanizacion1 = new Ubicacion(3, 7);
		opinionMock = mock(Opinion.class);
		muestra = new Muestra(10L, "foto",ubicacionOrzanizacion1,opinionMock);
		
	}
		
	@Test
	void testConstructorMuestra() {
		
		
	}
	
	@Test
	void getTipoVinchutaTest() {
		assertEquals(muestra.getTipoVinchuca(), TipoOpinion.CHINCE_FOLIADA);
	}
	
	
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
	
}
	
