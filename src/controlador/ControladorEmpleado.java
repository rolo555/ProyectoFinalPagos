/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.Empleado;

/**
 *
 * @author HP
 */
public class ControladorEmpleado {
    public static String registrarEmpleado(String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago)
    {
        String mensaje = "";
        Empleado empleado = Empleado.FactoryEmpleado(tipoEmpleado);
        empleado.setArgumentosDeEmpleado(1, nombreCompleto, telefono, direccion, correo, sueldoFijo, formaDePago);
        mensaje = empleado.guardar();
        return mensaje;
    }
    public static String validarDatos(String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago)
    {
        String mensaje = "";
        if (!(tipoEmpleado.equals(Empleado.EmpleadoFijo)||tipoEmpleado.equals(Empleado.EmpleadoPorHora))) {
            mensaje += "Tipo de empleado incorrecto. \n";
        }
        if (nombreCompleto.isEmpty()){
            mensaje += "El nombre de empleado no puede ser vacio \n";
        }
        return mensaje;
    }
}
