package tpIntegrador;

public class PruebaDistancia {

	public static void main(String[] args) {
		Ubicacion manager = new Ubicacion(8,5);
		Ubicacion ubicacion1=new Ubicacion(3,3);
		Ubicacion ubicacion2=new Ubicacion(6,9);
		double resultado=manager.distanciaEntreDosUbicaciones(ubicacion1, ubicacion2);
		System.out.println(resultado);
	}

}
