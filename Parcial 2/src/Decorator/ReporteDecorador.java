package Decorator;

import model.Reporte;

public abstract class ReporteDecorador implements Reporte {

    protected final Reporte reporte;

    public ReporteDecorador(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String generarContenido() {
        return reporte.generarContenido();
    }
}