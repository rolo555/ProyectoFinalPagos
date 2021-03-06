/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.Servicio;

/**
 *
 * @author HP
 */
public class ServicioDBHelper {

    public static boolean guardarServicio(Servicio servicio)
    {
        boolean exito = true;
        Date fecha=servicio.fecha.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String fechaString= sdf.format(fecha);
        String consulta = "INSERT INTO servicio (id_empleado, descripcion, monto, fecha) VALUES ('" + servicio.idEmpleado + "','" +  servicio.descripcionServicio + "','" + servicio.getMonto() + "', '"+fechaString+"')";
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
    public static ArrayList<Servicio> getServicios(Calendar fechaDelSistema, int idEmpleado) {
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fechaaux = fechaDelSistema.getTime();
        String fechaString= sdf.format(fechaaux);
        String consulta = "SELECT * FROM servicio WHERE id_empleado = '"+idEmpleado+"' AND julianday(fecha)>julianday('" + fechaString + "')";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                int idEmpl = rs.getInt("id_empleado");
                Date date = rs.getDate("fecha");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(date);
                String descripcion= rs.getString("descripcion");
                double monto = rs.getDouble("monto");
                Servicio servicio = new Servicio(idEmpl, descripcion,monto, fecha);
                servicios.add(servicio);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return servicios;
    }

}
