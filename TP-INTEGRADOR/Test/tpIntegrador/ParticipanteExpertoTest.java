package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipanteExpertoTest {

	private Muestra muestra1;
	private Opinion opinion1;
	private ParticipanteConEstudio participanteExp;
	
	@BeforeEach
		
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		participanteExp =new ParticipanteConEstudio("Lucas", 912L);
	}

	@Test
	
	//Probando consultar nombre
	void testPedirNombre() {
		
		assertEquals(participanteExp.getNombre(), "Lucas");
	}
	
	@Test
	
	void testNivelParticipante() {
		
		participanteExp.enviarMuestra(muestra1);
		participanteExp.enviarOpinion(opinion1);
		
		assertEquals(ClaseParticipante.EXPERTO, participanteExp.getClaseParticipante());
	}
	
}
