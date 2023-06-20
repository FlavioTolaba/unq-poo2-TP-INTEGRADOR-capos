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
	private TipoParticipante tipo1;
	@BeforeEach
	
	void setUp() throws Exception {
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		//opinion1=  new Opinion(TipoOpinion.PHTIA_CHINCE, 123L);
		participante1 = new Participante("Leo", 123L);
		participante2=	new Participante("Lucas", 912L);
		tipo1= new ParticipanteBasico();
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

	     assertTrue(participante1.getOpinionesEnviadas().contains(opinion1));
	 	}
	
@Test

//Cantidad de Opiniones enviadas

void testCantidadOpiniones	() {
    participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
    
    assertEquals(participante1.getCantidadDeOpinionesEnviadas(), 1);
}


@Test

//Nivel Basico
	
void testNivelParticipante() {
	
	participante1.enviarMuestra(muestra1);
	participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
	participante1.actualizarTipo(participante1);
	
	assertTrue(!tipo1.esExperto(participante1));
}

@Test

//Nivel Experto

void testNivelExperto() {
	int a = 0;
	while(a < 30) {
		
		participante1.enviarMuestra(muestra1);
		participante1.enviarOpinion(TipoOpinion.CHINCE_FOLIADA, muestra1);
		
		a = a + 1;
	}
	
	assertTrue(tipo1.esExperto(participante1));
}

}
