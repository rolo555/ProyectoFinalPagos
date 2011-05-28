/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Calendar;

public class PapeletaDePago {
    public int idEmpleado;
    public Calendar fechaInicio;
    public Calendar fechaFin;
    public double sueldoBruto;
    public double sueldoLiquido;
    public double AporteJubilacion;
    public double descuentoPorServicios;
    public PapeletaDePago( int idEmpleado, Calendar fechaIni,Calendar fechaFin, double sueldoBruto, double jubilacion, double descuento)
    {
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaIni;
        this.fechaFin = fechaFin;
        this.sueldoBruto = sueldoBruto;
        this.AporteJubilacion = jubilacion;
        this.descuentoPorServicios = descuento;
        this.sueldoLiquido = sueldoBruto-jubilacion-descuentoPorServicios;
    }
    public PapeletaDePago( int idEmpleado, Calendar fechaIni,Calendar fechaFin, double sueldoBruto)
    {
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaIni;
        this.fechaFin = fechaFin;
        this.sueldoBruto = sueldoBruto;
        this.sueldoLiquido = sueldoBruto;
        this.AporteJubilacion = -1;
    }
    public void enviarPorCorreo(String correo)
    {
        System.out.println("Enviando papeleta al correo: "+correo);
    }
    public void imprimir()
    {
        System.out.println("Imprimiendo Papeleta");
    }
    public boolean tieneDatosDeSindicato()
    {
        return (this.AporteJubilacion != -1);
    }

}
