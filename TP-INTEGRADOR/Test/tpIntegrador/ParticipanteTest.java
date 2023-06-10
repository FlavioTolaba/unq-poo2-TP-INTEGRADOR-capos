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
	private ParticipanteExperto participante1;
	@BeforeEach
	
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		muestra2= mock(Muestra.class);
		muestra3= mock(Muestra.class);
		participante1 = new ParticipanteExperto("Leo");
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
	
	assertEquals(participante1.getNivelUsuario(), ClaseParticipante.BASICO);
}

}



/*
 @Test
 void opinar() {
     Participante participante1 = new Participante("Juan");
     Participante participante2 = new Participante("María");
     Muestra muestra = new Muestra("Muestra 1");

     // participante1 envía la muestra y participante2 opina
     participante1.enviarMuestra(muestra);
     participante2.opinar(muestra, 3);

     // la opinión debería haber sido agregada
     assertTrue(participante2.getOpinionesRealizadas().size() == 1);

     // participante2 intenta opinar de nuevo para la misma muestra
     participante2.opinar(muestra, 2);

     // la opinión no debería haber sido agregada porque ya opinó para esa muestra
     assertTrue(participante2.getOpinionesRealizadas().size() == 1);

     // participante1 intenta opinar para su propia muestra
     participante1.opinar(muestra, 4);

     // la opinión no debería haber sido agregada porque no puede opinar para sus propias muestras
     assertTrue(participante1.getOpinionesRealizadas().size() == 0);
 }


 void cambiarNivel() {
     Participante participante = new Participante("Juan");
     Muestra muestra = new Muestra("Muestra 1");

     // envía 5 muestras y realiza 10 revisiones en los últimos 30 días
     LocalDate fechaDesde = LocalDate.now().minusDays(30);
     for (int i = 0; i < 5; i++) {
         participante.enviarMuestra(new Muestra("Muestra " + (i+1)));
     }
     for (int i = 0; i < 10; i++) {
         participante.opinar(muestra, 3);
     }

     // aún no debería ser experto porque no se ha cumplido la regla de promoción
     assertTrue(participante.getNivel() == 1);

     // espera un segundo para asegurarse de que la fecha sea diferente
     try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // envía otras 6 muestras y realiza 15 revisiones en los últimos 30 días
     for (int i = 0; i < 6; i++) {
         participante.enviarMuestra(new Muestra("Muestra " + (i+6)));
     }
     for (int i = 0; i < 15; i++) {
         participante.opinar(muestra, 4);
     }

     // debería haber subido a nivel experto
     participante.cambiarNivel();
     assertTrue(participante.getNivel() == 2);

     // vuelve a enviar la misma muestra para verificar que no haya cambios en el nivel
     participante.enviarMuestra(muestra);
     participante.cambiarNivel();
     assertTrue(participante.getNivel() == 

 }*/