package controlador;

import datos.EmpleadoDBHelper;
import datos.ServicioDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import modelo.Servicio;
import vista.VistaServicio;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class ControladorServicio {

    VistaServicio vistaServicio;

    public ControladorServicio(VistaServicio servicio) {
        this.vistaServicio = servicio;
    }

    public void llenarEmpleadosDelSindicato(JComboBox jComboBoxEmpleados) {
        ArrayList<String> empleadosDelSindicato = EmpleadoDBHelper.getStringEmpleadosDelSindicato();
        jComboBoxEmpleados.removeAllItems();
        for (String empleado : empleadosDelSindicato) {
            jComboBoxEmpleados.addItem(empleado);
        }
    }

    public void agregarServicio() {
        Servicio nuevoServicio;
        int idEmpleado = vistaServicio.getIdEmpleados();
        String descripcion = vistaServicio.getConcepto();
        Double monto = vistaServicio.getMonto();
        Calendar fecha = vistaServicio.getFecha();
        nuevoServicio = new Servicio(idEmpleado, descripcion, monto, fecha);
        ServicioDBHelper.guardarServicio(nuevoServicio);
    }
}
