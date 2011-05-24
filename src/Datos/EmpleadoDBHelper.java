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
    public static ArrayList<Empleado> getEmpleadosPorComision() {
        ArrayList<Empleado> ventas = new ArrayList<Empleado>();
        String consulta = "SELECT * FROM empleado WHERE )";
        try {
        /*    SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {

                Empleado venta = new EmpleadoPorHoras();
                ventas.add(venta);
            }*/
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return ventas;
    }

    public ArrayList<String> getEmpleadosSinSindicato(){
        ArrayList<String> empleadosSinSindicato = new ArrayList<String>();
        String consulta = "SELECT id, nombre_completo FROM empleado WHERE aporte_jubilacion = '-1'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            String idNombre;
            String id;
            String nombre;
            while (rs.next()) {
                id = String.valueOf(rs.getInt("id"));
                nombre = rs.getString("nombre_completo");
                idNombre = id + "-" + nombre;
                empleadosSinSindicato.add(idNombre);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return empleadosSinSindicato;
    }
}
