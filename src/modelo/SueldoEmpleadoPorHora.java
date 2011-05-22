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
        double sueldo = 0;
        for (int i = 0; i < tarjetas.size(); i++) {
            sueldo += tarjetas.get(i).getHorasTrabajadas()*this.sueldoPorHora;
            sueldo += tarjetas.get(i).getHorasExtras()*1.5/100;
        }
        return sueldo;
    }

}
