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
	private Participante participante3;
	private ClaseParticipante tipo1;
	@BeforeEach
	
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		//opinion1=  new Opinion(TipoOpinion.PHTIA_CHINCE, 123L);
		participante1 = new ParticipanteBasico("Leo", 123L);
		participante2=	new ParticipanteExperto("Lucas", 912L);
		participante3= new ParticipanteExpertoValidado("Alejo", 420L);
		tipo1= ClaseParticipante.BASICO;
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
	
	  participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);

	     assertFalse(participante1.getOpinionesEnviadas().contains(opinion1));
	 	}
	
@Test

//Cantidad de Opiniones enviadas

void testCantidadOpiniones	() {
    participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
    
    assertEquals(participante1.getCantidadDeOpinionesEnviadas(), 1);
}


@Test

//Nivel Basico Participante Basico
	
void testNivelBasicoParticipanteBasico() {
	
	participante1.enviarMuestra(muestra1);
	participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
	participante1.actualizarClaseParticipante();
	
	assertEquals(participante1.getClaseParticipante(), ClaseParticipante.BASICO);
}

@Test

//Nivel Experto Participante Basico

void testNivelExpertoParticipanteBasico() {
	int a = 0;
	while(a < 30) {
		
		participante1.enviarMuestra(muestra1);
		participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
		
		a = a + 1;
	}
	
	participante1.actualizarClaseParticipante();
	
	assertEquals(participante1.getClaseParticipante(), ClaseParticipante.EXPERTO);

}

@Test

//Nivel Experto Participante Experto

void testNivelExpertoParticipanteExperto() {
	int a = 0;
	while(a < 30) {
		
		participante2.enviarMuestra(muestra1);
		participante2.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
		
		a = a + 1;
	}
	
	participante2.actualizarClaseParticipante();
	
	assertEquals(participante2.getClaseParticipante(), ClaseParticipante.EXPERTO);

}

@Test

void testNivelBasicoParticipanteExperto() {
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
	participante2.actualizarClaseParticipante();
	
	assertEquals(participante2.getClaseParticipante(), ClaseParticipante.BASICO);
}

@Test

//ParticipanteExpertoValidado

void testNivelExpertoValidado() {

	assertEquals(participante3.getClaseParticipante(), ClaseParticipante.EXPERTO);
	participante3.enviarMuestra(muestra1);
	participante3.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
	participante3.actualizarClaseParticipante();
	assertEquals(participante3.getClaseParticipante(), ClaseParticipante.EXPERTO);
	
}

}