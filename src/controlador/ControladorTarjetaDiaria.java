package controlador;

import datos.EmpleadoDBHelper;
import datos.TarjetaDiariaDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import modelo.TarjetaDiaria;
import vista.VistaTarjetaDiaria;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class ControladorTarjetaDiaria {

    VistaTarjetaDiaria vistaTarjetaDiaria;

    public ControladorTarjetaDiaria(VistaTarjetaDiaria vistaTarjetaDiaria) {
        this.vistaTarjetaDiaria = vistaTarjetaDiaria;
    }

    public void agregarTarjetaDiaria() {
        TarjetaDiaria tarjeta;
        int idEmpleado = vistaTarjetaDiaria.getIdEmpleado();
        Calendar fecha = vistaTarjetaDiaria.getFecha();
        int horaEntrada = vistaTarjetaDiaria.getHora();
        int minutoEntrada = vistaTarjetaDiaria.getMinuto();
        int horasTrabajadas = vistaTarjetaDiaria.getHorasTrabajadas();
        if (minutoEntrada > 30) {
            horaEntrada++;
        }
        tarjeta = new TarjetaDiaria(idEmpleado, fecha, horasTrabajadas, horaEntrada);
        TarjetaDiariaDBHelper.guardarTarjetaDiaria(tarjeta);
    }

    public void llenarEmpleadosPorHora(JComboBox jComboBoxEmpleados) {
        ArrayList<String> empleadosPorHora = EmpleadoDBHelper.getStringEmpleadosPorHora();
        jComboBoxEmpleados.removeAllItems();
        for (String empleado : empleadosPorHora) {
            jComboBoxEmpleados.addItem(empleado);
        }
    }
}
