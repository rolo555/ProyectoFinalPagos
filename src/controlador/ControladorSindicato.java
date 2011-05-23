/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author Rolo
 */
public class ControladorSindicato {

    public static List<Empleado> getListaEmpleadosSinSindicato() {
        List<Empleado> empleadosSinSindicato = new ArrayList<Empleado>();
        String consulta = "SELECT id, nombre_completo FROM empleado WHERE aporte_jubilacion = '-1'";
        Empleado empleado = null;
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre_completo"));
                empleadosSinSindicato.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return empleadosSinSindicato;
    }

}
