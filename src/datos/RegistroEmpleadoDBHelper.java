/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author joaco
 */
public class RegistroEmpleadoDBHelper {

     public static String registrarEmpleado(int idEmpleado,String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago){
        String consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision)Values ('" + idEmpleado + "','" + nombreCompleto + "','" + telefono + "','" + direccion + "','"+ correo + "','" + formaDePago+"','" + sueldoFijo+"', -1,'"+tipoEmpleado+"', -1)";
        //consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision)Values ('" + this.idEmpleado + "','" + this.nombreCompleto + "','" + this.telefono + "','" + this.direccion + "','"+ this.correoElectronico + "','" + this.formaDePago+"','" + this.sueldoFijo+"', '" + this.aporteJubilacion+"','"+Empleado.EmpleadoConComision+"', '"+this.porcentajeComision+"')";
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
