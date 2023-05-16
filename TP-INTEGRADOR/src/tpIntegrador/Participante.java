package tpIntegrador;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Participante {
	
    private String nombre;
    private int nivel;
    private boolean esEspecialista;
    private LocalDate fechaUltimoCambioNivel;
    private List<Muestra> muestrasEnviadas;
    private List<Opinion> opinionesRealizadas;

    public Participante(String nombre) {
        
    	this.nombre = nombre;
        this.nivel = 1; // nivel básico
        this.esEspecialista = false;
        this.fechaUltimoCambioNivel = LocalDate.now();
        this.muestrasEnviadas = new ArrayList<Muestra>();
        this.opinionesRealizadas = new ArrayList<Opinion>();
    }	
    //La aplicacion debe hacer enviar muestra
    public void enviarMuestra(Muestra muestra) {
        muestrasEnviadas.add(muestra);
    }

    public void opinar(Muestra muestra, int valoracion) {
        // verificar si el participante puede opinar sobre la muestra
        if (!muestrasEnviadas.contains(muestra) && !haOpinadoParaMuestra(muestra)) {
            opinionesRealizadas.add(new Opinion(muestra, valoracion, nivel));
        }
    }

    private boolean haOpinadoParaMuestra(Muestra muestra) {
        for (Opinion opinion : opinionesRealizadas) {
            if (opinion.getMuestra().equals(muestra)) {
                return true;
            }
        }
        return false;
    }

    public void cambiarNivel() {
        int envios = 0;
        int revisiones = 0;
        LocalDate fechaDesde = LocalDate.now().minusDays(30);

        // contar los envíos y revisiones realizados en los últimos 30 días
        for (Opinion opinion : opinionesRealizadas) {
            if (opinion.getFecha().isAfter(fechaDesde)) {
                if (opinion.getNivel() > 1) {
                    revisiones++;
                } else {
                    envios++;
                }
            }
        }

        // si es especialista, se mantiene siempre en nivel experto
        if (esEspecialista) {
            nivel = 2;
        } else {
            // si se cumple la regla de promoción, se sube de nivel
            if (envios > 10 && revisiones > 20 && fechaUltimoCambioNivel.isBefore(fechaDesde)) {
                nivel = 2;
                fechaUltimoCambioNivel = LocalDate.now();
            } else {
                nivel = 1;
            }
        }
    }
}