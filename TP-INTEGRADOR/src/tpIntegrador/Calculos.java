package tpIntegrador;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculos {
	
	public static long calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2) {
        long diferencia = ChronoUnit.DAYS.between(fecha1, fecha2);
        return Math.abs(diferencia); 
    }
}
