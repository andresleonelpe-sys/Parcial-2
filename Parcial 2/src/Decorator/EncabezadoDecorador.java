package Decorator;

import model.Reporte;

public class EncabezadoDecorador extends ReporteDecorador {

    private final String encabezado;

    public EncabezadoDecorador(Reporte reporte, String encabezado) {
        super(reporte);
        this.encabezado = encabezado;
    }

    @Override
    public String generarContenido() {
        return "=== " + encabezado + " ===\n" + super.generarContenido();
    }
}
