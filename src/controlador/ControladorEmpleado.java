/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.RegistroEmpleadoDBHelper;
import modelo.Empleado;
import vista.RegistrarEmpleado;

/**
 *
 * @author HP
 */
public class ControladorEmpleado {
    RegistrarEmpleado registroEmpleado;
    //RegistroEmpleadoDBHelper registroHelper = new RegistroEmpleadoDBHelper();


    public ControladorEmpleado(RegistrarEmpleado registroEmpleado){
        this.registroEmpleado=registroEmpleado;
    }

    public static String registrarEmpleado(int idEmpleado,String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago){
        String mensaje = "";
        Empleado empleado = Empleado.FactoryEmpleado(tipoEmpleado);
        //empleado.setArgumentosDeEmpleado(idEmpleado, nombreCompleto, telefono, direccion, correo, sueldoFijo, formaDePago);
        //mensaje = empleado.guardar();
        //return mensaje;

        mensaje = RegistroEmpleadoDBHelper.registrarEmpleado(idEmpleado, tipoEmpleado, nombreCompleto, telefono, direccion, correo, sueldoFijo, formaDePago);
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
