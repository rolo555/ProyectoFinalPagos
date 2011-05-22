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
    Calendar fechaInicio;
    Calendar fechaFin;
    double sueldoBruto;
    double sueldoLiquido;
    double AporteJubilacion;
    double descuentoPorServicios;
    public PapeletaDePago( String idEmpleado, Calendar fechaIni,Calendar fechaFin, double sueldoBruto, double jubilacion, double descuento)
    {
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaIni;
        this.fechaFin = fechaFin;
        this.sueldoBruto = sueldoBruto;
        this.AporteJubilacion = jubilacion;
        this.descuentoPorServicios = descuento;
        this.sueldoLiquido = sueldoBruto-jubilacion-descuentoPorServicios;
    }
    public PapeletaDePago( String idEmpleado, Calendar fechaIni,Calendar fechaFin, double sueldoBruto)
    {
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaIni;
        this.fechaFin = fechaFin;
        this.sueldoBruto = sueldoBruto;
        this.sueldoLiquido = sueldoBruto;
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
