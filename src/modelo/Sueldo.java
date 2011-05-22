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
public abstract class Sueldo {
    protected String idEmpleado;
    protected Calendar fecha;
    protected double sueldoLiquido;
    protected double sueldoBruto;
    public abstract double calcularSueldo();
}
