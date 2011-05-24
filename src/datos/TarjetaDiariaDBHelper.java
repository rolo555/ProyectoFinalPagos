/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.TarjetaDiaria;

/**
 *
 * @author HP
 */
public class TarjetaDiariaDBHelper {
     public static boolean guardarTarjetaDiaria(TarjetaDiaria tarjeta)
    {
        boolean exito = true;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = tarjeta.getFecha().getTime();
        String fechaString= sdf.format(fecha);
        String consulta = "INSERT INTO tarjeta_diaria (id_empleado, fecha, horas_trabajadas, hora_entrada) VALUES ('" + tarjeta.getIdEmpleado() + "','" +  fechaString + "','" + tarjeta.getHorasTrabajadas() + "', '"+tarjeta.getHoraEntrada()+"')";
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
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fechaIni = fechaInicio.getTime();
        Date fechaF = fechaFin.getTime();
        String fechaIniString= sdf.format(fechaIni);
        String fechaFinString= sdf.format(fechaF);
        String consulta = "SELECT * FROM servicio WHERE id_empleado = '"+idEmpleado+"' AND julianday(fecha)>=julianday('" + fechaIniString + "')AND julianday(fecha)<=julianday('" + fechaFinString+ "')";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                int idEmpl = rs.getInt("id_empleado");
                Date date = rs.getDate("fecha");
                int horaEntrada = rs.getInt("hora_entrada");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(date);
                int horasTrabajadas = rs.getInt("horas_trabajadas");
                TarjetaDiaria servicio = new TarjetaDiaria(idEmpl,fecha,horasTrabajadas, horaEntrada);
                servicios.add(servicio);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return servicios;
    }

}
