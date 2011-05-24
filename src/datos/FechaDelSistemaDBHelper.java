/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.util.Calendar;

/**
 *
 * @author Rolo
 */
public class FechaDelSistemaDBHelper {

    public Calendar getFechaDelSistema() {
        String consulta = "SELECT * FROM fecha_del_sistema WHERE id=1";
        System.out.println(consulta);
        Calendar fecha = Calendar.getInstance();
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            System.out.println(consulta);
            if (rs.next()) {
                fecha.set(rs.getInt("anio"), rs.getInt("mes"), rs.getInt("dia"));
            } else {
                fecha.set(2000, 1, 1);
                SqlConnection.ejecutar("INSERT INTO fecha_del_sistema (id, dia, mes, anio) VALUES ('1','1','1','2000')");
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return fecha;
    }

    public static void actualizarFecha(int dia, int mes, int anio) {
        String consulta = "UPDATE fecha_del_sistema SET dia='"+ dia +"', mes='"+ mes +"', anio='"+anio+"' WHERE id='1'";
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
