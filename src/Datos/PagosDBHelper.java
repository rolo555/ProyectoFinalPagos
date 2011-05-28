/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import modelo.PapeletaDePago;

/**
 *
 * @author HP
 */
public class PagosDBHelper {

     public static boolean registrarPago(PapeletaDePago pago)
    {
        int idEmpleado = pago.idEmpleado;
        Date fechaIni = pago.fechaInicio.getTime();
        Date fechaFin = pago.fechaFin.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String fechaIniString= sdf.format(fechaIni);
        String fechaFinString= sdf.format(fechaFin);
        double sueldoBr = pago.sueldoBruto;
        double sueldoLiq = pago.sueldoLiquido;
        String consulta = "INSERT INTO papeleta_de_pago (id_empleado,fecha_inicio,fecha_fin,sueldo_bruto,sueldo_liquido) VALUES ('"+idEmpleado+"', '"+fechaIniString+"','"+fechaFinString+"', '"+sueldoBr+"', '"+sueldoLiq+"')";
        if (pago.tieneDatosDeSindicato()) {
            double aporte = pago.AporteJubilacion;
            double descuento = pago.descuentoPorServicios;
            consulta = "INSERT INTO papeleta_de_pago (id_empleado,fecha_inicio,fecha_fin,sueldo_bruto,sueldo_liquido, aporte_jubilacion,descuento_servicios) VALUES ('"+idEmpleado+"', '"+fechaIniString+"','"+fechaFinString+"', '"+sueldoBr+"', '"+sueldoLiq+"','"+aporte+"','"+descuento+"')";
        }
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
            return true;
        } catch (Exception e) {
            System.out.printf(e.getMessage());
            return false;
        }
    }
}
