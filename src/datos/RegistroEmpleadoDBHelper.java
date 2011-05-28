/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Calendar;

/**
 *
 * @author joaco
 */
public class RegistroEmpleadoDBHelper {

    public static void registrarEmpleado(int idEmpleado, String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago, String destinoPago, double porcentajeComision) {
        String consulta = "INSERT INTO empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision,direccion_de_pago) VALUES ('" + idEmpleado + "','" + nombreCompleto + "','" + telefono + "','" + direccion + "','" + correo + "','" + formaDePago + "','" + sueldoFijo + "', '-1.0','" + tipoEmpleado + "','" + porcentajeComision + "','" + destinoPago + "')";
        System.out.println("consulta:" + consulta);
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
