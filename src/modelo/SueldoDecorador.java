/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author HP
 */
public abstract class SueldoDecorador extends Sueldo{
    protected Sueldo sueldoDecorado;
    public abstract double calcularSueldo();

}
