import Factory.ReporteFactory;
import model.Reporte;
import Decorator.*;
import Singleton.Configuracion;

public class Main {

    public static void main(String[] args) {

        Configuracion cfg = Configuracion.getInstance();
        cfg.setDirectorioSalida("/tmp/reportes");
        cfg.setFormatoPorDefecto("pdf");
        cfg.setMostrarMarcaAgua(true);

        String tipo = (args.length > 0) ? args[0] : "";

        ReporteFactory factory = new ReporteFactory();
        Reporte reporte = factory.crearReporte(tipo);

        reporte = new EncabezadoDecorador(reporte, "Empresa XYZ");
        reporte = new MarcaAguaDecorador(reporte, "CONFIDENCIAL");
        reporte = new PieConFechaDecorator(reporte);

        System.out.println(reporte.generarContenido());
    }
}