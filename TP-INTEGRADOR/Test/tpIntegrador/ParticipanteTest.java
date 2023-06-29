package tpIntegrador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

class ParticipanteTest {
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	private Opinion opinion1;
	private ParticipanteSinEstudio participante1;
	private ParticipanteConEstudio participante2;
	private ParticipanteConEstudio participante3;
	@BeforeEach
	
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		opinion1 = mock(Opinion.class);
		when(opinion1.getFechaOpinion()).thenReturn(LocalDate.now());
		when(muestra1.getDate()).thenReturn(LocalDate.now());
		when(muestra2.getDate()).thenReturn(LocalDate.now());
		when(muestra3.getDate()).thenReturn(LocalDate.now());
		participante1 = new ParticipanteSinEstudio("Leo", 123L);
		participante2=	new ParticipanteConEstudio("Lucas", 912L);
		participante3= new ParticipanteConEstudio("Alejo", 420L);
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

//NivelSinEstudio 
	
void testNivelBasicoParticipanteBasico() {
	
	participante1.enviarMuestra(muestra1);
	participante1.enviarOpinion(opinion1);
	participante1.actualizarClaseParticipante();
	
	assertEquals(participante1.getClaseParticipante(), ClaseParticipante.BASICO);
}

@Test

//NivelSinEstudioABasico

void testNivelExpertoParticipanteSinEstudio() {
	int a = 0;
	while(a < 30) {
		
		participante1.enviarMuestra(muestra1);
		participante1.enviarOpinion(opinion1);
		
		a = a + 1;
	}
	
	participante1.actualizarClaseParticipante();
	
	assertEquals(participante1.getClaseParticipante(), ClaseParticipante.EXPERTO);
	assertTrue(participante1.esExperto());
}

@Test

//Nivel Experto Participante Experto

void testNivelExpertoParticipanteExperto() {
	int a = 0;
	while(a < 30) {
		
		participante2.enviarMuestra(muestra1);
		participante2.enviarOpinion(opinion1);
		
		a = a + 1;
	}
	
	participante2.actualizarClaseParticipante();
	
	assertEquals(participante2.getClaseParticipante(), ClaseParticipante.EXPERTO);

}

@Test

void testNivelBasicoParticipanteExperto() {
	participante2.enviarMuestra(muestra1);
	participante2.enviarOpinion(opinion1);
	participante2.actualizarClaseParticipante();
	
	assertEquals(participante2.getClaseParticipante(), ClaseParticipante.EXPERTO);
}

@Test

//ParticipanteExpertoValidado

void testNivelExpertoValidado() {

	assertEquals(participante3.getClaseParticipante(), ClaseParticipante.EXPERTO);
	participante3.enviarMuestra(muestra1);
	participante3.enviarOpinion(opinion1);
	participante3.actualizarClaseParticipante();
	assertEquals(participante3.getClaseParticipante(), ClaseParticipante.EXPERTO);
	
}

}