/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;



public class EmpleadoDBHelper {

    public static boolean agregarAlSindicato(int idEmpleado,double aporteJubilacion)
    {
       boolean exito = true;
        String consulta = "INSERT INTO venta (id_empleado, fecha, monto) VALUES";
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
            exito = false;
        }
        return exito;
    }
}
