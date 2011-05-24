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
import modelo.Venta;

/**
 *
 * @author HP
 */
public class VentasDBHelper {

    public static ArrayList<Venta> getVentas(Calendar fechaInicio, Calendar fechaFin, int idEmpleado) {
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fechaIni = fechaInicio.getTime();
        Date fechaF = fechaFin.getTime();
        String fechaIniString= sdf.format(fechaIni);
        String fechaFinString= sdf.format(fechaF);
        String consulta = "SELECT * FROM venta WHERE id_empleado = '"+idEmpleado+"' AND julianday(fecha)>=julianday('" + fechaIniString + "') AND julianday(fecha)>=julianday('" + fechaFinString + "')";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                int idEmpl = rs.getInt("id_empleado");
                Date date = rs.getDate("fecha");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(date);
                double monto = rs.getDouble("monto");
                Venta venta = new Venta(fecha, monto, idEmpl);
                ventas.add(venta);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return ventas;
    }

    public static boolean guardarVenta(Venta venta) {
        boolean exito = true;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = venta.getFecha().getTime();
        String fechaString= sdf.format(fecha);
        String consulta = "INSERT INTO venta (id_empleado, fecha, monto) VALUES ('" + venta.getIdEmpleado() + "','" + fechaString + "','" + venta.getMonto() + "')";
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
