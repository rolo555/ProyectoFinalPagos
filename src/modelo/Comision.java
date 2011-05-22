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
public class Comision
{
    private String idEmpleado;
    double porcentajeComision;
    public Comision(String idEmpleado,double porcentajeComision)
    {
        this.idEmpleado = idEmpleado;
        this.porcentajeComision = porcentajeComision;
    }
    public ArrayList<Venta> getVentas(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Venta> ventas = null;
        //LLamar a datos
        return ventas;
    }
    public double getComision(Calendar fechaInicio, Calendar fechaFin) {
        double montoVentas = 0;
        ArrayList<Venta> ventas = getVentas(fechaInicio, fechaFin);
        for (int i = 0; i < ventas.size(); i++) {
            montoVentas += ventas.get(i).monto;
        }
        return montoVentas*porcentajeComision/100;
    }

}
