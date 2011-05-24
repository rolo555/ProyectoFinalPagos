/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Calendar;
import modelo.PapeletaDePago;

/**
 *
 * @author HP
 */
public class PagosDBHelper {

     public static boolean registrarPago(PapeletaDePago pago)
    {
        int idEmpleado = pago.idEmpleado;
        Calendar fechaIni = pago.fechaInicio;
        Calendar fechaFin = pago.fechaFin;
        double sueldoBr = pago.sueldoBruto;
        double sueldoLiq = pago.sueldoLiquido;
        String consulta = "INSERT INTO papeleta (id_empleado,fecha_inicio,fecha_fin,sueldo_bruto,sueldo_liquido) VALUES ('"+idEmpleado+"', '"+fechaIni+"','"+fechaFin+"', '"+sueldoBr+"', , '"+sueldoLiq+"')";
        if (pago.tieneDatosDeSindicato()) {
            double aporte = pago.AporteJubilacion;
            double descuento = pago.descuentoPorServicios;
            consulta = "INSERT INTO papeleta (id_empleado,fecha_inicio,fecha_fin,sueldo_bruto,sueldo_liquido, aporte_jubilacion,descuento_servicios) VALUES ('"+idEmpleado+"', '"+fechaIni+"','"+fechaFin+"', '"+sueldoBr+"', , '"+sueldoLiq+"','"+aporte+"','"+descuento+"')";
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
