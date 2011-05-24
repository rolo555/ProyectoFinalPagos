/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.TarjetaDiaria;

/**
 *
 * @author HP
 */
public class TarjetaDiariaDBHelper {
     public static boolean guardarServicio(TarjetaDiaria tarjeta)
    {
        boolean exito = true;
        String consulta = "INSERT INTO tarjeta_diaria (id_empleado, fecha, horas_trabajadas) VALUES ('" + tarjeta.getIdEmpleado() + "','" +  tarjeta.getFecha() + "','" + tarjeta.getHorasTrabajadas() + "')";
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
    public static ArrayList<TarjetaDiaria> getTarjetasDiarias(Calendar fechaInicio, Calendar fechaFin, int idEmpleado) {
        ArrayList<TarjetaDiaria> servicios = new ArrayList<TarjetaDiaria>();
        String consulta = "SELECT * FROM servicio WHERE id_empleado = '"+idEmpleado+"' AND julianday(fecha)>=julianday('" + fechaInicio.toString() + "')AND julianday(fecha)<=julianday('" + fechaFin.toString() + "')";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                int idEmpl = rs.getInt("id_empleado");
                Date date = rs.getDate("fecha");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(date);
                int horasTrabajadas = rs.getInt("horas_trabajadas");
                TarjetaDiaria servicio = new TarjetaDiaria(idEmpl,fecha,horasTrabajadas);
                servicios.add(servicio);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return servicios;
    }

}