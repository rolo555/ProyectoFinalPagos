/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.VentasDBHelper;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Venta{

    int idEmpleado;
    Calendar fecha;
    double monto;
    
    public Venta(Calendar fecha, double monto, int idEmpleado){
        this.fecha = fecha;
        this.monto = monto;
        this.idEmpleado = idEmpleado;
    }

    public Calendar getFecha(){
        return this.fecha;
    }
    
    public double getMonto(){
        return this.monto;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public boolean guardar(){
        return VentasDBHelper.guardarVenta(this);
    }
}
