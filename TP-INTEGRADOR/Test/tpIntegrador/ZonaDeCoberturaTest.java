package tpIntegrador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZonaDeCoberturaTest {

	private ArrayList<ZonaDeCobertura> listaZonas1;
	private ZonaDeCobertura zona1;
	private ZonaDeCobertura zona2;
	private ZonaDeCobertura zona3;
	private Organizacion organizacionMock;
	private Ubicacion ubicacion1;
	private Ubicacion ubicacion2;
	private Ubicacion ubicacion3;
	private Ubicacion ubicacionMuestra;
	private Muestra muestra1;
	
	@BeforeEach
	void setUp() {
	organizacionMock=mock(Organizacion.class);	
	ubicacion1=new Ubicacion(3,8);
	ubicacion2=new Ubicacion(3,8);
	ubicacion3=new Ubicacion(3,8);
	ubicacionMuestra=new Ubicacion(4,5);
	zona1= new ZonaDeCobertura(ubicacion1,35,"Quilmes");
	zona2= new ZonaDeCobertura(ubicacion2,8,"Bera");
	zona3= new ZonaDeCobertura(ubicacion3,2,"Ezpeleta");
	muestra1=new Muestra(0, "foto", ubicacionMuestra);
	listaZonas1 = new ArrayList<ZonaDeCobertura>();
	listaZonas1.add(zona1);	
	listaZonas1.add(zona2);	
	listaZonas1.add(zona3);	
	}

	//llega notifiacion de nueva muestra con una muestra y se notifica a los observadores
	//las organizaciones reciben la notificacion con la muestra
	@Test
	void testSeAgreganObservadoresYSeLosNotificaDeNuevaMuestra() {
		zona1.añadirObservador(organizacionMock);
		zona1.recibirNotificacionNuevaMuestra(muestra1);
		verify(organizacionMock, times(1)).recibirNotificacionNuevaMuestra(muestra1);
		
	}
	
	
	
	

}
