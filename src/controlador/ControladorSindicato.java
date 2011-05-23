/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rolo
 */
public class ControladorSindicato {

    public static List<Integer> getListaEmpleadosSinSindicato() {
        List<Integer> empleadosSinSindicato = new ArrayList<Integer>();
        String consulta = "SELECT id FROM empleado WHERE aporte_jubilacion = '-1'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                empleadosSinSindicato.add(rs.getInt("id"));
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return empleadosSinSindicato;
    }

}
