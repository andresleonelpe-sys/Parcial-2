package Decorator;

import model.Reporte;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PieConFechaDecorator extends ReporteDecorador {

    public PieConFechaDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        String original = super.generarContenido();
        String fecha = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return original + "\n\n--- Pie: generado el " + fecha + " ---";
    }
}