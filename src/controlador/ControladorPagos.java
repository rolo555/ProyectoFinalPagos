package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelo.Pagos;
import modelo.FechaDelSistema;
import modelo.PapeletaDePago;
import vista.VistaPagos;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class ControladorPagos {

    VistaPagos vistaPagos;
    FechaDelSistema fechaDelSistema;

    public ControladorPagos(VistaPagos vistaPagos) {
        this.vistaPagos = vistaPagos;
    }

    public ArrayList<PapeletaDePago> realizarPagos() {
        ArrayList<PapeletaDePago> papeletasDePago = new ArrayList<PapeletaDePago>();
        Calendar fechaActual = FechaDelSistemaDBHelper.getFechaDelSistema();
        fechaDelSistema = new FechaDelSistema(fechaActual);
        Calendar fechaInicio = new GregorianCalendar();
        fechaInicio.setTimeInMillis(fechaActual.getTimeInMillis());
        if (fechaDelSistema.esViernes()) {
            ArrayList<PapeletaDePago> papeletasEmpleadosPorHora;
            fechaInicio.add(Calendar.DATE, -5);
            papeletasEmpleadosPorHora = Pagos.pagarEmpleadosPorHora(fechaInicio, fechaActual);
            fechaInicio.add(Calendar.DATE, +5);
            juntarPapeletas(papeletasDePago, papeletasEmpleadosPorHora);
        }
        if (fechaDelSistema.esUltimoDiaDelMes()) {
            ArrayList<PapeletaDePago> papeletasEmpleadosFijos;
            papeletasEmpleadosFijos = Pagos.pagarFijos(fechaInicio, fechaActual);
            juntarPapeletas(papeletasDePago, papeletasEmpleadosFijos);
        }
        if (fechaDelSistema.esViernesPar()) {
            ArrayList<PapeletaDePago> papeletasEmpleadosConComision;
            fechaInicio.add(Calendar.DATE, -11);
            papeletasEmpleadosConComision = Pagos.pagarComisiones(fechaInicio, fechaActual);
            fechaInicio.add(Calendar.DATE, +11);
            juntarPapeletas(papeletasDePago, papeletasEmpleadosConComision);
        }
        return papeletasDePago;
    }

    private void juntarPapeletas(ArrayList<PapeletaDePago> papeletasDePago, ArrayList<PapeletaDePago> papeletasEmpleadosPorHora) {
        for(int i = 0; i < papeletasEmpleadosPorHora.size(); i++){
            papeletasDePago.add(papeletasEmpleadosPorHora.get(i));
        }
    }
}
