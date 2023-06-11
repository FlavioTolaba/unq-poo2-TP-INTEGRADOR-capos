package tpIntegrador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;

class ParticipanteTest {
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	private Opinion opinion1;
	private Participante participante1;
	private Participante participante2;
	@BeforeEach
	
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		participante1 = new Participante("Leo",1);
		participante2=	new Participante("Lucas",1);
	}

@Test

//Probando enviar muestr
 void testEnviarMuestra() {

     participante1.enviarMuestra(muestra1);

     assertTrue(participante1.getMuestrasEnviadas().contains(muestra1));
 	}


@Test

//Probando consultar nombre
void testPedirNombre() {
	
	assertEquals(participante1.getNombre(), "Leo");
}

@Test

//Probando cantidad de muestras enviadas
void testCantidadMuestras() {
    participante1.enviarMuestra(muestra1);
    participante1.enviarMuestra(muestra2);
    participante1.enviarMuestra(muestra3);
    
    assertEquals(participante1.getCantidadDeMuestrasEnviadas(), 3);
}

@Test

//Envir opinion

void testEnviarOpiniones() {
	
	  participante1.enviarOpinion(opinion1);

	     assertTrue(participante1.getOpinionesEnviadas().contains(opinion1));
	 	}
	
@Test

//Cantidad de Opiniones enviadas

void testCantidadOpiniones	() {
    participante1.enviarOpinion(opinion1);
    
    assertEquals(participante1.getCantidadDeOpinionesEnviadas(), 1);
}


@Test

//Nivel Basico

void testNivelParticipante() {
	
	participante1.enviarMuestra(muestra1);
	participante1.enviarOpinion(opinion1);
	
	assertEquals(ClaseParticipante.BASICO, participante1.getNivelUsuario());
}

@Test

//Nivel Experto

void testNivelParticipanteExperto() {
	
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);	
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);	
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);	
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);	
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	
	assertEquals(participante2.getNivelUsuario(), ClaseParticipante.EXPERTO);
}

}
