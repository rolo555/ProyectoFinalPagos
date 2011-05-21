/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class EmpleadoPorHoras extends Empleado{
    private ArrayList<TarjetaDiaria> tarjetas = new ArrayList<TarjetaDiaria>();

    public void llenarTarjetaDiaria(Calendar fecha, int cantidadHoras)
    {
        TarjetaDiaria tarjeta = new TarjetaDiaria(this.idEmpleado, fecha, cantidadHoras);
        tarjeta.guardar();
    }

    public double getSueldo(Calendar fecha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
