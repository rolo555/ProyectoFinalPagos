/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Controladores.SqlConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class EmpleadoFijo extends Empleado {

    private double porcentajeComision = -1;
    Comision comision;

    public EmpleadoFijo() {
        
    }
    public boolean tieneComision()
    {
        return porcentajeComision!=-1;
    }
    public double getPorcentajeComision()
    {
        return porcentajeComision;
    }
    public double getSueldo(Calendar fechaInicio, Calendar fechaFin) {
        return this.sueldoFijo;
    }

    public String guardar() {
        String consulta;
        if (this.porcentajeComision!= -1) {
            consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision)Values ('"+this.idEmpleado+"','" + this.nombreCompleto + "','" + this.telefono + "','" + this.direccion + "','"+ this.correoElectronico + "','" + this.formaDePago+"','" + this.sueldoFijo+"', '" + this.aporteJubilacion+"','" + this.sueldoFijo+"','"+Empleado.EmpleadoConComision+"', '"+this.porcentajeComision+"')";
        }else{
            consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado)Values ('"+this.idEmpleado+"','" + this.nombreCompleto + "','" + this.telefono + "','" + this.direccion + "','"+ this.correoElectronico + "','" + this.formaDePago+"','" + this.sueldoFijo+"', '" + this.aporteJubilacion+"','" + this.sueldoFijo+"','"+Empleado.EmpleadoFijo+"')";
        }
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
            System.out.println(consulta);
         } catch (Exception e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        return "Exito";
    }
}
