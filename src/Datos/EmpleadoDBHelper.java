/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Empleado;



public class EmpleadoDBHelper {

    public static boolean setAporteJubilacion(int idEmpleado,double aporteJubilacion)
    {
       boolean exito = true;
        String consulta = "UPDATE empleado SET aporte_jubilacion = '"+aporteJubilacion+"' WHERE id_empleado = '"+idEmpleado+"' ) VALUES";
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
    public static ArrayList<String> getEmpleadosPorComision() {
        ArrayList<String> empleados = new ArrayList<String>();
        String consulta = "SELECT * FROM empleado WHERE aporte_jubilcacion = '-1' )";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {

             //   empleados.add(venta);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }
}
