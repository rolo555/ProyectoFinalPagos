/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.Venta;

/**
 *
 * @author HP
 */
public class VentasDBHelper {

    public static ArrayList<Venta> getVentas(Calendar fechaInicio, Calendar fechaFin) {
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        String consulta = "SELECT * FROM venta WHERE julianday(fecha)>=julianday('" + fechaInicio.toString() + "') AND julianday(fecha)>=julianday('" + fechaFin.toString() + "')";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                int idEmpleado = rs.getInt("id_empleado");
                Date date = rs.getDate("fecha");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(date);
                double monto = rs.getDouble("monto");
                Venta venta = new Venta(fecha, monto, idEmpleado);
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

        String consulta = "INSERT INTO venta (id_empleado, fecha, monto) VALUES ('" + venta.getIdEmpleado() + "','" + venta.getFecha() + "','" + venta.getMonto() + "')";
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
