/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import sun.security.jca.GetInstance;

/**
 *
 * @author HP
 */
public class FechaDelSistema {

    public static Calendar getFechaDelSistema() {
        String consulta = "SELECT * FROM fecha_del_sistema WHERE id='1'";
        Calendar fecha = Calendar.getInstance();
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
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
    private Calendar fechaActual;

    public FechaDelSistema(Calendar fecha) {
        this.fechaActual = fecha;
    }

    public void setFecha(int dia, int mes, int anio) {
        fechaActual.set(anio, mes, dia);
    }

    public boolean esViernes() {
        int dia = fechaActual.get(Calendar.DAY_OF_WEEK);
        return dia == 6;
    }

    public int getUltimoDiaHabilDelMes() {
        Calendar cal = fechaActual;//revisar metodo raro
        int ultimoDia = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        } else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -2);
        }
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    public boolean esUltimoDiaDelMes() {
        return getUltimoDiaHabilDelMes() == fechaActual.get(Calendar.DAY_OF_MONTH);
    }

    public void incrementarFecha() {
        this.fechaActual.roll(Calendar.DAY_OF_MONTH, true);
    }

    public boolean esViernesPar() {
        int contadorViernes = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(fechaActual.get(Calendar.YEAR), 0, 1);//revisar metodo raro
        int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
        for (int i = 0; cal.before(fechaActual); i++) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            if (cal.get(Calendar.DAY_OF_WEEK) == 5) {
                contadorViernes++;
            }
        }
        return contadorViernes % 2 == 0;
    }
}
