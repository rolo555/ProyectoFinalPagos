/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author HP
 */
public class AporteJubilacion extends SueldoDecorador{
    private double aporte;
    public AporteJubilacion(double aporte, Sueldo sueldoDecorado)
    {

        this.aporte = aporte;
        this.sueldoDecorado = sueldoDecorado;
    }
    public double calcularSueldo() {
        return this.sueldoDecorado.calcularSueldo() - aporte;
    }

}
