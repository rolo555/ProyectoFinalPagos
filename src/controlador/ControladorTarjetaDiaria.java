/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.EmpleadoDBHelper;
import datos.TarjetaDiariaDBHelper;
import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.TarjetaDiaria;
import vista.VistaTarjetaDiaria;

/**
 *
 * @author Rolo
 */
public class ControladorTarjetaDiaria {

    VistaTarjetaDiaria vistaTarjetaDiaria;

    public ControladorTarjetaDiaria(VistaTarjetaDiaria vistaTarjetaDiaria) {
        this.vistaTarjetaDiaria = vistaTarjetaDiaria;
    }

    public void llenarEmpleadosPorHora() {
        ArrayList<String> empleadosPorHora = EmpleadoDBHelper.getEmpleadosDelSindicato();
        vistaTarjetaDiaria.setEmpleados(empleadosPorHora);
    }

    public void modificar_opciones_dia() {
        int mes = vistaTarjetaDiaria.getMes();
        int anio = vistaTarjetaDiaria.getAnio();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, 5);
        int diaMaximo = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
        vistaTarjetaDiaria.llenar_opciones_dias(diaMaximo);
    }

    public void agregarTarjetaDiaria() {
        TarjetaDiaria tarjeta;
        int idEmpleado = vistaTarjetaDiaria.getIdEmpleado();
        Calendar fecha = vistaTarjetaDiaria.getFecha();
        int horaEntrada = vistaTarjetaDiaria.getHora();
        int minutoEntrada = vistaTarjetaDiaria.getMinuto();
        int horasTrabajadas = vistaTarjetaDiaria.getHorasTrabajadas();
        if(minutoEntrada > 30){
            horaEntrada++;
        }
        tarjeta = new TarjetaDiaria(idEmpleado, fecha, horasTrabajadas, horaEntrada);
        TarjetaDiariaDBHelper.guardarTarjetaDiaria(tarjeta);
    }

}
