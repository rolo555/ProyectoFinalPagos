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
public class EmpleadoFijo extends Empleado{

    public double getSueldo(Calendar fecha){
        return this.sueldoFijo;
    }
}
