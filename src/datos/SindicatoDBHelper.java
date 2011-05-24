/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rolo
 */
public class SindicatoDBHelper {

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
