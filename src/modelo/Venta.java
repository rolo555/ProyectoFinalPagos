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
public class Venta{

    String idEmpleado;
    Calendar fecha;
    double monto;
    
    public Venta(Calendar fecha, double monto, String idEmpleado)
    {
        this.fecha = fecha;
        this.monto = monto;
        this.idEmpleado = idEmpleado;
    }

    public Calendar getFecha()
    {
        return this.fecha;
    }
    public double getSueldo()
    {
        return this.monto;
    }
}
