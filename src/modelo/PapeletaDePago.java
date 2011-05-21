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
public class PapeletaDePago {
    String idEmpleado;
    Calendar fecha;
    double sueldoLiquido;
    double montoPagado;
    double AporteJubilacion;
    double comisionPorVentas;
    double descuentoPorCargosAlSindicato;
    public PapeletaDePago( String idEmpleado, Calendar fecha, double sueldoLiquido, double montoPagado, double jubilacion, double comisionPorVentas, double descuento)
    {
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.sueldoLiquido= sueldoLiquido;
        this.montoPagado = montoPagado;
        this.AporteJubilacion = jubilacion;
        this.descuentoPorCargosAlSindicato = descuento;
        this.comisionPorVentas = comisionPorVentas;
    }
    public PapeletaDePago( String idEmpleado, Calendar fecha, double sueldoLiquido, double montoPagado)
    {
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.sueldoLiquido= sueldoLiquido;
        this.montoPagado = montoPagado;
    }
    public PapeletaDePago( String idEmpleado, Calendar fecha, double sueldoLiquido)
    {
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.sueldoLiquido= sueldoLiquido;
        this.montoPagado = sueldoLiquido;
    }

    public PapeletaDePago(String idEmpleado, Calendar fecha, double sueldo, double montoPagado, double aporte, double cargos) {

    }
    public void enviarPorCorreo(String correo)
    {
        System.out.println("Enviando papeleta al correo: "+correo);
    }
    public void imprimir()
    {
        System.out.println("Imprimiendo Papeleta");
    }

}
