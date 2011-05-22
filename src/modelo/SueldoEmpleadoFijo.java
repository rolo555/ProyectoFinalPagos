/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class SueldoEmpleadoFijo extends Sueldo{

    public SueldoEmpleadoFijo(String idEmpleado, double sueldoFijo, Calendar fecha)
    {
        this.idEmpleado = idEmpleado;
        this.sueldoBruto = sueldoFijo;
        this.fecha = fecha;
    }
    public double getSueldoBruto()
    {
        return sueldoBruto;
    }
    public double calcularSueldo() {
       return sueldoBruto;
    }
}
