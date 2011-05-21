/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public class SueldoEmpleadoPorHora extends Sueldo{
    private double sueldoPorHora;
    private ArrayList<TarjetaDiaria> tarjetas;
    public SueldoEmpleadoPorHora(String idEmpleado, double sueldoPorHora, Calendar fecha, ArrayList<TarjetaDiaria> tarjetas)
    {
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.sueldoPorHora = sueldoPorHora;
        this.tarjetas = tarjetas;
    }
    public double calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
