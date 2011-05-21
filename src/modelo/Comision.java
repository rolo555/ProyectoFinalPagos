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
public class Comision extends Empleado
{
    double porcentajeComision = 10;
    public Comision(String idEmpleado)
    {
        this.idEmpleado = idEmpleado;
    }
    public ArrayList<Venta> getVentas(Calendar fecha)
    {
        ArrayList<Venta> ventas = null;
        //LLamar a datos
        return ventas;
    }
    public double getComision(Calendar fecha) {
        double montoVentas = 0;
        ArrayList<Venta> ventas = getVentas(fecha);
        for (int i = 0; i < ventas.size(); i++) {
            montoVentas += ventas.get(i).monto;
        }
        return montoVentas*porcentajeComision/100;
    }
    public double getSueldo(Calendar fecha) {
        return getComision(fecha);
    }

}
